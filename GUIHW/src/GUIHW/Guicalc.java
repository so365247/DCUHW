package GUIHW;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

 
public class Guicalc extends JFrame { 
	
	private double op1 = 0;
	private double op2 = 0;
	private String operator = "+";
	private JLabel status;
			
	Guicalc() {
		
		this.setTitle("계산기");

		Image icon = Toolkit.getDefaultToolkit().getImage("calc.png"); // calculator 폴더에 이미지 저장하여
		this.setIconImage(icon);										// 계산기 아이콘 지정
		this.setBounds(300, 300, 400, 550);
		
		JTextField display = new JTextField();
		display.setText("0");
		display.setFont(new Font("맑음고딕체", Font.BOLD, 30));
		display.setHorizontalAlignment(JTextField.RIGHT); // 오른쪽정렬
		
		JLabel status = new JLabel();
		status.setHorizontalAlignment(JLabel.RIGHT);
		status.setText(display.getText());
		this.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 4));
		this.setLayout(new BorderLayout());
		
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		JButton btn0 = new JButton("0");
		btn0.addActionListener( e -> { // addActionListener를 사용해 버튼 클릭시 이벤트 설정
			if( display.getText().equals("0")) {
				display.setText( btn0.getText() ); // display에 버튼 값을 	
				status.setText( btn0.getText() ); // status에 버튼 값을 받음
			} else {
				display.setText( display.getText() + btn0.getText() );
				status.setText( display.getText() + btn0.getText() );
			}
		});
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn1.getText() );
				status.setText( btn1.getText() );
			} else {
				display.setText( display.getText() + btn1.getText() );
				status.setText( display.getText() + btn1.getText() );
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn2.getText() );	
				status.setText( btn2.getText() );
			} else {
				display.setText( display.getText() + btn2.getText() );
				status.setText( display.getText() + btn2.getText() );
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn3.getText() );	
				status.setText( btn3.getText() );
			} else {
				display.setText( display.getText() + btn3.getText() );
				status.setText( display.getText() + btn3.getText() );
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn4.getText() );
				status.setText( btn4.getText() );
			} else {
				display.setText( display.getText() + btn4.getText() );
				status.setText( display.getText() + btn4.getText() );
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn5.getText() );
				status.setText( btn5.getText() );
			} else {
				display.setText( display.getText() + btn5.getText() );
				status.setText( display.getText() + btn5.getText() );
			}
		});
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn6.getText() );
				status.setText( btn6.getText() );
			} else {
				display.setText( display.getText() + btn6.getText() );
				status.setText(display.getText() + btn6.getText() );
			}
		});
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn7.getText() );
				status.setText( btn7.getText() );
			} else {
				display.setText( display.getText() + btn7.getText() );
				status.setText( display.getText() + btn7.getText() );
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn8.getText() );
				status.setText( btn8.getText() );
			} else {
				display.setText( display.getText() + btn8.getText() );
				status.setText( display.getText() + btn8.getText() );
			}
		});
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener( e -> {
			if( display.getText().equals("0") ) {
				display.setText( btn9.getText() );
				status.setText( btn9.getText() );
			} else {
				display.setText( display.getText() + btn9.getText() );
				status.setText( display.getText() + btn9.getText() );
			}
		});
		
		
		// +, -, *, /, %
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
				display.setText("0");
				status.setText("+");
				operator = "+";
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
				display.setText("0");
				status.setText("-");
				operator = "-";
		});
		
		JButton btndiv = new JButton("÷");
		btndiv.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
				display.setText("0");
				status.setText("/");
				operator = "/";
		});
		
		JButton btnMult = new JButton("X");
		btnMult.addActionListener( e -> {
			op1 = Double.parseDouble( display.getText() );
				display.setText("0");
				status.setText("X");
				operator = "*";
		});
		
		JButton btnPer = new JButton("%");
		btnPer.addActionListener(e -> {
			op1 = Double.parseDouble(display.getText() );
				display.setText("0");
				status.setText("%");
				operator = "%";
		});
		
		// ., =
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(e -> {
			if(!display.getText().contains(".")) {
					display.setText(display.getText() + btnDot.getText());
					status.setText(status.getText() + btnDot.getText());
			}
		});
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener( e -> {
			op2 = Double.parseDouble( display.getText() );
			double result = guicalc(op1, op2, operator);
			display.setText( "" + result );
			status.setText( "" + result );
		});
		
		// +/-, ¹/x, x², ²√x
		JButton btnSign = new JButton("+/-");
		btnSign.addActionListener(e -> {
			double result = -1 * Double.parseDouble(display.getText());
			display.setText("" + result);
			status.setText("" + result);
			operator = "+/-";
		});
		
		JButton btnx1 = new JButton("¹/x");
		btnx1.addActionListener(e -> {
			double result = 1 / Double.parseDouble(display.getText());
			display.setText("" + result);
			status.setText("" + result);
			operator = "¹/x";
		});
		
		JButton btnx2 = new JButton("x²");
		btnx2.addActionListener(e -> {
			double result = Math.pow(Double.parseDouble(display.getText()), 2);
			display.setText("" + result);
			status.setText("" + result);
			operator = "x²";
		});

		JButton btnSqrt = new JButton("²√x");
		btnSqrt.addActionListener(e -> {
			double result = Math.sqrt(Double.parseDouble(display.getText()));
			display.setText("" + result);
			status.setText("" + result);
			operator = "²√x";
		});
		
		// C, CE, BackSpace
		JButton btnBack = new JButton("←");
		btnBack.addActionListener(e -> {
			display.getText().substring(0, display.getText().length() - 1);
			display.setText(display.getText().substring(0, display.getText().length() - 1));

			if(display.getText().length() < 1) {
				display.setText("0");
				status.setText("0"); // 자릿값이 1보다 낮으면 display & status 0으로 보정
			}
		});
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(e -> {
			op1 = 0;
			op2 = 0;
			operator = "+";
			display.setText("0");
			status.setText("0");
		});
		
		JButton btnDel = new JButton("CE");
		btnDel.addActionListener(e -> {
			display.setText("0");
			status.setText("0");
		});
			
		
		// 버튼 배열
		panel.add(btnPer);panel.add(btnDel);panel.add(btnClear);panel.add(btnBack);
		panel.add(btnx1);panel.add(btnx2);panel.add(btnSqrt);panel.add(btndiv);
		panel.add(btn7);panel.add(btn8);panel.add(btn9);panel.add(btnMult);
		panel.add(btn4);panel.add(btn5);panel.add(btn6);panel.add(btnMinus);
		panel.add(btn1);panel.add(btn2);panel.add(btn3);panel.add(btnPlus);
		panel.add(btnSign);panel.add(btn0);panel.add(btnDot);panel.add(btnEqual);
		
		
		this.add(BorderLayout.NORTH, display);
		this.add(BorderLayout.CENTER, panel);
		this.add(BorderLayout.SOUTH, status);
}
	
	

	private double guicalc(double op1, double op2, String operator) { // 연산 코드
		double result = 0;

		switch( operator ) {
		case "+":
			result = op1 + op2;
			break;

		case "-":
			result = op1 - op2;
			break;

		case "*":
			result = op1 * op2;
			break;

		case "/":
			result = op1 / op2;
			break;

		case "%":
			result = op1 % op2;
			break;
		}
		return result;
	}
	

	public static void main(String[] args) { // 계산기 보이기
		new Guicalc().setVisible(true);
	}
	
}
