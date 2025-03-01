package packages;

import javax.swing.*;

public class thankYouPage {
    Font font = new Font("Arian", Font.BOLD, 14);

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thanks for your participation!");

        thankYouLabel.setFont(font);
        thankYouLabel.setBounds(10, 10, 200, 20);

        // Add components to the panel
        panel.add(thankYouLabel);

        // Add panel to the frame
        frame.add(panel);


    }


}
