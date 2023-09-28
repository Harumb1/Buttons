import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class MyFrame extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JLabel label;

    MyFrame(){

        ImageIcon icon = new ImageIcon("C:\\Users\\alexs\\OneDrive\\Desktop\\sleepy.png");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\alexs\\OneDrive\\Desktop\\sleepy.png");

         button1 = new JButton();
         label.setIcon(icon2);
         label.setBounds(500, 200, 200, 200 );

        button1.setBounds(200,100,300,200);
        button1.addActionListener(this );
        // e -> System.out.println("button") Simplifies the @Override
        button1.setText("Button");
        button1.setFocusable(false); // removes the small box around the text
        button1.setIcon(icon);
        button1.setHorizontalTextPosition(JButton.CENTER);
        button1.setVerticalAlignment(JButton.TOP);
        button1.setFont(new Font("Comic Sans",Font.BOLD,50));
        button1.setBackground(Color.ORANGE);
        button1.setForeground(Color.red);
        button1.setEnabled(false); //disable a button
        //if put in the Override method you are allowed to click the button once and then it will disable itself

        button1.setBorder(BorderFactory.createBevelBorder(50));


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,1000);
        this.setVisible(true); // makes the button visible
        this.add(button1);


        this.add(button2);
        //this.getContentPane().setBackground(Color.black); |sets the background color to black|

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
            System.out.println("button");

        }
    }
}
