import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Tutorial : https://www.youtube.com/watch?v=5o3fMLPY7qY
// By: Alex Lee | 10-08-2021 | Henrique Matheus Alves Pereira
public class GUI implements ActionListener {

    private int explosionsCount = 0;
    private JFrame guiFrame;
    private JLabel explosionLabel;
    private JPanel guiPanel;

    public GUI() {
        guiFrame = new JFrame();

        JButton explosionButton = new JButton(" Clique aqui para explodir 🧨 ");
        explosionButton.addActionListener(this);

        explosionLabel = new JLabel("Número de explosões: 0");

        guiPanel = new JPanel();
        guiPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        guiPanel.setLayout(new GridLayout(0,1));
        guiPanel.add(explosionButton);
        guiPanel.add(explosionLabel);

        guiFrame.add(guiPanel, BorderLayout.CENTER);
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("GUI Explosiva 🔥");
        guiFrame.pack();
        guiFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        explosionsCount++;
        explosionLabel.setText("Número de explosões: " + explosionsCount);
    }
}
