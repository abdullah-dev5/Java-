import javax.swing.*;
import java.awt.*;

public class Borderlayout {


    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);
            frame.setVisible(true);
            frame.setLayout(new BorderLayout());


        JPanel centerPanel = new JPanel();
        centerPanel.setPreferredSize(new Dimension(100,50));
        centerPanel.setBackground(new Color(206, 198, 203));
        frame.add(centerPanel,BorderLayout.CENTER);


        JPanel northPanel = new JPanel();
        northPanel.setPreferredSize(new Dimension(100,50));
        northPanel.setBackground(new Color(154, 191, 230));//Bermuda color
        frame.add(northPanel,BorderLayout.NORTH);


        JPanel southPanel = new JPanel();
        southPanel.setPreferredSize(new Dimension(100,50));
        southPanel.setBackground(new Color(154, 221, 230));//
        frame.add(southPanel,BorderLayout.SOUTH);


        JPanel eastPanel = new JPanel();
        eastPanel.setPreferredSize(new Dimension(50,50));
        eastPanel.setBackground(new Color(97, 139, 145));
        frame.add(eastPanel,BorderLayout.EAST);


        JPanel westPanel = new JPanel();
        westPanel.setPreferredSize(new Dimension(60,100));
        westPanel.setBackground(new Color(225, 221, 209));//Moon Mist
        frame.add(westPanel,BorderLayout.WEST);




    }

}
