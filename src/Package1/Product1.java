package Package1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.GridLayout;

public class Product1 extends JFrame {

	private JPanel contentPane;
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/grocery";
    public static final String USER = "root";
    public static final String PASS = "Sumit@123";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product1 frame = new Product1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Product1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (1650,1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ActionListener add = new ActionListener() {
	         public void actionPerformed(ActionEvent event) {
	        		 String name;
	        		 int price=0;
	        		 int count=1;
	        		 name = event.getActionCommand();
	        		 if(name=="Bananas" )price = 90;
		        	 else if(name=="Bread")price = 35;
		     		 else if(name=="Almond Butter")price = 400;
		     		 else if(name=="Maggi")price = 55;
		     		 else if(name=="Marie")price = 140;
		     		 else if(name=="Kisses")price = 800;
		     		 else if(name=="Butter")price = 80;
		     		 else if(name=="Rice")price = 600;
		     		 else if(name =="Lays")price =100;
	        		 try {	
	        			 String query="";
	        			 int flag=0,temp;
		        		 Connection conn = null;
		        		 Statement stmt = null;
		        		 Class.forName("com.mysql.cj.jdbc.Driver");
		        		 conn = DriverManager.getConnection(DB_URL, USER, PASS);
		        		 stmt = conn.createStatement();
				         String sql1="select * from cart";
				         ResultSet rs = stmt.executeQuery(sql1);
				         while(rs.next()) {
				        	 String test = rs.getString(1);
				        	 
				        	 if(test.equals(name)) {
				        		 System.out.println("Cart Running");
				        		 flag=1;
				        		 temp=Integer.parseInt(rs.getString(3));
				        		 temp++;
				        		 query = "update cart set count="+temp+" where item='"+name+"'";
				        	 }
				         }
				         if(flag==0) {
				        	 query = "insert into cart values ('"+name+"',"+price+","+count+")";
				         }
				         stmt.executeUpdate(query);
		        		 JOptionPane.showMessageDialog(null, "Successfully Added to the Cart", "Success", JOptionPane.PLAIN_MESSAGE);
		        	 } catch (Exception e1) {
	        		 System.out.println(e1);
	        	 }
	         }
	    };	
	    
	    JPanel panel = new JPanel();
		panel.setBackground(new Color(26, 255, 255));
		panel.setBounds(0, 0, 1370, 249);
		contentPane.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int count=0;
				try {	
       			 	 
	        		 Connection conn = null;
	        		 Statement stmt = null;
	        		 Class.forName("com.mysql.cj.jdbc.Driver");
	        		 conn = DriverManager.getConnection(DB_URL, USER, PASS);
	        		 stmt = conn.createStatement();
			         String sql1="select * from cart";
			         ResultSet rs = stmt.executeQuery(sql1);
			         while(rs.next()) {
			        	 count++;
			         }
	        		} catch (Exception e1) {
       		 System.out.println(e1);
       	 }
				if(count==0) {
					JOptionPane.showMessageDialog(null, "CART IS Empty", "Alert", JOptionPane.ERROR_MESSAGE);
				}else {
					Cart obj = new Cart();   
					setVisible(false); // Hide current frame
					obj.setVisible(true); //second frame	
				}
			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("/image10.png"));
		lblNewLabel_3.setBounds(1257, 6, 103, 30);
		panel.add(lblNewLabel_3);
		
		
		//Product 1 and 2 in panel
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(27, 57, 180, 180);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/image1.jpg"));
		panel.setLayout(null);
		lblNewLabel.setIcon(img);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel1_ = new JLabel("New label2_");
		lblNewLabel1_.setBounds(457, 57, 180, 180);
		ImageIcon img9 = new ImageIcon(this.getClass().getResource("/image9.png"));
		lblNewLabel1_.setIcon(img9);
		panel.add(lblNewLabel1_);
		
