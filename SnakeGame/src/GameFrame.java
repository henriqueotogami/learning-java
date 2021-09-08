import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame() {

        GamePanel gamePanel = new GamePanel();

        this.add(gamePanel);
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
