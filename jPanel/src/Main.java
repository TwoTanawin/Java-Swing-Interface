import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        ImageIcon icon = new ImageIcon("Duke_waving.svg.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setHorizontalTextPosition(JLabel.RIGHT);
//        label.setBounds(0,0,75,75);

        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        redPanel.setBackground(Color.red); // set panel colors
        redPanel.setBounds(0, 0, 250, 250); // set panel bounds
//        redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        redPanel.setLayout(null);

        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(label);
        redPanel.add(label);
//        bluePanel.add(label);
        greenPanel.add(label); // add label to panel
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}