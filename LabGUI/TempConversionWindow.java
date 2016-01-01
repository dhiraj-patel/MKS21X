import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;



public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel result;
    private JTextField degrees;
    
    public TempConversionWindow(){
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

   	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	

	JButton cToF = new JButton("CelciusToFahrenheit");
	cToF.addActionListener(this);
	cToF.setActionCommand("Fahrenheit");
	
	JButton fToC = new JButton("FahrenheitToCelcius");
	fToC.addActionListener(this);
	fToC.setActionCommand("Celcius");
	
	degrees = new JTextField();
	answer = new JLabel();
	
	pane.add(result);
	pane.add(degrees);
	pane.add(fToC);
	pane.add(cToF);
    }
    
	
     
    public static CtoF(double t){
	return ((t)*(9.0/5.0)) + 32;
    }
    public static FtoC(double t){
	return (((5.0/9.0))((t - 32)));
    }
}