package Package1;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Register extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Register frame = new Register();
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
    public Register() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1650,1080);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(26,255,255));
        panel.setBounds(0, 0, 1370, 749);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("SIGN-UP");
        lblNewLabel_1.setBounds(553, 50, 241, 45);
        lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 50));
        lblNewLabel_1.setForeground(SystemColor.desktop);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("NAME:");
        lblNewLabel_2.setBounds(464, 174, 135, 59);
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 25));
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("USERNAME:");
        lblNewLabel_2_1.setBounds(464, 257, 135, 54);
        lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_2_1.setFont(new Font("Calibri", Font.BOLD, 25));
        panel.add(lblNewLabel_2_1);

        final JTextField textArea = new JTextField();
        textArea.setBounds(647, 174, 294, 54);
        panel.add(textArea);

        final JTextField textArea_1 = new JTextField();
        textArea_1.setBounds(647, 257, 294, 54);
        textArea_1.setBackground(SystemColor.window);
        panel.add(textArea_1);

        final JButton btnNewButton = new JButton("REGISTER");
        btnNewButton.setBounds(597, 596, 147, 45);
        btnNewButton.setFont(new Font("Calibri", Font.BOLD, 25));
        btnNewButton.setForeground(new Color(26,255,255));
        panel.add(btnNewButton);
        
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 360, 749);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 0, 360, 749);
		ImageIcon img20 = new ImageIcon(this.getClass().getResource("/leftlast.jpeg"));
		lblNewLabel_3.setIcon(img20);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1010, 0, 360, 749);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(0, 0, 360, 749);
		ImageIcon img21 = new ImageIcon(this.getClass().getResource("/rightlast.jpeg"));
		lblNewLabel_4.setIcon(img21);
		panel_2.add(lblNewLabel_4);
        
        JButton btnNewButton_1 = new JButton("Click here!");
        btnNewButton_1.setToolTipText("Go to the Log-In Page");
        btnNewButton_1.setBounds(717, 696, 105, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Georgia", Font.PLAIN, 11));
		btnNewButton_1.setForeground(new Color(0,185,185));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login second = new login();
		        setVisible(false); // Hide current frame
		        second.setVisible(true); //second frame
			}
		});
        
        final JPasswordField textArea_1_1 = new JPasswordField();
        textArea_1_1.setBounds(647, 341, 294, 54);
        textArea_1_1.setBackground(Color.WHITE);
        panel.add(textArea_1_1);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("PASSWORD:");
        lblNewLabel_2_1_1.setBounds(464, 341, 135, 54);
        lblNewLabel_2_1_1.setForeground(Color.BLACK);
        lblNewLabel_2_1_1.setFont(new Font("Calibri", Font.BOLD, 25));
        panel.add(lblNewLabel_2_1_1);
        
        JLabel lblNewLabel = new JLabel("If you're an existing user...");
        lblNewLabel.setBounds(553, 698, 165, 23);
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
        
        panel.add(lblNewLabel);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username=textArea.getText();
                String password=textArea_1.getText();
                String name=textArea_1_1.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root", "Sumit@123");
                        PreparedStatement st = (PreparedStatement) connection.prepareStatement("Insert into user values(?,?,?)");
                        st.setString(1, username);
                        st.setString(2, password);
                        st.setString(3, name);
                        JOptionPane.showMessageDialog(btnNewButton,"Registration Successful");
                        st.executeUpdate();
                        login frame1 = new login();
                        frame1.setVisible(true);
                        setVisible(false);
                }

                catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }
}
