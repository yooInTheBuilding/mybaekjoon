package practice_alone;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class HeartFrame extends JFrame {
    public HeartFrame() {
        setContentPane(new DrawPane());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    class DrawPane extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.RED);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Path2D path = new Path2D.Double();
            path.moveTo(250, 200);
            path.curveTo(350, 100, 450, 300, 250, 400);
            path.curveTo(50, 300, 150, 100, 250, 200);
            path.closePath();

            g2.fill(path);
        }
    }

    public static void main(String[] args) {
        new HeartFrame();
    }
}