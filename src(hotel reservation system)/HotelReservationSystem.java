import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelReservationSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelReservationSystem() {
		
                setSize(2000,1000); // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(0,20);
        
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons\\hotel.jpg"));
                Image i3 = i1.getImage().getScaledInstance(2000, 550,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                JLabel lid=new JLabel("HOTEL RESERVATION SYSTEM");
                lid.setBounds(150,350,1200,50);
                lid.setFont(new Font("serif",Font.PLAIN,60));
                lid.setForeground(Color.black);
                l1.add(lid);
                b1.setBounds(1170,325,150,50);
		l1.setBounds(0, 50, 1400, 530);
                
                l1.add(b1);
		add(l1);
                b1.addActionListener(this);
                setVisible(true);
                
                while(true){
                        lid.setVisible(false); // lid =  j label
                        try{
                                Thread.sleep(500);//1000 =1second
                        }
                        catch(Exception e){ }
                          lid.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){} 
                }
        }
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String [] args) {
                HotelReservationSystem window = new  HotelReservationSystem();
                window.setVisible(true);
	}
}
