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
            try{
                conn c1=new conn();
               String a="select * from lig";
               ResultSet rs = ((Statement)c1.statement).executeQuery(a);
                if(rs.next()){
                    new Dashboard().setVisible(true);
                    setVisible(false);

                }else{
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    setVisible(false);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
         }else if(ae.getSource()==b2){
            setVisible(false);
         }
    }
    public static void main(String[] arg){
        new Login().setVisible(true);;
    }
}

// import java.awt.EventQueue;
// import java.sql.*;	
// import javax.swing.*;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;
// import java.awt.Image;

// public class Manager {
// Connection conn = null;
// ResultSet rs = null;
// PreparedStatement pst = null;

// 	private JFrame frame;
// 	private JTextField txt_username;
// 	private JPasswordField txt_password;

// 	/**
// 	 * Launch the application.
// 	 */
// 	public static void main(String[] args) {
// 		EventQueue.invokeLater(new Runnable() {
// 			public void run() {
// 				try {
// 					Login window = new Login();
// 					window.frame.setVisible(true);
// 				} catch (Exception e) {
// 					e.printStackTrace();
// 				}
// 			}
// 		});
// 	}
	
// 	/**
// 	 * Create the application.
// 	 * @throws SQLException 
// 	 */
// 	public Login() throws SQLException {
// 		initialize();
// 		//conn = Javaconnect.getDBConnection();
// 	}
// 	public void close(){
// 		this.frame.dispose();
// 	}

// 	/**
// 	 * Initialize the contents of the frame.
// 	 */
// 	private void initialize() {
// 		frame = new JFrame();
// 		frame.setBounds(100, 100, 683, 445);
// 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		frame.getContentPane().setLayout(null);
		
// 		JLabel lblUsername = new JLabel("Username:");
// 		lblUsername.setBounds(357, 114, 67, 27);
// 		frame.getContentPane().add(lblUsername);
		
// 		JLabel lblPassword = new JLabel("Password:");
// 		lblPassword.setBounds(357, 187, 67, 27);
// 		frame.getContentPane().add(lblPassword);
		
// 		txt_username = new JTextField();
// 		txt_username.setBounds(419, 117, 86, 20);
// 		frame.getContentPane().add(txt_username);
// 		txt_username.setColumns(10);
		
// 		JButton btnLogin = new JButton("Login");
// 		btnLogin.addActionListener(new ActionListener() {
// 			public void actionPerformed(ActionEvent arg0) {
// 				String loginsql = "select * from Manager where m_name=? and password=?";
// 			try{
// 				pst = conn.prepareStatement(loginsql);
// 				pst.setString(1, txt_username.getText());
// 				pst.setString(2, txt_password.getText());
				
// 				rs = pst.executeQuery();
//                 if(rs.next()){
// 					JOptionPane.showMessageDialog(null, "Login Successful");
// 					Manager manager = new Manager();
// 					manager.setVisible(true);
//                      close();
// 					}
// 					else
// 				{
// 					JOptionPane.showMessageDialog(null, "Username and Password is incorrect");
// 				}
//  	     	}				catch(Exception e){
//     					JOptionPane.showMessageDialog(null, "Username and Password is incorrect");
// 			}
// 			}
// 		});
// 		btnLogin.setBounds(400, 275, 89, 23);
// 		frame.getContentPane().add(btnLogin);
		
// 		txt_password = new JPasswordField();
// 		txt_password.setBounds(418, 190, 87, 20);
// 		frame.getContentPane().add(txt_password);
// 	}
// }