import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = ((SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE);
    static final int DELAY = 75;
    final int coordinatesX[] = new int[GAME_UNITS];
    final int coordinatesY[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {

        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {

        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics graphics) {

        super.paintComponent(graphics);
        draw(graphics);
    }

    public void draw(Graphics graphics) {

        if (running){

            for (int gridIndex = 0; gridIndex < (SCREEN_HEIGHT / UNIT_SIZE); gridIndex++) {
                graphics.drawLine(gridIndex * UNIT_SIZE, 0, gridIndex * UNIT_SIZE, SCREEN_HEIGHT);
                graphics.drawLine(0, gridIndex * UNIT_SIZE, SCREEN_WIDTH, gridIndex * UNIT_SIZE);
            }

            graphics.setColor(Color.red);
            graphics.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for (int snakePixels = 0; snakePixels < bodyParts; snakePixels++) {

                if (snakePixels == 0) {
                    graphics.setColor(Color.green);
                    graphics.fillRect(coordinatesX[snakePixels], coordinatesY[snakePixels], UNIT_SIZE, UNIT_SIZE);
                } else {
                    //graphics.setColor(new Color(45, 180, 0));
                    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                    graphics.fillRect(coordinatesX[snakePixels], coordinatesY[snakePixels], UNIT_SIZE, UNIT_SIZE);
                }
            }

            // TODO: Criar um método para o Score, porque é chamado aqui e no gameOver();

            graphics.setColor(Color.red);
            graphics.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(graphics.getFont());
            graphics.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten))/2, graphics.getFont().getSize());
        } else {
            gameOver(graphics);
        }

    }

    public void newApple() {

        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    public void move() {

        for (int i = bodyParts; i > 0; i--) {

            coordinatesX[i] = coordinatesX[i - 1];
            coordinatesY[i] = coordinatesY[i - 1];
        }

        switch (direction) {
            case 'U':
                coordinatesY[0] = coordinatesY[0] - UNIT_SIZE;
                break;
            case 'D':
                coordinatesY[0] = coordinatesY[0] + UNIT_SIZE;
                break;
            case 'L':
                coordinatesX[0] = coordinatesX[0] - UNIT_SIZE;
                break;
            case 'R':
                coordinatesX[0] = coordinatesX[0] + UNIT_SIZE;
                break;
        }
    }

    public void checkApple() {

        if ((coordinatesX[0] == appleX) && (coordinatesY[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }

    }

    public void checkCollisions() {

        // Check if head collides with body
        for (int bodyPixels = bodyParts; bodyPixels > 0; bodyPixels--) {

            if((coordinatesX[0] == coordinatesX[bodyPixels]) && (coordinatesY[0] == coordinatesY[bodyPixels])) {

                running = false;
            }
        }
        // TODO: Criar variável com as coordenadas da cabeça
        // TODO: Simplificar a verificação abaixo

        // Check if head touches left border
        if (coordinatesX[0] < 0) {
            running = false;
        }

        // Check if head touches right border
        if (coordinatesX[0] > SCREEN_WIDTH) {
            running = false;
        }

        // Check if head touches top border
        if (coordinatesY[0] < 0) {
            running = false;
        }

        // Check if head touches bottom border
        if (coordinatesY[0] > SCREEN_HEIGHT) {
            running = false;
        }

        if (!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics graphics) {

        graphics.setColor(Color.red);
        graphics.setFont(new Font("Ink Free", Font.BOLD, 40));
        FontMetrics metricsScore = getFontMetrics(graphics.getFont());
        graphics.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metricsScore.stringWidth("Score: " + applesEaten))/2, graphics.getFont().getSize());

        graphics.setColor(Color.red);
        graphics.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metricsGameOver = getFontMetrics(graphics.getFont());
        graphics.drawString("Game Over", (SCREEN_WIDTH - metricsGameOver.stringWidth("Game Over"))/2, (SCREEN_HEIGHT / 2));
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (running) {

            move();
            checkApple();
            checkCollisions();
        }

        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event){

            switch (event.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}
