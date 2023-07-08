import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe1 extends JFrame implements ActionListener
{
    JButton button;
    JLabel label;
    Myframe1() {

        ImageIcon icon = new ImageIcon("images.jfif");
        ImageIcon icon2 = new ImageIcon("sp.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,250);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,150,150);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,20));
        button.setIconTextGap(0);
        button.setForeground(new Color(0x12345));//set Font color of Button
        button.addActionListener(this);
        button.setText("I'm a Button");//text on Button
        button.setFocusable(false);//prevent to foucused button or lines around the the textarea of the button.
        button.setBorder(BorderFactory.createEtchedBorder());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.add(label);

        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override//following methods is responsible for the action that should be performed after clicking on the button.
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
           // System.out.println("Working");
           // button.setEnabled(false);//when we click the button it will disabled after 1 times click.
            //this method will be helpful for 1 times permanent click.
            label.setVisible(true);

        }
    }
}

public class Buttons {
public static void main(String[] args)
    {
    //Myframe1 myframe1 = new Myframe1();
        //OR we can just
    new Myframe1();



    }

}