		JLabel lblNewLabel_1 = new JLabel("New label11");
		lblNewLabel_1.setBounds(912, 57, 180, 180);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/image2.png"));
		lblNewLabel_1.setIcon(img2);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Bananas");
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_4.setBounds(246, 70, 126, 41);
		panel.add(lblNewLabel_4);
		JLabel lblNewLabel_44 = new JLabel("Bundle of 12");
		lblNewLabel_44.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_44.setBounds(246, 97, 126, 41);
		panel.add(lblNewLabel_44);
		JLabel lblNewLabel_45 = new JLabel("Rs. 90");
		lblNewLabel_45.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_45.setBounds(246, 130, 126, 41);
		panel.add(lblNewLabel_45);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.setToolTipText("Add Item to Cart");
		btnNewButton.setBounds(246, 177, 118, 23);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton.setForeground(new Color(0,185,185));
		panel.add(btnNewButton);
	    btnNewButton.setActionCommand("Bananas");
	    btnNewButton.addActionListener(add);
	    
	    JLabel lblNewLabel_0 = new JLabel("Welcome to Grocery Shop");
		lblNewLabel_0.setForeground(new Color(255, 255, 255));
		lblNewLabel_0.setBounds(400, 0, 567, 51);
		lblNewLabel_0.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_0.setFont(new Font("Garamond", Font.BOLD, 50));
		panel.add(lblNewLabel_0);
		
		JButton btnNewButton_1 = new JButton("View Cart");
		btnNewButton_1.setToolTipText("View Items in Cart");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		
		btnNewButton_1.setBounds(1257, 11, 103, 30);
		btnNewButton_1.setFont(new Font("Georgia", Font.BOLD, 11));
		btnNewButton_1.setForeground(new Color(26, 255, 255));
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_11 = new JLabel("Cart");
		ImageIcon img10 = new ImageIcon(this.getClass().getResource("/image10.png")); 
		panel.setLayout(null);
		lblNewLabel_11.setIcon(img10);
		lblNewLabel_11.setBounds(1235, 13, 18, 18);
		panel.add(lblNewLabel_11);
		
	    //product 2
	    JLabel lblNewLabel_5= new JLabel("Almond Butter");
		lblNewLabel_5.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_5.setBounds(1137, 70, 164, 41);
		panel.add(lblNewLabel_5);
		JLabel lblNewLabel_54 = new JLabel("Jar of 500gms");
		lblNewLabel_54.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_54.setBounds(1137, 97, 139, 41);
		panel.add(lblNewLabel_54);
		JLabel lblNewLabel_55 = new JLabel("Rs. 400");
		lblNewLabel_55.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_55.setBounds(1137, 130, 126, 41);
		panel.add(lblNewLabel_55);
		
		JButton btnNewButton2 = new JButton("Add to Cart");
		btnNewButton2.setToolTipText("Add Item to Cart");
		btnNewButton2.setBounds(1137, 177, 118, 23);
		btnNewButton2.setBackground(new Color(255, 255, 255));
		btnNewButton2.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton2.setForeground(new Color(0,185,185));
		panel.add(btnNewButton2);
	    btnNewButton2.setActionCommand("Almond Butter");
	    btnNewButton2.addActionListener(add);
	    
	    JLabel lblNewLabel_m= new JLabel("Bread");
		lblNewLabel_m.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_m.setBounds(676, 70, 104, 41);
		panel.add(lblNewLabel_m);
		JLabel lblNewLabel_m4 = new JLabel("Pack of 400gms");
		lblNewLabel_m4.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_m4.setBounds(676, 97, 144, 41);
		panel.add(lblNewLabel_m4);
		JLabel lblNewLabel_m5 = new JLabel("Rs. 35");
		lblNewLabel_m5.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_m5.setBounds(676, 130, 126, 41);
		panel.add(lblNewLabel_m5);
		
		JButton btnNewButton40 = new JButton("Add to Cart");
		btnNewButton40.setToolTipText("Add Item to Cart");
		btnNewButton40.setBounds(676, 177, 118, 23);
		btnNewButton40.setBackground(new Color(255, 255, 255));
		btnNewButton40.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton40.setForeground(new Color(0,185,185));
		panel.add(btnNewButton40);
		btnNewButton40.setActionCommand("Bread");
		
