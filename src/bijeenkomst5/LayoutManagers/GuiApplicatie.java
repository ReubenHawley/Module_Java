package bijeenkomst5.LayoutManagers;

import javax.swing.*;
import java.awt.*;

public class GuiApplicatie extends JFrame {
    private JLabel oost;
    private JLabel west;
    private JLabel noord;
    private JLabel zuid;

    GuiApplicatie() {
        JFrame window = new JFrame();
        window.setLayout(new GridLayout(2,3,5,10));
        window.setBounds(0, 0, 400, 400);
        window.setTitle("GuiApplicatie");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        Dimension d = new Dimension(50, 50);

        JLabel oost = new JLabel("oost");
        oost.setOpaque(true);
        oost.setBackground(Color.RED); // import java.awt.Color;
        oost.setPreferredSize(d);
        window.add(oost);

        JLabel west = new JLabel("west");
        west.setOpaque(true);
        west.setBackground(Color.CYAN); // import java.awt.Color;
        window.add(west);

        JLabel centrum = new JLabel("centrum");
        centrum.setOpaque(true);
        centrum.setBackground(Color.ORANGE); // import java.awt.Color;
        centrum.setPreferredSize(d);
        window.add(centrum);

        JLabel noord = new JLabel("noord");
        noord.setOpaque(true);
        noord.setBackground(Color.GREEN); // import java.awt.Color;
        window.add(noord);

        JLabel zuid = new JLabel("zuid");
        zuid.setOpaque(true);
        zuid.setBackground(Color.YELLOW); // import java.awt.Color;
        Dimension southD = new Dimension(400,200);
        zuid.setPreferredSize(southD);
        window.add(zuid);

    }
}
