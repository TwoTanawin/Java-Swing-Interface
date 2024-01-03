import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    MyFrame(){

//        JFrame frame = new JFrame();

        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminal application
//        frame.setResizable(false); // fix application size
        this.setSize(420, 420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("images/ChatGPT_logo.png");
        this.setIconImage(image.getImage());   // change icon application
        this.getContentPane().setBackground(new Color(178,102,255)); // change frame backgound color
    }
}
