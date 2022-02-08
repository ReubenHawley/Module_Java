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
        window.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
        window.setBounds(0, 0, 400, 400);
        window.setTitle("GuiApplicatie");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        Dimension d = new Dimension(50, 50);

        JLabel oost = new JLabel("oost");
        oost.setOpaque(true);
        oost.setBackground(Color.RED); // import java.awt.Color;
//        oost.setBounds(40, 80, 30, 80);
        oost.setPreferredSize(d);
        window.add(oost);

        JLabel west = new JLabel("west");
        west.setOpaque(true);
        west.setBackground(Color.CYAN); // import java.awt.Color;
//        west.setBounds(10, 80, 30, 80);
        window.add(west);

        JLabel centrum = new JLabel("centrum");
        centrum.setOpaque(true);
        centrum.setBackground(Color.ORANGE); // import java.awt.Color;
//        oost.setBounds(40, 80, 30, 80);
        centrum.setPreferredSize(d);
        window.add(centrum);

        JLabel noord = new JLabel("noord");
        noord.setOpaque(true);
        noord.setBackground(Color.GREEN); // import java.awt.Color;
//        noord.setBounds(10, 20, 60, 80);
        window.add(noord);

        JLabel zuid = new JLabel("zuid");
        zuid.setOpaque(true);
        zuid.setBackground(Color.YELLOW); // import java.awt.Color;
//        zuid.setBounds(10, 160, 60, 80);
        window.add(zuid);
    }
}
