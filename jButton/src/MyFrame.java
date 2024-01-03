import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button; // set to gobol
    JLabel label;

    MyFrame(){

        ImageIcon image = new ImageIcon("Duke_waving.svg.png");
        ImageIcon image2 = new ImageIcon("aq.jpg");

        label = new JLabel();
        label.setIcon(image2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 50, 250, 400);
        button.addActionListener(this);
//        button.addActionListener(e -> System.out.println("Bro"));
        button.addActionListener(e -> System.out.println("Bro"));
        button.setText("Click ME");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.yellow);
        button.setBackground(new Color(178, 102, 255));
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false); // enable button

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            button.setVisible(false);
            label.setVisible(true);
        }
        else{
            button.setVisible(true);
            label.setVisible(false);
        }
    }
}
