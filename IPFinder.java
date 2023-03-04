import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;


public class IPFinder extends JFrame implements ActionListener
{
 JLabel l,l1,t1;
 JTextField tf;
 JButton b;
 ImageIcon im1;
 JPanel p1;
//InetAddress ia;

IPFinder(){

 super("Web Information Extracter");
 l=new JLabel("--------------Enter your web address here--------------");
l.setForeground(Color.RED);
 tf=new JTextField();

t1 = new JLabel("Web Information Extracter");
t1.setBounds(90,10,350,100);
t1.setForeground(Color.WHITE);

Font f1 = new Font("Arial",Font.BOLD,25);
t1.setFont(f1);

Font f2 = new Font("Arial",Font.BOLD,15);
l.setFont(f2);

Font f3 = new Font("Arial",Font.BOLD,15);
tf.setFont(f2);

im1 = new ImageIcon("back.jpg");
l1 = new JLabel(im1);
l1.setBounds(0,0,500,500);


l1.add(t1);
 b=new JButton("Get Data");
 b.addActionListener(this);

 setSize(500,500);
 setLayout(null);
 setVisible(true);



p1 = new JPanel();
p1.setLayout(new GridLayout(3,1));
p1.setBounds(70,150,350,200);
l1.add(p1);

p1.add(l);
p1.add(tf);
p1.add(b);

this.add(l1);



}
public void actionPerformed(ActionEvent e){
 String url=tf.getText();
 try {
 //ia =InetAddress.getByName(url);

URL ia = new URL(url);

String pro = ia.getProtocol();
int port =ia.getPort();
String host = ia.getHost();
int p2 = ia.getDefaultPort();
String query = ia.getQuery();
String path = ia.getPath();
String file = ia.getFile();


 JOptionPane.showMessageDialog(this,"Protocol : " + pro +"\n\n"+ "Port : " + port +"\n\n"+ "Default Port Number : "+p2+"\n\n"+"Query String : "+query+"\n\n"+"Path : "+path+"\n\n"+"File : "+file);


 } catch (Exception e1) {
 JOptionPane.showMessageDialog(this,"Check URL pattarn !");
 }
}
public static void main(String[] args) {
 IPFinder ipf = new IPFinder();
}
}