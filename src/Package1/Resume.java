package Package1;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class Resume {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resume window = new Resume();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Resume() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 1100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 736, 749);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea txtrCcCJava = new JTextArea();
		txtrCcCJava.setEditable(false);
		txtrCcCJava.setText("C, Python, Java, HTML5, ReactJS, Git, JavaScript, GCP");
		txtrCcCJava.setLineWrap(true);
		txtrCcCJava.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrCcCJava.setBackground(SystemColor.menu);
		txtrCcCJava.setBounds(160, 249, 400, 22);
		panel.add(txtrCcCJava);
		
		JLabel lblNewLabel = new JLabel("Sumit Agrawal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		lblNewLabel.setBounds(265, 18, 214, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("sumitkgagrawalgmail.com • +91 9599 167 798 • linkedin.com/in/sumit-agrawal-90aa80226/ • github.com/whosumitaggrawal");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(40, 63, 656, 22);
		panel.add(lblNewLabel_1);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(0, 0, 0));
		canvas.setBounds(40, 91, 656, 1);
		panel.add(canvas);
		
		JLabel lblAboutMe = new JLabel("ABOUT ME");
		lblAboutMe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAboutMe.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAboutMe.setBounds(295, 109, 143, 22);
		panel.add(lblAboutMe);
		
		JTextArea txtrIndependentAndHardworking = new JTextArea();
		txtrIndependentAndHardworking.setEditable(false);
		txtrIndependentAndHardworking.setLineWrap(true);
		txtrIndependentAndHardworking.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrIndependentAndHardworking.setText("Independent and hardworking individual having experience with real-world development and working on\r\nlong-term projects. I started freelancing in high school to gain professional experience while supporting myself\r\nfinancially. At this point, now that I have graduated, I’m very keen to break into the gaming industry. I hold an\r\ninsatiable curiosity for game development – particularly online games – the challenges to overcome in networking\r\nand their ability to connect millions of players worldwide.");
		txtrIndependentAndHardworking.setBackground(new Color(240, 240, 240));
		txtrIndependentAndHardworking.setBounds(40, 138, 656, 100);
		panel.add(txtrIndependentAndHardworking);
		
		JTextArea txtrTechnicalSkills = new JTextArea();
		txtrTechnicalSkills.setEditable(false);
		txtrTechnicalSkills.setText("• Technical Skills:");
		txtrTechnicalSkills.setLineWrap(true);
		txtrTechnicalSkills.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtrTechnicalSkills.setBackground(SystemColor.menu);
		txtrTechnicalSkills.setBounds(40, 249, 656, 22);
		panel.add(txtrTechnicalSkills);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.BLACK);
		canvas_1.setBounds(40, 299, 656, 1);
		panel.add(canvas_1);
		
		JLabel lblEducation = new JLabel("EDUCATION");
		lblEducation.setHorizontalAlignment(SwingConstants.CENTER);
		lblEducation.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEducation.setBounds(295, 306, 143, 22);
		panel.add(lblEducation);
		
		JTextArea txtrBcaBachelorsIn = new JTextArea();
		txtrBcaBachelorsIn.setEditable(false);
		txtrBcaBachelorsIn.setText("B.Sc., Bachelor’s in Science (June 2020) 8.08 CGPA");
		txtrBcaBachelorsIn.setLineWrap(true);
		txtrBcaBachelorsIn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtrBcaBachelorsIn.setBackground(SystemColor.menu);
		txtrBcaBachelorsIn.setBounds(40, 340, 656, 22);
		panel.add(txtrBcaBachelorsIn);
		
		JTextArea txtDelhiUniversity = new JTextArea();
		txtDelhiUniversity.setEditable(false);
		txtDelhiUniversity.setText("Dyal Singh College. Delhi University, New Delhi");
		txtDelhiUniversity.setLineWrap(true);
		txtDelhiUniversity.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtDelhiUniversity.setBackground(SystemColor.menu);
		txtDelhiUniversity.setBounds(40, 360, 656, 22);
		panel.add(txtDelhiUniversity);
		
		JTextArea txtrMastersIn = new JTextArea();
		txtrMastersIn.setEditable(false);
		txtrMastersIn.setText("MCA , Master's in Computer Application (July 2024) Persuing");
		txtrMastersIn.setLineWrap(true);
		txtrMastersIn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtrMastersIn.setBackground(SystemColor.menu);
		txtrMastersIn.setBounds(40, 385, 656, 22);
		panel.add(txtrMastersIn);
		
		JTextArea txtChristUniversity = new JTextArea();
		txtChristUniversity.setEditable(false);
		txtChristUniversity.setText("Christ (Deemed to be University), Hosur Road, Bangalore, Karnataka");
		txtChristUniversity.setLineWrap(true);
		txtChristUniversity.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtChristUniversity.setBackground(SystemColor.menu);
		txtChristUniversity.setBounds(40, 405, 656, 22);
		panel.add(txtChristUniversity);
		
		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setBackground(Color.BLACK);
		canvas_1_1.setBounds(40,440 , 656, 1);
		panel.add(canvas_1_1);
		
		JLabel lblCertificates = new JLabel("CERTIFICATES");
		lblCertificates.setHorizontalAlignment(SwingConstants.CENTER);
		lblCertificates.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCertificates.setBounds(295, 449, 143, 22);
		panel.add(lblCertificates);
		
		JTextArea txtCertificatesIn = new JTextArea();
		txtCertificatesIn.setEditable(false);
		txtCertificatesIn.setText("• Data Analytics using Python");
		txtCertificatesIn.setLineWrap(true);
		txtCertificatesIn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtCertificatesIn.setBackground(SystemColor.menu);
		txtCertificatesIn.setBounds(40, 482, 656, 22);
		panel.add(txtCertificatesIn);
		
		
		JTextArea txtCertificatesIn2 = new JTextArea();
		txtCertificatesIn2.setEditable(false);
		txtCertificatesIn2.setText("• CompTIA A+ Core 1: Networking Fundamentals");
		txtCertificatesIn2.setLineWrap(true);
		txtCertificatesIn2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtCertificatesIn2.setBackground(SystemColor.menu);
		txtCertificatesIn2.setBounds(40, 502, 656, 22);
		panel.add(txtCertificatesIn2);
		
		JTextArea txtCertificatesIn3 = new JTextArea();
		txtCertificatesIn3.setEditable(false);
		txtCertificatesIn3.setText("• Networking Standards and Connections");
		txtCertificatesIn3.setLineWrap(true);
		txtCertificatesIn3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtCertificatesIn3.setBackground(SystemColor.menu);
		txtCertificatesIn3.setBounds(40, 522, 656, 22);
		panel.add(txtCertificatesIn3);
		
		JTextArea txtCertificatesIn1 = new JTextArea();
		txtCertificatesIn1.setEditable(false);
		txtCertificatesIn1.setText("• Problem Solving Using Computational Thinkings");
		txtCertificatesIn1.setLineWrap(true);
		txtCertificatesIn1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtCertificatesIn1.setBackground(SystemColor.menu);
		txtCertificatesIn1.setBounds(40, 542, 656, 22);
		panel.add(txtCertificatesIn1);
		
		Canvas canvas_1_2 = new Canvas();
		canvas_1_2.setBackground(Color.BLACK);
		canvas_1_2.setBounds(40,580 , 656, 1);
		panel.add(canvas_1_2);
		
		JLabel lblProjects = new JLabel("PROJECTS");
		lblProjects.setHorizontalAlignment(SwingConstants.CENTER);
		lblProjects.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblProjects.setBounds(295, 590, 143, 22);
		panel.add(lblProjects);
		
		JTextArea txtProjectsIn = new JTextArea();
		txtProjectsIn.setEditable(false);
		txtProjectsIn.setText("• EventHive : A centralised platform for inter-college events");
		txtProjectsIn.setLineWrap(true);
		txtProjectsIn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtProjectsIn.setBackground(SystemColor.menu);
		txtProjectsIn.setBounds(40, 620, 656, 22);
		panel.add(txtProjectsIn);
		
		JTextArea txtEventHive = new JTextArea();
		txtEventHive.setEditable(false);
		txtEventHive.setText("This platform gives the information of all the intercollege events, helpful for both participants and College Admins.");
		txtEventHive.setLineWrap(true);
		txtEventHive.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtEventHive.setBackground(SystemColor.menu);
		txtEventHive.setBounds(50, 640, 656, 22);
		panel.add(txtEventHive);
		
		JTextArea txtProjectsIn2 = new JTextArea();
		txtProjectsIn2.setEditable(false);
		txtProjectsIn2.setText("• Facial Detection based Attendance System");
		txtProjectsIn2.setLineWrap(true);
		txtProjectsIn2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtProjectsIn2.setBackground(SystemColor.menu);
		txtProjectsIn2.setBounds(40, 665, 656, 22);
		panel.add(txtProjectsIn2);
		
		JTextArea txtFacial = new JTextArea();
		txtFacial.setEditable(false);
		txtFacial.setText("This can be used as portable Attendance system in which attendance is recorded in CSV by facial recognition.");
		txtFacial.setLineWrap(true);
		txtFacial.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtFacial.setBackground(SystemColor.menu);
		txtFacial.setBounds(50, 685, 656, 22);
		panel.add(txtFacial);
		
		
		

		
		
		
	}
}
