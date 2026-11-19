package app;

import javax.swing.JFrame;

public class ClassExtJFrame extends JFrame{
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
        frame.setVisible(true);
        
    }
    
    
}
