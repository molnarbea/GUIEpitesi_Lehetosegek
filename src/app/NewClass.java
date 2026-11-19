package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class NewClass {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("GUI kódból");
                
                frame.setSize(320, 240);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JButton btn = new JButton("Katt ide");
                frame.add(btn);
                btn.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JOptionPane.showMessageDialog(null, "klikkeltél");
                    }
                });
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
