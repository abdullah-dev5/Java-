
import javax.swing.*;
import java.awt.*;


public class Panel {
// Jpanel   = a Gui Component  that Functions as Container to holds Other Components.

    public static void main(String[] args)
    {
        ImageIcon image = new ImageIcon("download.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        label.setVerticalAlignment( JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setBounds(0,0,50,50);


        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,300,300);
       redpanel.setLayout(new BorderLayout());
        redpanel.add(label);//added to the panel
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(0,250,250,250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(250,250,250,250);

        JPanel graypanel = new JPanel();
        graypanel.setBackground(Color.gray);
        graypanel.setBounds(250,0,250,250);





        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        frame.add(graypanel);




    }



}
