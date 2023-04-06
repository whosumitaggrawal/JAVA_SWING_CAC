package Package1;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Delivery extends JFrame {

	private JPanel contentPane;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/grocery";
    static final String USER = "root";
    static final String PASS = "Sumit@123";
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delivery frame = new Delivery(0);
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
	public Delivery(int id) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1650,1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(26, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnNewButton = new JButton("Order");
		btnNewButton.setBounds(639, 650, 92, 36);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setToolTipText("Place Your Order");
		btnNewButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Order second = new Order(0);
		        setVisible(false); // Hide current frame
		        second.setVisible(true); //second frame
			}
		});
		
		
//		Add action for the order button 

		JLabel lblNewLabel_3 = new JLabel("Enter Your Delivery Details");
		lblNewLabel_3.setFont(new Font("Georgia", Font.BOLD, 24));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(512, 40, 346, 50);
		contentPane.add(lblNewLabel_3);
		textField = new JTextField();
		textField.setBounds(586, 133, 395, 45);
		contentPane.add(textField);
		textField.setFont(new Font("Georgia", Font.PLAIN, 16));
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JLabel lblNewLabel_3_1 = new JLabel("Name:");
		lblNewLabel_3_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(389, 133, 187, 36);
		contentPane.add(lblNewLabel_3_1);
		
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Address Line:");
		lblNewLabel_3_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(389, 183, 187, 36);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("City:");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1.setBounds(389, 263, 187, 36);
		contentPane.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("State:");
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1.setBounds(389, 313, 187, 36);
		contentPane.add(lblNewLabel_3_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("Pincode:");
		lblNewLabel_3_1_1_1_1_1_1.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1_1.setBounds(389, 413, 187, 36);
		contentPane.add(lblNewLabel_3_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_2 = new JLabel("Contact:");
		lblNewLabel_3_1_1_1_1_1_2.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1_2.setBounds(389, 463, 187, 36);
		contentPane.add(lblNewLabel_3_1_1_1_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_1_1_3 = new JLabel("Country:");
		lblNewLabel_3_1_1_1_1_1_3.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblNewLabel_3_1_1_1_1_1_3.setBounds(389, 363, 187, 36);
		contentPane.add(lblNewLabel_3_1_1_1_1_1_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
		textField_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_1.setBounds(586, 183, 395, 75);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
		textField_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_3.setBounds(586, 263, 395, 45);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
		textField_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_4.setBounds(586, 313, 395, 45);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
		textField_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_5.setBounds(586, 363, 395, 45);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
		textField_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_6.setBounds(586, 413, 395, 45);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
		textField_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_7.setBounds(586, 463, 395, 45);
		contentPane.add(textField_7);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 360, 749);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 360, 749);
		ImageIcon img20 = new ImageIcon(this.getClass().getResource("/leftlast.jpeg"));
		lblNewLabel.setIcon(img20);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1010, 0, 360, 749);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setBounds(0, 0, 360, 749);
		ImageIcon img21 = new ImageIcon(this.getClass().getResource("/rightlast.jpeg"));
		lblNewLabel_1.setIcon(img21);
		panel_1.add(lblNewLabel_1);
		
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
		btnNewButton_1.setBounds(240, 27, 91, 30);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setToolTipText("Go Back");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton_1.setForeground(new Color(0,185,185));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart second = new Cart();
		        setVisible(false); // Hide current frame
		        second.setVisible(true); //second frame
			}
		});
		
	}
}
