import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class mytictactoe implements ActionListener{
 JFrame  f=new JFrame("submit your response");
 JLabel l1,l2,l3,l4;
 JButton submit=new JButton("continue");
 JButton quit=new JButton("Quit");
 JFrame window =new JFrame("Tic-Tac-Toe");
 JButton button1 = new JButton("");
JButton button2 = new JButton("");
 JButton button3 = new JButton("");
 JButton button4 = new JButton("");  
 JButton button5 = new JButton("");
 JButton button6 = new JButton("");
 JButton button7 = new JButton("");
 JButton button8 = new JButton("");
 JButton button9 = new JButton("");
 String letter =" ";
 int count=0;
 boolean win=false;
public mytictactoe()
{	
button1.setFont(button1.getFont().deriveFont (50f));
button2.setFont(button1.getFont().deriveFont (50f));
button3.setFont(button1.getFont().deriveFont (50f));
button4.setFont(button1.getFont().deriveFont (50f));
button5.setFont(button1.getFont().deriveFont (50f));
button6.setFont(button1.getFont().deriveFont (50f));
button7.setFont(button1.getFont().deriveFont (50f));
button8.setFont(button1.getFont().deriveFont (50f));
button9.setFont(button1.getFont().deriveFont (50f));
window.add(button1);
window.add(button2);
window.add(button3);
window.add(button4);
window.add(button5);
window.add(button6);
window.add(button7);
window.add(button8);
window.add(button9);
l3=new JLabel("do you want to continue the game ");
l4=new JLabel("if yes press continue otherwise press quit");
l1=new JLabel("programmed by pradeep and chakri");
l2=new JLabel("submitted to Ravi kanth Shau");
 Font font = new Font("Verdana", Font.BOLD, 12);
 l1.setFont(font);
 l2.setFont(font);
 l3.setFont(font);
 l4.setFont(font);
l1.setBounds(20,180,300,30);
l2.setBounds(210,220,300,30);
l3.setBounds(20,20,350,30);
l4.setBounds(20,50,350,30);
l4.setBounds(20,50,350,30);
submit.setBounds(100, 90, 100, 30);
quit.setBounds(100, 140, 100, 30);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);
submit.addActionListener(this);
quit.addActionListener(this);
f.add(submit);
f.add(quit);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
l2.setForeground(Color.BLUE);
l3.setForeground(Color.RED);
l1.setForeground(Color.GREEN);
l4.setForeground(Color.RED);
f.setSize(400,400);
f.setBackground(Color.red);
f.setLayout(null);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setSize(400,400);
window.setLayout(new GridLayout(3,3));
window.setLocationRelativeTo(null);
window.setBackground(Color.black);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
window.setVisible(false);
}
public void actionPerformed(ActionEvent a)
{
	if(a.getSource()==submit)
	{
		window.setVisible(true);
		f.setVisible(false);
	}
	if(a.getSource()==quit)
	{
		 System.exit(0);	
		}
count++;
if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9)
{
letter = "x";
}
else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10)
{
letter = "o";
}

if (a.getSource() == button1)
{
	if(letter=="x")
	button1.setBackground(Color.red);
else
	button1.setBackground(Color.blue);

button1.setText(letter);
button1.setEnabled(false);
}
else if(a.getSource() == button2)
{
	button2.setText(letter);
	if(letter=="x")
	button2.setBackground(Color.red);
else
	button2.setBackground(Color.blue);
button2.setEnabled(false);
}
else if(a.getSource() == button3)
{
	button3.setText(letter);
	if(letter=="x")
	button3.setBackground(Color.red);
else
	button3.setBackground(Color.blue);
button3.setEnabled(false);
}
else if(a.getSource() == button4)
{
	button4.setText(letter);
	if(letter=="x")
	button4.setBackground(Color.red);
else
	button4.setBackground(Color.blue);
button4.setEnabled(false);
}
else if(a.getSource() == button5)
{
	button5.setText(letter);
	if(letter=="x")
	button5.setBackground(Color.red);
else
	button5.setBackground(Color.blue);
button5.setEnabled(false);
}
else if(a.getSource() == button6)
{
button6.setText(letter);
	if(letter=="x")
	button6.setBackground(Color.red);
else
	button6.setBackground(Color.blue);
button6.setEnabled(false);
}
else if(a.getSource() == button7)
{
	button7.setText(letter);
	if(letter=="x")
	button7.setBackground(Color.red);
else
	button7.setBackground(Color.blue);
button7.setEnabled(false);
}
else if(a.getSource() == button8)
{
	
button8.setText(letter);
	if(letter=="x")
	button8.setBackground(Color.red);
else
	button8.setBackground(Color.blue);

button8.setEnabled(false);
}
else if(a.getSource() == button9)
{
	button9.setText(letter);
	if(letter=="x")
	button9.setBackground(Color.red);
else
	button9.setBackground(Color.blue);
button9.setEnabled(false);
}
 
if(button1.getText() == button2.getText()
    && button2.getText() == button3.getText()
	 && button1.getText() !="")
	 {
	 win = true;
	 }
	else if(button4.getText() == button5.getText()
    && button5.getText() == button6.getText()
	 && button4.getText() !="")
	 {
	 win = true;
	 }
  else if(button7.getText() == button8.getText()
    && button8.getText() == button9.getText()
	 && button7.getText() !="")
	 {
	 win = true;
	 }
else if(button1.getText() == button4.getText()
    && button4.getText() == button7.getText()
	 && button1.getText() !="")
	 {
	 win = true;
	 }
else if(button2.getText() == button5.getText()
    && button5.getText() == button8.getText()
	 && button2.getText() !="")
	 {
	 win = true;
	 }
else if(button3.getText() == button6.getText()
    && button6.getText() == button9.getText()
	 && button3.getText() !="")
	 {
	 win = true;
	 }
else if(button1.getText() == button5.getText()
    && button5.getText() == button9.getText()
	 && button1.getText() !="")
	 {
	 win = true;
	 }
else if(button3.getText() == button5.getText()
    && button5.getText() == button7.getText()
	 && button3.getText() !="")
	 {
	 win = true;
	 }
else{
win = false;
}
if( win == true)
{
JOptionPane.showMessageDialog(null,letter + "WINS!");
new mytictactoe();
}
else if(count == 10 && win == false)
{
JOptionPane.showMessageDialog(null,letter + "TIE GAME");
new mytictactoe();
}
}
public static void main(String[] args)
{
new mytictactoe();
}
}