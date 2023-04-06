package Package1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Cart extends JFrame {
	
	private JPanel contentPane;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/grocery";
    static final String USER = "root";
    static final String PASS = "Sumit@123";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart frame = new Cart();
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

	public Cart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (1650,1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ActionListener removeItem = new ActionListener() {
	         public void actionPerformed(ActionEvent event) {
	        	 int count=0;
	        	 try {
		        	 System.out.println(event.getActionCommand());
		        	 Connection conn = null;
		        	 Statement stmt = null;
		        	 String query="";
		        	 Class.forName("com.mysql.cj.jdbc.Driver");
		        	 conn = DriverManager.getConnection(DB_URL, USER, PASS);
		        	 stmt = conn.createStatement();
		        	 String name = event.getActionCommand();
		        	 stmt = conn.createStatement();
		        	 String sql2="select * from cart";
		        	 ResultSet rs = stmt.executeQuery(sql2);
		        	 int x;
		        	 while(rs.next()) {
		        		 count++;
		        		 x=Integer.parseInt(rs.getString(3));
		        		 if(x>1) {
		        			 --x;
		        			 query = "update cart set count="+x+" where item='"+name+"'";
		        		 }else {
		        			 query = "delete from cart where item = '"+name+"'";
		        		 }
		        		 stmt.executeUpdate(query);
		        		 Cart obj = new Cart();   
					        setVisible(false); // Hide current frame
					        obj.setVisible(true); //second frame 
		        	 } 
	        	 }catch (Exception e1) {
	        	     System.out.println(e1);
	        	 }
	        }
	    };
	    
	    JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 947, 749);
		panel_1.setBackground(new Color(26, 255, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(947, 0, 422, 749);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New Label");
		lblNewLabel_2.setBounds(0, 0, 422, 749);
		ImageIcon img20 = new ImageIcon(this.getClass().getResource("/image12.png"));
		lblNewLabel_2.setIcon(img20);
		panel_2.add(lblNewLabel_2);
		contentPane = new JPanel();
		
		JLabel lblNewLabel = new JLabel("ITEMS IN CART");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Georgia", Font.PLAIN, 40));
		lblNewLabel.setBounds(30, 11, 305, 61);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_11 = new JLabel("ITEMS");
		lblNewLabel_11.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_11.setBounds(75, 75, 87, 24);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_31 = new JLabel("COUNT");
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_31.setBounds(250, 75, 87, 24);
		panel_1.add(lblNewLabel_31);
		
		JLabel lblNewLabel_4 = new JLabel("PRICE");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_4.setBounds(425, 75, 87, 24);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("TOTAL");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel_5.setBounds(600, 75, 87, 24);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(825, 29, 91, 30);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setToolTipText("Go Back");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton_1.setForeground(new Color(0,185,185));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product1 second = new Product1();
		        setVisible(false); // Hide current frame
		        second.setVisible(true); //second frame
			}
		});
	
		
		JLabel lbl;
		JButton btn = null;
		float total=0;
		int y=100;
		try {
			
			Connection conn = null;
            Statement stmt = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            System.out.println("Connected database successfully");
            stmt = conn.createStatement();
            String sql2="select * from cart";
            ResultSet rs = stmt.executeQuery(sql2);
            while(rs.next()) {
            	lbl = new JLabel(rs.getString(1));
				lbl.setBounds(75, y, 100, 24);
				lbl.setFont(new Font("Georgia", Font.PLAIN, 18));
				panel_1.add(lbl);
				lbl = new JLabel(rs.getString(3));
				lbl.setHorizontalAlignment(SwingConstants.CENTER);
				lbl.setBounds(250, y, 84, 24);
				lbl.setFont(new Font("Georgia", Font.PLAIN, 18));
				panel_1.add(lbl);
				lbl = new JLabel("Rs: "+rs.getString(2));
//				lbl.setHorizontalAlignment(SwingConstants.CENTER);
				lbl.setBounds(425, y, 84, 24);
				lbl.setFont(new Font("Georgia", Font.PLAIN, 18));
				panel_1.add(lbl);
				float cost=Integer.parseInt(rs.getString(2))*Integer.parseInt(rs.getString(3));
				total+=cost;
				lbl = new JLabel("Rs. "+cost);
//				lbl.setHorizontalAlignment(SwingConstants.CENTER);
				lbl.setBounds(600, y, 84, 24);
				lbl.setFont(new Font("Georgia", Font.PLAIN, 18));
				panel_1.add(lbl);
				btn = new JButton("Remove");
				btn.setBounds(725, y, 90, 23);
				panel_1.add(btn);
				btn.setToolTipText("Remove Item");
				btn.setBackground(new Color(255, 255, 255));
				btn.setFont(new Font("Georgia", Font.PLAIN, 11));
				btn.setForeground(new Color(0, 0, 0));
				btn.setActionCommand(rs.getString(1));
			    btn.addActionListener(removeItem);
				y+=35;
            }
		}catch(Exception e) {
			System.out.println(e);
		}
		y+=10;
		lbl = new JLabel("TOTAL");
		lbl.setBounds(75, y, 84, 24);
		lbl.setFont(new Font("Georgia", Font.BOLD, 18));
		panel_1.add(lbl);
		lbl = new JLabel("Rs. "+total);
		lbl.setBounds(600, y, 170, 24);
		lbl.setFont(new Font("Georgia", Font.PLAIN, 18));
		panel_1.add(lbl);
		y+=50;
		
//		btn_1 = new JButton("BUY NOW");
//		btn_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				Delivery obj = new Delivery();
//				setVisible(false);
//				obj.setVisible(true);
//			}
//		});
//		
//		btn_1.setBounds(600, y, 125, 31);
//		panel_1.add(btn_1);
//		btn_1.setToolTipText("Add Your Address");
//		btn_1.setBackground(new Color(255, 255, 255));
//		btn_1.setFont(new Font("Georgia", Font.BOLD, 15));
//		btn_1.setForeground(new Color(0, 0, 0));
		
		JButton btnNewButton_11 = new JButton("BUY NOW");
		btnNewButton_11.setToolTipText("Add Your Address");
		btnNewButton_11.setBounds(600, y, 125, 31);
		panel_1.add(btnNewButton_11);
		btnNewButton_11.setBackground(new Color(255, 255, 255));
		btnNewButton_11.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton_11.setForeground(new Color(0,0,0));
	
        
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delivery second = new Delivery(0);
		        setVisible(false); // Hide current frame
		        second.setVisible(true); //second frame
			}
		});
		
				
	}
}
