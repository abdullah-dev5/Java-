
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandling  implements ActionListener{
    JFrame frame2;
    private int result;
    private JButton button2;
    private JFrame frame ;
    private   JTextField textField;
    private JButton button;
    private JTextField textField2;
    private JTextField textField3;

    JButton button3;
    JButton button4;
    JLabel labelError;
    EventHandling()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(210, 270);
        frame.setTitle("Calculator");
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(10,5,160,30);
        label.setText("First Operation");

        textField = new JTextField();
        textField.setBounds(10,30,165,30);


        JLabel label2 = new JLabel();
        label2.setText("Second Operation");
        label2.setBounds(10,55,160,30);


        textField2 = new JTextField();
        textField2.setBounds(10,80,165,30);

        textField3 = new JTextField();
        textField3.setBounds(10,190,165,30);

        button = new JButton("+");
        button.setBounds(10,115,70,30);
        button.addActionListener(this);

        button2 = new JButton("-");
        button2.setBounds(100,115,70,30);
        button2.addActionListener(this);

        button3 = new JButton("x");
        button3.setBounds(10,150,70,30);
        button3.addActionListener(this);


        button4 = new JButton("/");
        button4.setBounds(100,150,70,30);
        button4.addActionListener(this);


        panel.add(label);
        panel.add(label2);
        panel.add(textField);
        panel.add(textField2);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(textField3);
        frame.add(panel);


        frame.setVisible(true);
    }
    void error (){

        frame2 = new JFrame();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(200,200);

        labelError = new JLabel();
     //   labelError.setSize(40,30);
        labelError.setText("Error Not Divide By Zero");
        labelError.setBounds(100,100,40,30);
        frame2.add(labelError);
        frame2.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)

        {

            result=(Integer.parseInt( textField.getText())+Integer.parseInt( textField2.getText()));
            textField3.setText(Integer.toString(result));
        }
        else if(e.getSource()==button2)
        {
            result=(Integer.parseInt( textField.getText())-Integer.parseInt( textField2.getText()));
            textField3.setText(Integer.toString(result));
        }
        else if(e.getSource()==button3)
        {
            result=(Integer.parseInt( textField.getText())*Integer.parseInt( textField2.getText()));
            textField3.setText(Integer.toString(result));
        } else if(e.getSource()==button4)
        {
            try{
                result=(Integer.parseInt( textField.getText())/Integer.parseInt( textField2.getText()));
                textField3.setText(Integer.toString(result));

            }
            catch (Exception ex)
            {
                frame.dispose();
                error();

            }

        }


    }

public static void main(String[] args)
    {

        new EventHandling();

    }

}