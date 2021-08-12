import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeys {

    public ArrowKeys() {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);

        JPanel panel        = new JPanel();
        JLabel upArrow      = new JLabel();
        JLabel downArrow    = new JLabel();
        JLabel leftArrow    = new JLabel();
        JLabel rightArrow   = new JLabel();

        panel.add(upArrow);
        panel.add(downArrow);
        panel.add(leftArrow);
        panel.add(rightArrow);

        frame.addKeyListener(new KeyListener() {

            int upArrowCount    = 0;
            int downArrowCount  = 0;
            int leftArrowCount  = 0;
            int rightArrowCount = 0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        upArrow.setText("Up: " + Integer.toString(upArrowCount++));
                        break;
                    case KeyEvent.VK_DOWN:
                        downArrow.setText("Down: " + Integer.toString(downArrowCount++));
                        break;
                    case KeyEvent.VK_LEFT:
                        leftArrow.setText("Left: " + Integer.toString(leftArrowCount++));
                        break;
                    case KeyEvent.VK_RIGHT:
                        rightArrow.setText("Right: " + Integer.toString(rightArrowCount++));
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        frame.add(panel);

        upArrow.setText("Up: 0");
        downArrow.setText("Down: 0");
        leftArrow.setText("Left: 0");
        rightArrow.setText("Right: 0");
    }

    public static void main(String[] args) {

        new ArrowKeys();
    }

}
