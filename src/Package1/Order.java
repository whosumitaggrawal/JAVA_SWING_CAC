package Package1;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class Order extends JFrame {
	private JPanel contentPane;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/grocery";
    static final String USER = "root";
    static final String PASS = "Sumit@123";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order(0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Order(int id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1650,1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("ThankYou for Shopping Grocery with us");
		lblNewLabel_13.setBounds(278, 250, 814, 68);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 38));
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_3_1 = new JLabel("Your Order has been Successfully Placed and will be delivered to your given Address");
		lblNewLabel_3_1.setBounds(172, 450, 1026, 68);
		lblNewLabel_3_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Gabriola", Font.BOLD, 37));
		contentPane.add(lblNewLabel_3_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1370, 220);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 1370, 220);
		ImageIcon img21 = new ImageIcon(this.getClass().getResource("/uplast.jpeg"));
		label.setIcon(img21);
		panel.add(label);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 529, 1370, 220);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1370, 220);;
		ImageIcon img22 = new ImageIcon(this.getClass().getResource("/downlast.jpeg"));
		lblNewLabel.setIcon(img22);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton_100 = new JButton("Home");
		btnNewButton_100.setBounds(22, 27, 91, 30);
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
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(1257, 27, 91, 30);
		panel.add(btnNewButton_1);
		btnNewButton_1.setToolTipText("Go Back");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton_1.setForeground(new Color(0,185,185));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(1155, 231, 220, 220);
		ImageIcon img20 = new ImageIcon(this.getClass().getResource("/smiley.gif"));
		lblNewLabel_1.setIcon(img20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(-5, 231, 220, 220);
		ImageIcon img29 = new ImageIcon(this.getClass().getResource("/smiley.gif"));
		lblNewLabel_2.setIcon(img29);
		contentPane.add(lblNewLabel_2);

		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart second = new Cart();
		        setVisible(false); // Hide current frame
		        second.setVisible(true); //second frame
			}
		});
	}
}