		JButton btnNewButton_100 = new JButton("Home");
		btnNewButton_100.setBounds(22, 13, 91, 30);
		panel.add(btnNewButton_100);
		btnNewButton_100.setToolTipText("Go Back");
		btnNewButton_100.setBackground(new Color(255, 255, 255));
		btnNewButton_100.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton_100.setForeground(new Color(0,185,185));
		btnNewButton_100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login second = new login();
		        setVisible(false); // Hide current frame
		        second.setVisible(true); //second frame
			}
		});
		btnNewButton40.addActionListener(add);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 185, 185));
		panel_1.setBounds(0, 249, 1370, 250);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel2 = new JLabel("New label2");
		lblNewLabel2.setBounds(27, 57, 180, 180);
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/image3.png"));
		lblNewLabel2.setIcon(img3);
		panel_1.add(lblNewLabel2);
		
		JLabel lblNewLabel2_ = new JLabel("New label2_");
		lblNewLabel2_.setBounds(457, 57, 180, 180);
		ImageIcon img8 = new ImageIcon(this.getClass().getResource("/image8.png"));
		lblNewLabel2_.setIcon(img8);
		panel_1.add(lblNewLabel2_);
		
		JLabel lblNewLabel_2 = new JLabel("New label21");
		lblNewLabel_2.setBounds(912, 57, 180, 180);
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/image4.png"));
		lblNewLabel_2.setIcon(img4);
		panel_1.add(lblNewLabel_2);
		
		//product 3
		JLabel lblNewLabel_6= new JLabel("Maggi");
		lblNewLabel_6.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_6.setBounds(246, 70, 104, 41);
		panel_1.add(lblNewLabel_6);
		JLabel lblNewLabel_64 = new JLabel("Pack of 4");
		lblNewLabel_64.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_64.setBounds(246, 97, 139, 41);
		panel_1.add(lblNewLabel_64);
		JLabel lblNewLabel_65 = new JLabel("Rs. 55");
		lblNewLabel_65.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_65.setBounds(246, 130, 126, 41);
		panel_1.add(lblNewLabel_65);
		
		JButton btnNewButton3 = new JButton("Add to Cart");
		btnNewButton3.setToolTipText("Add Item to Cart");
		btnNewButton3.setBounds(246, 177, 118, 23);
		btnNewButton3.setBackground(new Color(255, 255, 255));
		btnNewButton3.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton3.setForeground(new Color(0,185,185));
		panel_1.add(btnNewButton3);
		btnNewButton3.setActionCommand("Maggi");
		btnNewButton3.addActionListener(add);
		
		//product added
		JLabel lblNewLabel_n= new JLabel("Marie Gold");
		lblNewLabel_n.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_n.setBounds(676, 70, 126, 41);
		panel_1.add(lblNewLabel_n);
		JLabel lblNewLabel_n4 = new JLabel("Pack of 950gms");
		lblNewLabel_n4.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_n4.setBounds(676, 97, 152, 41);
		panel_1.add(lblNewLabel_n4);
		JLabel lblNewLabel_n5 = new JLabel("Rs. 140");
		lblNewLabel_n5.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_n5.setBounds(676, 130, 126, 41);
		panel_1.add(lblNewLabel_n5);
		
		JButton btnNewButton30 = new JButton("Add to Cart");
		btnNewButton30.setToolTipText("Add Item to Cart");
		btnNewButton30.setBounds(676, 177, 118, 23);
		btnNewButton30.setBackground(new Color(255, 255, 255));
		btnNewButton30.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton30.setForeground(new Color(0,185,185));
		panel_1.add(btnNewButton30);
		btnNewButton30.setActionCommand("Marie");
		btnNewButton30.addActionListener(add);
		
		//product 4
		JLabel lblNewLabel_7= new JLabel("Hershey's Kisses");
		lblNewLabel_7.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_7.setBounds(1137, 70, 180, 41);
		panel_1.add(lblNewLabel_7);
		JLabel lblNewLabel_74 = new JLabel("Pack of 400gms");
		lblNewLabel_74.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_74.setBounds(1137, 97, 152, 41);
		panel_1.add(lblNewLabel_74);
		JLabel lblNewLabel_75 = new JLabel("Rs. 800");
		lblNewLabel_75.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_75.setBounds(1137, 130, 126, 41);
		panel_1.add(lblNewLabel_75);
		
		JButton btnNewButton4 = new JButton("Add to Cart");
		btnNewButton4.setToolTipText("Add Item to Cart");
		btnNewButton4.setBounds(1137, 177, 118, 23);
		btnNewButton4.setBackground(new Color(255, 255, 255));
		btnNewButton4.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton4.setForeground(new Color(0,185,185));
		panel_1.add(btnNewButton4);
	    btnNewButton4.setActionCommand("Kisses");
	    btnNewButton4.addActionListener(add);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(0, 499, 1370, 251);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel3 = new JLabel("New label3");
		lblNewLabel3.setBounds(27, 57, 180, 180);
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/image5.png"));
		lblNewLabel3.setIcon(img5);
		panel_2.add(lblNewLabel3);
		
		JLabel lblNewLabel3_ = new JLabel("New label3_");
		lblNewLabel3_.setBounds(457, 57, 180, 180);
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/image7.jpg"));
		lblNewLabel3_.setIcon(img7);
		panel_2.add(lblNewLabel3_);
		
		JLabel lblNewLabel_39 = new JLabel("New label31");
		lblNewLabel_39.setBounds(912, 57, 180, 180);
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/image6.png"));
		lblNewLabel_39.setIcon(img6);
		panel_2.add(lblNewLabel_39);
		
		//product 5
		JLabel lblNewLabel_8= new JLabel("Butter");
		lblNewLabel_8.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_8.setBounds(246, 70, 180, 41);
		panel_2.add(lblNewLabel_8);
		JLabel lblNewLabel_84 = new JLabel("Tub of 200gms");
		lblNewLabel_84.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_84.setBounds(246, 97, 152, 41);
		panel_2.add(lblNewLabel_84);
		JLabel lblNewLabel_85 = new JLabel("Rs. 80");
		lblNewLabel_85.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_85.setBounds(246, 130, 126, 41);
		panel_2.add(lblNewLabel_85);
		
		JButton btnNewButton5 = new JButton("Add to Cart");
		btnNewButton5.setToolTipText("Add Item to Cart");
		btnNewButton5.setBounds(246, 177, 118, 23);
		btnNewButton5.setBackground(new Color(255, 255, 255));
		btnNewButton5.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton5.setForeground(new Color(0,185,185));
		panel_2.add(btnNewButton5);
	    btnNewButton5.setActionCommand("Butter");
	    btnNewButton5.addActionListener(add);
	    
	    JLabel lblNewLabel_o= new JLabel("India Gate Rice");
		lblNewLabel_o.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_o.setBounds(676, 70, 157, 41);
		panel_2.add(lblNewLabel_o);
		JLabel lblNewLabel_o4 = new JLabel("Pack of 5 kgs");
		lblNewLabel_o4.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_o4.setBounds(676, 97, 139, 41);
		panel_2.add(lblNewLabel_o4);
		JLabel lblNewLabel_o5 = new JLabel("Rs. 600");
		lblNewLabel_o5.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_o5.setBounds(676, 130, 126, 41);
		panel_2.add(lblNewLabel_o5);
		
		JButton btnNewButton50 = new JButton("Add to Cart");
		btnNewButton50.setToolTipText("Add Item to Cart");
		btnNewButton50.setBounds(676, 177, 118, 23);
		btnNewButton50.setBackground(new Color(255, 255, 255));
		btnNewButton50.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton50.setForeground(new Color(0,185,185));
		panel_2.add(btnNewButton50);
		btnNewButton50.setActionCommand("Rice");
		btnNewButton50.addActionListener(add);
		
		//product 6
		JLabel lblNewLabel_9= new JLabel("Lay's");
		lblNewLabel_9.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_9.setBounds(1137, 70, 180, 41);
		panel_2.add(lblNewLabel_9);
		JLabel lblNewLabel_94 = new JLabel("Pack of 80gms");
		lblNewLabel_94.setFont(new Font("Georgia", Font.ITALIC, 20));
		lblNewLabel_94.setBounds(1137, 97, 152, 41);
		panel_2.add(lblNewLabel_94);
		JLabel lblNewLabel_95 = new JLabel("Rs. 100");
		lblNewLabel_95.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_95.setBounds(1137, 130, 126, 41);
		panel_2.add(lblNewLabel_95);
		
		JButton btnNewButton6 = new JButton("Add to Cart");
		btnNewButton6.setToolTipText("Add Item to Cart");
		btnNewButton6.setBounds(1137, 177, 118, 23);
		btnNewButton6.setBackground(new Color(255, 255, 255));
		btnNewButton6.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton6.setForeground(new Color(0,185,185));
		panel_2.add(btnNewButton6);
	    btnNewButton6.setActionCommand("Lays");
	    btnNewButton6.addActionListener(add);
		
	}
}
