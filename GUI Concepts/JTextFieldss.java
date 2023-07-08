
import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JTextFieldss  implements ActionListener{

    private JButton button;
    private JFrame frame;
    private JTextField textField;
    JTextFieldss(){


         frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        button = new JButton();
        button.addActionListener(this);

         textField = new JTextField();
        textField.setPreferredSize(new Dimension(500,500));//diminision.
        textField.setFont(new Font("Consolas",Font.PLAIN,35));//Font configrations
        textField.setForeground(Color.orange);//set Font color.
        textField.setBackground(Color.black);//set Background of text field.
        textField.setCaretColor(Color.white);// marker move left rigth or give Cursor position
        textField.setText("UserName");//
        frame.add(button);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button)
        {
            button.setEnabled(false);//once the button click then it will be disabled
            textField.setEditable(false);//ONCE the text field Is fill and submitted it will not be Editable.
        }


    }

    public static void main(String[] args) {

        new JTextFieldss();
    }


}
