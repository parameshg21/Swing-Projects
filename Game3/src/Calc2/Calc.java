package Calc2;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTree;
public class Calc {
	private JFrame frmFfsdf;
	private JTextField textField;
	float first;
	float second;
	float result;
	String operation;
	String answer;
	private JButton btn7;
	private JButton btn4;
	private JButton btn0;
	private JButton btn1;
	private JButton btnClear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnDot;
	private JButton btn00;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnEquals;
	private JButton btnMod;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMul;
	private JButton btnDiv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frmFfsdf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFfsdf = new JFrame();
		frmFfsdf.setTitle("CALCULATOR");
		frmFfsdf.setBounds(100, 100, 387, 554);
		frmFfsdf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFfsdf.getContentPane().setLayout(null);
		

		JLabel label1 = new JLabel("");
		label1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label1.setForeground(new Color(255, 0, 0));
		label1.setBounds(23, 15, 169, 30);
		frmFfsdf.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("");
		label2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label2.setForeground(new Color(255, 0, 0));
		label2.setBounds(202, 15, 161, 30);
		frmFfsdf.getContentPane().add(label2);
		
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(23, 56, 313, 52);
		frmFfsdf.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("B");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString(); // 112
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBackspace.setBounds(23, 119, 79, 67);
		frmFfsdf.getContentPane().add(btnBackspace);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(23, 182, 79, 67);
		frmFfsdf.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(23, 248, 79, 67);
		frmFfsdf.getContentPane().add(btn4);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
			
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(23, 379, 79, 67);
		frmFfsdf.getContentPane().add(btn0);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(23, 313, 79, 67);
		frmFfsdf.getContentPane().add(btn1);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				label1.setText(null);
				label2.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(102, 119, 79, 67);
		frmFfsdf.getContentPane().add(btnClear);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(102, 184, 79, 67);
		frmFfsdf.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(102, 249, 79, 67);
		frmFfsdf.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(102, 314, 79, 67);
		frmFfsdf.getContentPane().add(btn2);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(102, 379, 79, 67);
		frmFfsdf.getContentPane().add(btnDot);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(180, 119, 79, 67);
		frmFfsdf.getContentPane().add(btn00);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(180, 185, 79, 67);
		frmFfsdf.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(180, 249, 79, 67);
		frmFfsdf.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(180, 314, 79, 67);
		frmFfsdf.getContentPane().add(btn3);
		
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String answer;
				second=Float.parseFloat(textField.getText());
				if(operation.equals("+")) // ==
				{
					label1.setText(null);
					label2.setText(null);
					result=first+second;
					answer=String.valueOf(result);
					textField.setText(first+" + "+second+" = "+answer);
				}
				else if(operation.equals("-"))
				{
					label1.setText(null);
					label2.setText(null);
					result=first-second;
					answer=String.valueOf(result);
					textField.setText(first+" - "+second+" = "+answer);
				}
				else if(operation.equals("*"))
				{
					label1.setText(null);
					label2.setText(null);
					result=first*second;
					answer=String.valueOf(result);
					textField.setText(first+" * "+second+" = "+answer);
				}
				else if(operation.equals("/"))
				{
					label1.setText(null);
					label2.setText(null);
					result=first/second;
					answer=String.valueOf(result);
					textField.setText(first+" / "+second+" = "+answer);
				}
				else if(operation.equals("%"))
				{
					label1.setText(null);
					label2.setText(null);
					result=first%second;
					answer=String.valueOf(result);
					textField.setText(first+" % "+second+" = "+answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEquals.setBounds(180, 379, 79, 67);
		frmFfsdf.getContentPane().add(btnEquals);
		
		btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Float.parseFloat(textField.getText());
				textField.setText("");
				operation="%";
				label1.setText("First number:"+first);
				label2.setText("Operator:"+operation);
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMod.setBounds(257, 119, 79, 67);
		frmFfsdf.getContentPane().add(btnMod);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Float.parseFloat(textField.getText());
				textField.setText("");
				operation="+";
				label1.setText("First number:"+first);
				label2.setText("Operator:"+operation);
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(257, 185, 79, 67);
		frmFfsdf.getContentPane().add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Float.parseFloat(textField.getText());
				textField.setText("");
				operation="-";
				label1.setText("First number:"+first);
				label2.setText("Operator:"+operation);
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(257, 249, 79, 67);
		frmFfsdf.getContentPane().add(btnMinus);
		
		btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Float.parseFloat(textField.getText());
				textField.setText("");
				operation="*";
				label1.setText("First number:"+first);
				label2.setText("Operator:"+operation);
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(257, 314, 79, 67);
		frmFfsdf.getContentPane().add(btnMul);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Float.parseFloat(textField.getText());
				textField.setText("");
				operation="/";
				label1.setText("First number:"+first);
				label2.setText("Operator:"+operation);
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(257, 379, 79, 67);
		frmFfsdf.getContentPane().add(btnDiv);
		
		JLabel label = new JLabel("New label");
		label.setBounds(61, 159, 9, -141);
		frmFfsdf.getContentPane().add(label);
	}
}