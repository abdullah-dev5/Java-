import javax.swing.*;
import java.awt.*;

public class FlowLaayout {



    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));//lEADING to strict on left side.Trailing to Strict on right side.by Default it's Center.
        // for Spacing between buttons we add horizontal and vertical Gap 10,10 .

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,200));
        panel.setBackground(Color.gray);

        JButton button = new JButton("0");
        button.setFocusable(false);
        panel.setLayout(new FlowLayout());
        panel.add(button);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));



        frame.add(panel);
        frame.setVisible(true);//sometime issues to show.

    }
}
