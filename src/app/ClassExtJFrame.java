package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClassExtJFrame extends JFrame {

    private JFrame frame;

    public ClassExtJFrame() {
        /*ha nincs adattag a this már egy jframe
        this.setTitle("");
        
        this.setVisible(true);
        this.setSize(320, 240);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

        frame = new JFrame("Class extends JFrame");
        frame.setSize(320, 240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Katt ide");
        frame.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "klikkeltél");
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
