import javax.swing.JOptionPane;

public class solve_equation {
	public static void linearWithOneVar() {
		String strNotification = "You've entered ";
		String strNum1 = JOptionPane.showInputDialog(null,"Enter a: ","Input",JOptionPane.INFORMATION_MESSAGE); strNotification += strNum1;
		strNotification += " and ";
		String strNum2 = JOptionPane.showInputDialog(null,"Enter b: ","Input",JOptionPane.INFORMATION_MESSAGE);strNotification += strNum2;
		
		double dNum1 = Double.parseDouble(strNum1);
		double dNum2 = Double.parseDouble(strNum2);
		strNotification = strNotification + "\n Solution x = " +  Double.toString(-dNum2 / dNum1); 
		JOptionPane.showInternalMessageDialog(null, strNotification,"Result",JOptionPane.INFORMATION_MESSAGE);
	}
	public static void linearWithTwoVar() {
		String strNotification = "Sytem of linear equations:\n";
		double a11 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a11: ","Input",JOptionPane.INFORMATION_MESSAGE));
		strNotification += (Double.toString(a11) +"*x + ");
		double a12 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a12: ","Input",JOptionPane.INFORMATION_MESSAGE));
		strNotification += (Double.toString(a12) +"*y = ");
		double b1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter b1: ","Input",JOptionPane.INFORMATION_MESSAGE));
		strNotification += (Double.toString(b1) +"\n");
		double a21 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a21: ","Input",JOptionPane.INFORMATION_MESSAGE));
		strNotification += (Double.toString(a21) +"*x + ");
		double a22 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a22: ","Input",JOptionPane.INFORMATION_MESSAGE));
		strNotification += (Double.toString(a22) +"*y = ");
		double b2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter b2: ","Input",JOptionPane.INFORMATION_MESSAGE));
		strNotification += (Double.toString(b2) +"\n Solution: ");
		
		double D = a11*a22 - a21*a12;
		double D1 = b1*a22 - b2*a12;
		double D2 = a11*b2 - a21*b1;
		if (D==0) {
			strNotification += "Infinite solutions";
		}
		else {
			strNotification += ("x = " + Double.toString(D1/D) + ", y = " + Double.toString(D2/D));
		}
		JOptionPane.showMessageDialog(null, strNotification,"Result",JOptionPane.INFORMATION_MESSAGE);
	}
	public static void quadraticEquation() {
		String strNotification = "Quadratic equation:\n";
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a: ","Input",JOptionPane.INFORMATION_MESSAGE));
		if (a==0) {
			JOptionPane.showMessageDialog(null, "This is not a quadratic equation!!!!");
			return;
		}
		else {
			strNotification += (Double.toString(a) + "*x^2 + ");
			double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter b: ","Input",JOptionPane.INFORMATION_MESSAGE));
			strNotification += (Double.toString(b) + "*x + ");
			double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter c: ","Input",JOptionPane.INFORMATION_MESSAGE));
			strNotification += (Double.toString(c) + " = 0\nSolution: ");
			double delta = b*b - 4*a*c;
			if (delta==0) {
				strNotification += (" x = " + Double.toString(-b/(2*a)));
			}
			else if(delta>0) {
				delta = Math.sqrt(delta);
				double x1 = (-b + delta) / (2*a);
				double x2 = (-b - delta) / (2*a);
				strNotification += (" x1 = " + Double.toString(x1) + " x2 = " + Double.toString(x2));
			}
			else {
				strNotification += "No solution!!";
			}
			JOptionPane.showMessageDialog(null, strNotification,"Result",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void main(String[] args) {
        linearWithOneVar();
        linearWithTwoVar();
		quadraticEquation();
	}
}