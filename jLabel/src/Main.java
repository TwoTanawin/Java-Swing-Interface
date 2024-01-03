import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        ImageIcon image = new ImageIcon("images/Duke_waving.svg.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();

        label.setText("Bro, do even code?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set Horizontal position of text
        label.setVerticalTextPosition(JLabel.TOP); // set Vertical position of text
        label.setForeground(new Color(178,102,255)); // set text color
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of text
        label.setIconTextGap(-25); // set gap of text and images
        label.setBackground(Color.yellow); // set background text
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of text+images within label
        label.setHorizontalTextPosition(JLabel.CENTER); // set Horizontal position of text+images within label
//        label.setBounds(100,100,350,350); // set x and y within frame as well as dimensions

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}