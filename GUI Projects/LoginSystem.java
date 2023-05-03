//User name     Alan
//Password      12345
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSystem extends JFrame implements ActionListener
{
    private JPanel panel;
    private JTextField textField;
    private  JPasswordField passwordField;
    private  JLabel successlabel;
    private JButton resetbutton;
    private JButton button ;
    private JLabel userLabel;
     LoginSystem()
    {
        panel = new JPanel();
        panel.setLayout(null);
         button = new JButton("Login");
        button.setBounds(185,80,80,25);
        button.addActionListener(this);
        panel.add(button);

        resetbutton = new JButton("Reset");
        resetbutton.setBounds(100,80,80,25);
        resetbutton.addActionListener(this);

        panel.add(resetbutton);


        successlabel = new JLabel("");
        successlabel.setBounds(100,110,200,70);
        panel.add(successlabel);

       userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

         textField = new JTextField();
        textField.setBounds(100,20,165,25);
        panel.add(textField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100,50,165,25);
        panel.add(passwordField);

        JFrame frame = new JFrame();
        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(panel);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user  =textField.getText() ;
        String password = passwordField.getText();
        if(e.getSource()==resetbutton)
        {
            textField.setText("");
            passwordField.setText("");
        }

        else  if(e.getSource()==button)
        {
            if(user.equals("Alan")&&password.equals("12345"))
            {

                successlabel.setText("Welcome");
            }
            else if(user.equals("") || passwordField.equals("") )
            {

                successlabel.setText("Please enter");

            }
            else {
                successlabel.setText("Incorrect Username or password ");
            }
        }
        else{
            successlabel.setText("Please enter");
        }

    }

public static void main(String[] args)
    {

    new LoginSystem();

    }
}

