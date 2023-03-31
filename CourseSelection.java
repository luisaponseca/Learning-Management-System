import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JToggleButton;
import javax.swing.JLabel;


public class CourseSelection extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<JCheckBox> checkBoxList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseSelection frame = new CourseSelection();
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
	public CourseSelection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		checkBoxList = new ArrayList<JCheckBox>();
		
		JButton chckbxNewCheckBox = new JButton("Computer Programming");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ComProg Subject = new ComProg();
				Subject.setVisible(true);
				dispose();
			}
		});
		
		chckbxNewCheckBox.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(16, 47, 416, 53);
		contentPane.add(chckbxNewCheckBox);
		
		JButton chckbxEnglishForAcademic = new JButton("English for Academic and Professional Purposes");
		chckbxEnglishForAcademic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAAP Subject = new EAAP();
				Subject.setVisible(true);
				dispose();
			}
		});
		
		chckbxEnglishForAcademic.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		chckbxEnglishForAcademic.setBounds(16, 111, 416, 53);
		contentPane.add(chckbxEnglishForAcademic);
		
		JButton chckbxEmtecOrEmpowerment = new JButton("EMTEC or Empowerment Technologies");
		chckbxEmtecOrEmpowerment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EMTEC Subject = new EMTEC();
				Subject.setVisible(true);
				dispose();
			}
		});
		chckbxEmtecOrEmpowerment.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		chckbxEmtecOrEmpowerment.setBounds(16, 175, 416, 53);
		contentPane.add(chckbxEmtecOrEmpowerment);
		
		JButton chckbxPracticalResearch = new JButton("Practical Research");
		chckbxPracticalResearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PracticalResearch Subject = new PracticalResearch();
				Subject.setVisible(true);
				dispose();
			}
		});
		chckbxPracticalResearch.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		chckbxPracticalResearch.setBounds(16, 239, 416, 53);
		contentPane.add(chckbxPracticalResearch);
		
		JButton chckbxPhysicalEducationAnd = new JButton("Physical Education and Health");
		chckbxPhysicalEducationAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PE Subject = new PE();
				Subject.setVisible(true);
				dispose();
			}
		});
		chckbxPhysicalEducationAnd.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		chckbxPhysicalEducationAnd.setBounds(16, 303, 416, 53);
		contentPane.add(chckbxPhysicalEducationAnd);
		
		JButton chckbxStatisticsAndProbability = new JButton("Statistics and Probability");
		chckbxStatisticsAndProbability.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statistics Subject = new Statistics();
				Subject.setVisible(true);
				dispose();
			}
		});
		chckbxStatisticsAndProbability.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		chckbxStatisticsAndProbability.setBounds(16, 367, 416, 53);
		contentPane.add(chckbxStatisticsAndProbability);
		
		JButton chckbxPagbasaAtPagsusuri = new JButton("Pagbasa at Pagsusuri ng Ibat Ibang Teksto Tungo sa Pananaliksik");
		chckbxPagbasaAtPagsusuri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Filipino Subject = new Filipino();
				Subject.setVisible(true);
				dispose();
			}
		});
		
		chckbxPagbasaAtPagsusuri.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		chckbxPagbasaAtPagsusuri.setBounds(16, 434, 416, 53);
		contentPane.add(chckbxPagbasaAtPagsusuri);
		
		JLabel lblNewLabel = new JLabel("SUBJECTS");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setBounds(156, 11, 275, 25);
		contentPane.add(lblNewLabel);
	}
}
