import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class main {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Genshin Ranked");
        // Close frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create components and put them in the frame
        JLabel emptyLabel = new JLabel();
        emptyLabel.setPreferredSize(new Dimension(200, 100));
        emptyLabel.setBackground(Color.WHITE);
        emptyLabel.setOpaque(true);

        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        // Size the frame
        frame.setSize(300, 200);

        // Show it
        frame.setVisible(true);

    }
}