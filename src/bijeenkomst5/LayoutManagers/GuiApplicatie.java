package bijeenkomst5.LayoutManagers;

import javax.swing.*;
import java.awt.*;

public class GuiApplicatie extends JFrame {
    private JLabel oost;

    GuiApplicatie() {
        JFrame window = new JFrame();
        window.setLayout(null);
        window.setBounds(0, 0, 400, 400);
        window.setTitle("GuiApplicatie");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        JLabel oost = new JLabel("oost");
        oost.setOpaque(true);
        oost.setBackground(Color.RED); // import java.awt.Color;
        oost.setBounds(10, 20, 30, 80);
        window.add(oost);
    }
}
