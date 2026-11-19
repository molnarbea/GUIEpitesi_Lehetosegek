package app;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NewClass {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("GUI kódból");
                frame.setVisible(true);
                frame.setSize(320, 240);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
