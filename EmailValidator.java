import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EmailValidator extends Frame{
    public static void main(String[] args) {
        MyApp validatorApp=new MyApp();
        validatorApp.setSize(600, 600);
        validatorApp.setVisible(true);
        
    }    
}
class MyApp extends Frame{
    Label l;
    TextField email;
    Button b;
    TextArea outputText=new TextArea(2, 30);

    MyApp(){
        super("Email Validator");
        setLayout(new FlowLayout());
        setBackground(Color.DARK_GRAY);
        setForeground(Color.CYAN);
        l=new Label("Enter Email");

        email=new TextField(20); 
        email.setBackground(Color.DARK_GRAY);

        outputText.setBackground(Color.DARK_GRAY);
        // outputText.setForeground(Color.GREEN);

        b=new Button("Click");
        b.addActionListener(new ClickActionListener());
        
        add(l);
        add(email);
        add(b);
        add(outputText);
    }
    class ClickActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String usermail=email.getText();
            if(usermail.isEmpty()){
                outputText.setText("Field is empty");
            }
            else{
                String username=usermail.substring(0, usermail.indexOf("@"));
                String domainname=usermail.substring(usermail.indexOf("@")+1);
                
                outputText.setText("User Name: "+username+"\nDomain Name: "+domainname);
            }
        }
    }
}



