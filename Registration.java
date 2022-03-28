package reg_details;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameTxt;
	private JTextField lastNameTxt;
	private JTextField ageTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		DisplayDetails window = new DisplayDetails();
		window.frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 334);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel headlb = new JLabel("REGISTER");
		headlb.setFont(new Font("Consolas", Font.BOLD, 20));
		headlb.setForeground(SystemColor.text);
		headlb.setHorizontalAlignment(SwingConstants.CENTER);
		headlb.setBounds(148, 11, 138, 21);
		contentPane.add(headlb);
		
		JLabel firstNamelb = new JLabel("First Name:");
		firstNamelb.setFont(new Font("Verdana", Font.PLAIN, 14));
		firstNamelb.setBounds(63, 56, 99, 21);
		contentPane.add(firstNamelb);
		
		JLabel lastNamelb = new JLabel("Last Name:");
		lastNamelb.setFont(new Font("Verdana", Font.PLAIN, 14));
		lastNamelb.setBounds(63, 100, 83, 21);
		contentPane.add(lastNamelb);
		
		JLabel agelb = new JLabel("Age:");
		agelb.setFont(new Font("Verdana", Font.PLAIN, 14));
		agelb.setBounds(63, 143, 66, 21);
		contentPane.add(agelb);
		
		firstNameTxt = new JTextField();
		firstNameTxt.setBounds(204, 58, 138, 20);
		contentPane.add(firstNameTxt);
		firstNameTxt.setColumns(10);
		
		lastNameTxt = new JTextField();
		lastNameTxt.setBounds(204, 102, 138, 20);
		contentPane.add(lastNameTxt);
		lastNameTxt.setColumns(10);
		
		ageTxt = new JTextField();
		ageTxt.setBounds(204, 145, 25, 20);
		contentPane.add(ageTxt);
		ageTxt.setColumns(10);
		
		JButton submitBtn = new JButton("SUBMIT");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.addRow(firstNameTxt.getText(), lastNameTxt.getText(), Integer.parseInt(ageTxt.getText()));
				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f,"Record Added successfully","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		submitBtn.setBackground(SystemColor.activeCaption);
		submitBtn.setFont(new Font("SansSerif", Font.PLAIN, 12));
		submitBtn.setBounds(63, 205, 89, 23);
		contentPane.add(submitBtn);
		
		JButton resetBtn = new JButton("RESET");
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNameTxt.setText("");
				lastNameTxt.setText("");
				ageTxt.setText("");
			}
		});
		resetBtn.setBackground(SystemColor.activeCaption);
		resetBtn.setFont(new Font("SansSerif", Font.PLAIN, 12));
		resetBtn.setBounds(253, 206, 89, 23);
		contentPane.add(resetBtn);
	}
}
