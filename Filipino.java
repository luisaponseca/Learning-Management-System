import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Filipino extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Filipino frame = new Filipino();
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
	public Filipino() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FILIPINO");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		lblNewLabel.setBounds(279, 11, 454, 45);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 51, 647, 643);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("1. Anong uri ng teksto ang naglalaman ng mga pangangailangan at pangangailangan ng isang tao?");
		lblNewLabel_1.setBounds(6, 18, 572, 14);
		panel_1.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tekstong impormatibo");
		rdbtnNewRadioButton.setBounds(6, 39, 311, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tekstong deskriptibo");
		rdbtnNewRadioButton_1.setBounds(6, 63, 311, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Tekstong naratibo");
		rdbtnNewRadioButton_2.setBounds(6, 89, 311, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnNewRadioButton);
        buttonGroup.add(rdbtnNewRadioButton_1);
        buttonGroup.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("2. Ano ang layunin ng paggamit ng mga grap sa isang teksto?");
		lblNewLabel_1_1.setBounds(6, 131, 376, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Upang gawing mas malinaw ang mga ideya sa teksto");
		rdbtnNewRadioButton_3.setBounds(6, 152, 511, 23);
		panel_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Upang magbigay ng estetikong halaga sa teksto");
		rdbtnNewRadioButton_1_1.setBounds(6, 178, 311, 23);
		panel_1.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Upang bigyan ng dagdag na espasyo sa teksto");
		rdbtnNewRadioButton_2_1.setBounds(6, 204, 311, 23);
		panel_1.add(rdbtnNewRadioButton_2_1);
		
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton_3);
		buttonGroup2.add(rdbtnNewRadioButton_1_1);
		buttonGroup2.add(rdbtnNewRadioButton_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("3. Ano ang tawag sa paglalagom ng mga mahahalagang punto sa isang teksto?");
		lblNewLabel_1_1_1.setBounds(6, 243, 597, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("Pagbubuod");
		rdbtnNewRadioButton_3_1.setBounds(6, 264, 311, 23);
		panel_1.add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Paglalarawan");
		rdbtnNewRadioButton_1_1_1.setBounds(6, 290, 311, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("Pag-uulit-ulit");
		rdbtnNewRadioButton_2_1_1.setBounds(6, 316, 311, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1);
		
		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_3_1);
		buttonGroup3.add(rdbtnNewRadioButton_1_1_1);
		buttonGroup3.add(rdbtnNewRadioButton_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("4. Anong bahagi ng pananaliksik ang naglalaman ng mga layunin, katanungan at saklaw ng pag-aaral?");
		lblNewLabel_1_1_1_1.setBounds(6, 355, 654, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1 = new JRadioButton("Konklusyon");
		rdbtnNewRadioButton_2_1_1_1.setBounds(6, 428, 311, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("Introduksyon");
		rdbtnNewRadioButton_1_1_1_1.setBounds(6, 402, 311, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton("Abstrak");
		rdbtnNewRadioButton_3_1_1.setBounds(6, 376, 311, 23);
		panel_1.add(rdbtnNewRadioButton_3_1_1);
		
		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(rdbtnNewRadioButton_2_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_1_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("5. Ano ang tawag sa pagbibigay ng pagkilala sa mga sanggunian na ginamit sa pananaliksik?");
		lblNewLabel_1_1_1_1_1.setBounds(6, 466, 597, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1_1_1_1 = new JRadioButton("Paksa");
		rdbtnNewRadioButton_2_1_1_1_1.setBounds(6, 539, 311, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton("Anotasyon");
		rdbtnNewRadioButton_1_1_1_1_1.setBounds(6, 513, 311, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_3_1_1_1 = new JRadioButton("Bibliograpiya");
		rdbtnNewRadioButton_3_1_1_1.setBounds(6, 487, 311, 23);
		panel_1.add(rdbtnNewRadioButton_3_1_1_1);
		
		ButtonGroup buttonGroup5 = new ButtonGroup();
		buttonGroup5.add(rdbtnNewRadioButton_2_1_1_1_1);
		buttonGroup5.add(rdbtnNewRadioButton_1_1_1_1_1);
		buttonGroup5.add(rdbtnNewRadioButton_3_1_1_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int score = 0;
				if (rdbtnNewRadioButton.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_3.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_1_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_3_1_1_1.isSelected()) {
					score++;
				}
				JOptionPane.showMessageDialog(Filipino.this, "Your score is: " + score);
			}
		});
		btnNewButton.setBounds(29, 569, 197, 63);
		panel_1.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseSelection selection = new CourseSelection();
				selection.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(374, 569, 197, 63);
		panel_1.add(btnBack);
	}
}
