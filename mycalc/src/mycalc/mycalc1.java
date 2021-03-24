package mycalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mycalc1 {

	private JFrame frame;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;
	private JButton btndot;
	private JButton btnplusminus;
	private JButton btnplus;
	private JButton btnminus;
	private JButton btnmult;
	private JButton btndiv;
	private JButton btnbackspace;
	private JButton btnC;
	private JButton btnperc;
	private JButton btnres;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mycalc1 window = new mycalc1();
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
	public mycalc1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 281, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(15, 12, 242, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn7.getText());
			}
		});
		btn7.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn7.setBounds(15, 133, 56, 50);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn8.getText());
			}
		});
		btn8.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn8.setBounds(77, 133, 56, 50);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn9.getText());
			}
		});
		btn9.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn9.setBounds(139, 133, 56, 50);
		frame.getContentPane().add(btn9);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn4.getText());
			}
		});
		btn4.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn4.setBounds(15, 195, 56, 50);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn5.getText());
			}
		});
		btn5.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn5.setBounds(77, 195, 56, 50);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn6.getText());
			}
		});
		btn6.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn6.setBounds(139, 195, 56, 50);
		frame.getContentPane().add(btn6);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn1.getText());
			}
		});
		btn1.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn1.setBounds(15, 253, 56, 50);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn2.getText());
			}
		});
		btn2.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn2.setBounds(77, 253, 56, 50);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn3.getText());
			}
		});
		btn3.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn3.setBounds(139, 253, 56, 50);
		frame.getContentPane().add(btn3);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btn0.getText());
			}
		});
		btn0.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btn0.setBounds(15, 314, 56, 50);
		frame.getContentPane().add(btn0);
		
		btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textField.setText(textField.getText() + btndot.getText());
			}
		});
		btndot.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btndot.setBounds(77, 314, 56, 50);
		frame.getContentPane().add(btndot);
		
		btnplusminus = new JButton("(-)");
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnplusminus.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnplusminus.setBounds(139, 314, 56, 50);
		frame.getContentPane().add(btnplusminus);
		
		btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnplus.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnplus.setBounds(201, 71, 56, 50);
		frame.getContentPane().add(btnplus);
		
		btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnminus.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnminus.setBounds(201, 133, 56, 50);
		frame.getContentPane().add(btnminus);
		
		btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnmult.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnmult.setBounds(201, 195, 56, 50);
		frame.getContentPane().add(btnmult);
		
		btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btndiv.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btndiv.setBounds(201, 253, 56, 50);
		frame.getContentPane().add(btndiv);
		
		btnbackspace = new JButton("<");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backsp = null;
				if(textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backsp = strB.toString();
					textField.setText(backsp);
				}
			}
		});
		btnbackspace.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnbackspace.setBounds(15, 71, 56, 50);
		frame.getContentPane().add(btnbackspace);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");				
			}
		});
		btnC.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnC.setBounds(77, 71, 56, 50);
		frame.getContentPane().add(btnC);
		
		btnperc = new JButton("%");
		btnperc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnperc.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnperc.setBounds(139, 71, 56, 50);
		frame.getContentPane().add(btnperc);
		
		btnres = new JButton("=");
		btnres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				
				if (operations=="+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations=="-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations=="*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations=="/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations=="%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnres.setFont(new Font("Ubuntu", Font.BOLD, 20));
		btnres.setBounds(201, 314, 56, 50);
		frame.getContentPane().add(btnres);
	}
}
