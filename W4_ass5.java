import javax.swing.JOptionPane;
public class W4_ass5
{

public static void main(String[] args)

{

double wages, rate, hours; 
String hourStr,rateStr;

hourStr = JOptionPane.showInputDialog(" Enter the working (hours): "); 
hours = Double.parseDouble(hourStr);

rateStr = JOptionPane.showInputDialog(" Enter the pay (rate): "); 
rate = Double.parseDouble(rateStr); 

if (hours > 40.0)
	
wages = 40.0 * rate + 1.5 * rate * (hours - 40.0); 
	
else 
	
wages = hours * rate; 

JOptionPane.showMessageDialog(null,String.format(" The wages are : ",wages); 
System.exit(0);
}
}