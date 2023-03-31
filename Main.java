import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Main {

	private JFrame frmLms;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmLms.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLms = new JFrame();
		frmLms.setTitle("LMS");
		frmLms.getContentPane().setFont(new Font("Georgia", Font.BOLD, 16));
		frmLms.setBounds(100, 100, 500, 500);
		frmLms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLms.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 46, 453, 49);
		frmLms.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 16));
		lblNewLabel.setBounds(20, 21, 453, 14);
		frmLms.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Grade Level");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 106, 453, 14);
		frmLms.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 131, 453, 49);
		frmLms.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Stand/Major");
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 16));
		lblNewLabel_2.setBounds(20, 193, 453, 41);
		frmLms.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(20, 245, 453, 54);
		frmLms.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLms.dispose();
				CourseSelection selection = new CourseSelection();
				selection.setVisible(true);
			}
		});
		btnNewButton.setBounds(100, 310, 270, 41);
		frmLms.getContentPane().add(btnNewButton);
	}
}
