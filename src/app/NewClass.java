package app;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.security.auth.x500.X500Principal;
import javax.swing.Box;
import javax.swing.BoxLayout;
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
                
                JButton btn1 = new JButton("Gomb1");
                //frame.setLayout(new FlowLayout());
                //frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
                frame.setLayout(new GridLayout(0,3,5,5));
                
                frame.add(btn1);
                
                //frame.add(Box.createHorizontalGlue());
                
                btn1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JOptionPane.showMessageDialog(null, "klikkeltél");
                    }
                });
                
                
                
                JButton btn2 = new JButton("Gomb2");
                frame.add(btn2);
                
                JButton btn3 = new JButton("Gomb3");
                frame.add(btn3);
                
                JButton btn4 = new JButton("Gomb4");
                frame.add(btn4);
                
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
