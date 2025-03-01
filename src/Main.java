package packages.src;

import javax.swing.*;
import packages.src.packages.*;
import java.awt.*;


public class Main {

        static class CustomFont {
            private Font font;

            public CustomFont() {
                this.font = new Font("Arial", Font.BOLD, 14);
            }

            public Font getFont() {
                return font;
            }

            public void setFont(Font font) {
                this.font = font;
            }
        }


        public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("poll form");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.YELLOW);
        panel.setBounds(0, 0, 600, 600);

        CustomFont customFont = new CustomFont();

        // Create title label
        JLabel title = new JLabel("poll form");
        title.setBounds(10, 10, 100, 20);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);
        title.setFont(customFont.getFont());

        // Create start button
        JButton startButton = new JButton("start!");
        startButton.setBounds(10, 40, 100, 20);
        startButton.setHorizontalAlignment(SwingConstants.CENTER);
        startButton.setVerticalAlignment(SwingConstants.CENTER);
        startButton.setFont(customFont.getFont());

        // Add components to the panel
        panel.add(title, BorderLayout.NORTH);
        panel.add(startButton, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
