package TASK6_cost;




import java.applet.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*
<applet code=”Interest_Calc” width=450 height=300>
</applet>
*/
public class interest extends Applet implements ActionListener {
/**
	 * 
	 */
	private static final Logger LOGGER=LogManager.getLogger(interest.class);
	private static final long serialVersionUID = 1L;
JButton B_1;
JButton B_2;
JTextField T_1,T_2,T_3,T_4,T_5;
JLabel L_1,L_2,L_3;
JPanel p;
public void init()
{
// TODO start asynchronous download of heavy resources

L_1=new JLabel("principle amount");
L_2=new JLabel("time period");
L_3=new JLabel("rate of interest");
B_1=new JButton("simple interest");
B_2=new JButton("compound interest");

T_1=new JTextField();
T_2=new JTextField();
T_3=new JTextField();
T_4=new JTextField();
T_5=new JTextField();
this.setLayout(new GridLayout(5,2));
this.add(L_1);
this.add(T_1);
this.add(L_2);
this.add(T_2);
this.add(L_3);
this.add(T_3);
this.add(B_1);
this.add(T_4);
this.add(B_2);
this.add(T_5);
B_1.addActionListener(this);
B_2.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
double principleamount,timeperiod,rateofinterest,simpleinterest,compoundinterest;
principleamount=Double.parseDouble(T_1.getText());
timeperiod=Double.parseDouble(T_2.getText());
rateofinterest=Double.parseDouble(T_3.getText());

if (ae.getSource()==B_1)
{
simpleinterest=(principleamount*timeperiod*rateofinterest)/100.0;
T_4.setText(String.valueOf(simpleinterest));
}
else if(ae.getSource()==B_2)
{
compoundinterest=(principleamount*(Math.pow((1+(rateofinterest/100.0)),timeperiod)));
T_5.setText(String.valueOf(compoundinterest));
}
LOGGER.info("PRINCIPAL AMOUNT:"+T_1.getText());
LOGGER.info("TIME PERIOD:"+T_2.getText());
LOGGER.info("RATE OF INTERESTS:"+T_3.getText());
LOGGER.info("SIMPLE INTEREST:"+T_4.getText());
LOGGER.info("COMPOUND INTEREST:"+T_5.getText());

}


}