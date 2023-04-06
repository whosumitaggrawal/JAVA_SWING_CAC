package Package1;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class FinalPage extends JFrame {

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
					FinalPage frame = new FinalPage();
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
	public FinalPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1650,1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		try {
			Connection conn = null;
       	 Statement stmt = null;
       	 Class.forName("com.mysql.cj.jdbc.Driver");
       	 conn = DriverManager.getConnection(DB_URL, USER, PASS);
       	 stmt = conn.createStatement();
       	 String sql2="select * from user";
       	 ResultSet rs = stmt.executeQuery(sql2);
       	 int x;
       	 while(rs.next()) {
       		 String add = rs.getString(4);
       		 if(rs.getString(1).equals("Sumit")) {
       		JLabel lblNewLabel = new JLabel(add);
    		lblNewLabel.setBounds(662, 10, 134, 64);
    		contentPane.add(lblNewLabel);}
       	 }
			
		}catch(Exception e) {
			System.out.println(e);
		}
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	}

}
