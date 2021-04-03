import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class NewGame extends JFrame {

	private JPanel contentPane;
	private JTextField nameTxtbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewGame frame = new NewGame();
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
	public NewGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 464);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner loanTakeSpin = new JSpinner();
		loanTakeSpin.setFont(new Font("Tahoma", Font.PLAIN, 31));
		loanTakeSpin.setModel(new SpinnerNumberModel(30000, 30000, 50000, 1000));
		loanTakeSpin.setBounds(179, 198, 141, 50);
		contentPane.add(loanTakeSpin);
		
		nameTxtbox = new JTextField();
		nameTxtbox.setFont(new Font("Tahoma", Font.PLAIN, 21));
		nameTxtbox.setBounds(179, 131, 288, 50);
		contentPane.add(nameTxtbox);
		nameTxtbox.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Loan");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(69, 198, 109, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblName.setBounds(69, 127, 109, 50);
		contentPane.add(lblName);
		
		JLabel takeLoanLbl = new JLabel("You have to pay this Loan after 4 days");
		takeLoanLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		takeLoanLbl.setBounds(56, 284, 440, 90);
		Image bannerImg1 = new ImageIcon(this.getClass().getResource("/n.png")).getImage();
		takeLoanLbl.setIcon(new ImageIcon(bannerImg1));
		contentPane.add(takeLoanLbl);
		
		JLabel lblNewLabel_1 = new JLabel("Let's start the business by taking loan");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(115, 23, 398, 71);
		contentPane.add(lblNewLabel_1);
		
		JLabel loanPic = new JLabel("");
		loanPic.setBounds(55, 23, 83, 70);
		Image bannerImg = new ImageIcon(this.getClass().getResource("/n2.png")).getImage();
		loanPic.setIcon(new ImageIcon(bannerImg));
		contentPane.add(loanPic);
	}
}
