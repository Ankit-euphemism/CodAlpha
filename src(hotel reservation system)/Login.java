import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    @SuppressWarnings("unused")
    private static final ActionEvent ACTION_EVENT = null;
    JLabel l1,l2;
    JButton b1,b2;
    JTextField username;
    JPasswordField password;
    Login(){

        super("Login");
        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
 
       username=new JTextField();
        username.setBounds(150,20,150,30);
        add(username);

        password=new JPasswordField();
        password.setBounds(150,70,150,30);
        add(password);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons\\295128.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,10,150,150);
        add(l3);

        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setSize(600,300);
        setLocation(600,350);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            // String u=username.getText();
            // @SuppressWarnings("deprecation")
            // String p=password.getText();
             try{
                conn c1=new conn();
               String a="select* from lig where username='"+username+"'and password='"+password+"'";
               ResultSet rs = ((Statement)c1.statement).executeQuery(a);
                if(rs.next()){
                    setVisible(false);
                    new Dashboard();
                }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid login");
                        setVisible(false);
                        new Login();
                    }

                
            }catch(Exception e){
                e.printStackTrace();
            }
         }else if(ae.getSource()==b2){
            setVisible(false);
         }
    }
    public static void main(String[] arg){
        new Login().setVisible(true);
    }
}
