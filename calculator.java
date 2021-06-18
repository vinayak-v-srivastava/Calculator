import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class calculator implements ActionListener {
double temp,temp1,result;
String[] arr;
JTextArea f;
public calculator(){
arr=new String[3];
}
public static void main(String[] args){
calculator b11=new calculator();
b11.go();
}
void go(){
Font font=new Font("Lucida Console",Font.BOLD,30);
JFrame frame=new JFrame("Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
f=new JTextArea(2,15);
f.setLineWrap(true);
f.setForeground(Color.BLACK);
f.setBackground(Color.LIGHT_GRAY);
f.setFont(font);
f.setEditable(false);


JButton b1=new JButton("%");
b1.setPreferredSize(new Dimension(100,30));
b1.addActionListener(this);
b1.setBackground(Color.LIGHT_GRAY);
JButton b2=new JButton("CE");
b2.setPreferredSize(new Dimension(100,30));
b2.addActionListener(this);
b2.setBackground(Color.LIGHT_GRAY);
JButton b3=new JButton("C");
b3.setPreferredSize(new Dimension(100,30));
b3.addActionListener(this);
b3.setBackground(Color.LIGHT_GRAY);
JButton b4=new JButton("Backspc");
b4.setPreferredSize(new Dimension(100,30));
b4.addActionListener(this);
b4.setBackground(Color.LIGHT_GRAY);

JButton b5=new JButton("1/x");
b5.setPreferredSize(new Dimension(100,30));
b5.addActionListener(this);
b5.setBackground(Color.LIGHT_GRAY);
JButton b6=new JButton("x^2");
b6.setPreferredSize(new Dimension(100,30));
b6.addActionListener(this);
b6.setBackground(Color.LIGHT_GRAY);
JButton b7=new JButton("sqrt(x)");
b7.setPreferredSize(new Dimension(100,30));
b7.addActionListener(this);
b7.setBackground(Color.LIGHT_GRAY);
JButton b8=new JButton("/");
b8.setPreferredSize(new Dimension(100,30));
b8.addActionListener(this);
b8.setBackground(Color.LIGHT_GRAY);

JButton b9=new JButton("7");
b9.setPreferredSize(new Dimension(100,30));
b9.addActionListener(this);
b9.setBackground(Color.WHITE);
JButton b10=new JButton("8");
b10.setPreferredSize(new Dimension(100,30));
b10.addActionListener(this);
b10.setBackground(Color.WHITE);
JButton b11=new JButton("9");
b11.setPreferredSize(new Dimension(100,30));
b11.addActionListener(this);
b11.setBackground(Color.WHITE);
JButton b12=new JButton("*");
b12.setPreferredSize(new Dimension(100,30));
b12.addActionListener(this);
b12.setBackground(Color.LIGHT_GRAY);

JButton b13=new JButton("4");
b13.setPreferredSize(new Dimension(100,30));
b13.addActionListener(this);
b13.setBackground(Color.WHITE);
JButton b14=new JButton("5");
b14.setPreferredSize(new Dimension(100,30));
b14.addActionListener(this);
b14.setBackground(Color.WHITE);
JButton b15=new JButton("6");
b15.setPreferredSize(new Dimension(100,30));
b15.addActionListener(this);
b15.setBackground(Color.WHITE);
JButton b16=new JButton("-");
b16.setPreferredSize(new Dimension(100,30));
b16.addActionListener(this);
b16.setBackground(Color.LIGHT_GRAY);

JButton b17=new JButton("1");
b17.setPreferredSize(new Dimension(100,30));
b17.addActionListener(this);
b17.setBackground(Color.WHITE);
JButton b18=new JButton("2");
b18.setPreferredSize(new Dimension(100,30));
b18.addActionListener(this);
b18.setBackground(Color.WHITE);
JButton b19=new JButton("3");
b19.setPreferredSize(new Dimension(100,30));
b19.addActionListener(this);
b19.setBackground(Color.WHITE);
JButton b20=new JButton("+");
b20.setPreferredSize(new Dimension(100,30));
b20.addActionListener(this);
b20.setBackground(Color.LIGHT_GRAY);

JButton b21=new JButton("00");
b21.setPreferredSize(new Dimension(100,30));
b21.addActionListener(this);
b21.setBackground(Color.WHITE);
JButton b22=new JButton("0");
b22.setPreferredSize(new Dimension(100,30));
b22.addActionListener(this);
b22.setBackground(Color.WHITE);
JButton b23=new JButton(".");
b23.setPreferredSize(new Dimension(100,30));
b23.addActionListener(this);
b23.setBackground(Color.WHITE);
JButton b24=new JButton("=");
b24.setPreferredSize(new Dimension(100,30));
b24.addActionListener(this);
b24.setForeground(Color.BLACK);
b24.setBackground(Color.BLUE);

frame.getContentPane().add(BorderLayout.NORTH,f);
JPanel p=new JPanel();
//p.setBackground(Color.GRAY);
p.setForeground(Color.GRAY);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
p.add(b12);
p.add(b13);
p.add(b14);
p.add(b15);
p.add(b16);
p.add(b17);
p.add(b18);
p.add(b19);
p.add(b20);
p.add(b21);
p.add(b22);
p.add(b23);
p.add(b24);
frame.getContentPane().add(p);
frame.setSize(450,318);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){
String s=e.getActionCommand();
if(s.equals("1")){
if(f.getText().equals("")){
f.setText(f.getText() + "1");
arr[0]="1";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"1");
arr[2]="1";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"1");
arr[2]+="1";}
else{
f.setText(arr[0]+ "1");
arr[0]+="1";
}}
if(s.equals("2")){
if(f.getText().equals("")){
f.setText(f.getText() + "2");
arr[0]="2";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"2");
arr[2]="2";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"2");
arr[2]+="2";}
else{
f.setText(arr[0]+ "2");
arr[0]+="2";
}}
if(s.equals("3")){
if(f.getText().equals("")){
f.setText(f.getText() + "3");
arr[0]="3";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"3");
arr[2]="3";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"3");
arr[2]+="3";}
else{
f.setText(arr[0]+ "3");
arr[0]+="3";
}}
if(s.equals("4")){
if(f.getText().equals("")){
f.setText(f.getText() + "4");
arr[0]="4";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"4");
arr[2]="4";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"4");
arr[2]+="4";}
else{
f.setText(arr[0]+ "4");
arr[0]+="4";
}}
if(s.equals("5")){
if(f.getText().equals("")){
f.setText(f.getText() + "5");
arr[0]="5";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"5");
arr[2]="5";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"5");
arr[2]+="5";}
else{
f.setText(arr[0]+ "5");
arr[0]+="5";
}}
if(s.equals("6")){
if(f.getText().equals("")){
f.setText(f.getText() + "6");
arr[0]="6";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"6");
arr[2]="6";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"6");
arr[2]+="6";}
else{
f.setText(arr[0]+ "6");
arr[0]+="6";
}}
if(s.equals("7")){
if(f.getText().equals("")){
f.setText(f.getText() + "7");
arr[0]="7";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"7");
arr[2]="7";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"7");
arr[2]+="7";}
else{
f.setText(arr[0]+ "7");
arr[0]+="7";
}}
if(s.equals("8")){
if(f.getText().equals("")){
f.setText(f.getText() + "8");
arr[0]="8";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"8");
arr[2]="8";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"8");
arr[2]+="8";}
else{
f.setText(arr[0]+ "8");
arr[0]+="8";
}}
if(s.equals("9")){
if(f.getText().equals("")){
f.setText(f.getText() + "9");
arr[0]="9";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"9");
arr[2]="9";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"9");
arr[2]+="9";}
else{
f.setText(arr[0]+ "9");
arr[0]+="9";
}}
if(s.equals("0")){
if(f.getText().equals("")){
f.setText(f.getText() + "0");
arr[0]="0";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"0");
arr[2]="0";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"0");
arr[2]+="0";}
else{
f.setText(arr[0]+ "0");
arr[0]+="0";
}}
if(s.equals("00")){
if(f.getText().equals("")){
f.setText(f.getText() + "00");
arr[0]="00";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+"00");
arr[2]="00";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+"00");
arr[2]+="00";}
else{
f.setText(arr[0]+ "00");
arr[0]+="00";
}}
if(s.equals("%")){
if(f.getText().equals("")){
f.setText("");
}
else{
temp=Double.parseDouble(arr[0]);
temp=temp/100;
f.setText(Double.toString(temp));
}}
if(s.equals("CE")){
if(f.getText().equals("")){
f.setText("");
arr[0]=null;
arr[2]=null;
arr[1]=null;
}
else if(arr[0]!=null&&arr[2]==null){
f.setText("");
arr[0]=null;
arr[1]=null;}
else if(arr[2]!=null){
f.setText(arr[0]+arr[1]);
arr[2]=null;}
}
if(s.equals("C")){
if(f.getText().equals("")){
f.setText("");
arr[0]=null;
arr[2]=null;
arr[1]=null;
}
else{
f.setText("");
arr[0]=null;
arr[2]=null;
arr[1]=null;
}}
if(s.equals("Backspc")){
if(f.getText().equals("")){
f.setText("");
arr[0]=null;
arr[2]=null;
arr[1]=null;
}
else if(arr[0]!=null&&arr[1]==null){
arr[0]=arr[0].substring(0,arr[0].length()-1);
f.setText(arr[0]);
}
else if(arr[0]!=null&&arr[1]!=null&&arr[2]==null){
arr[1]=null;
f.setText(arr[0]);
}
else{
arr[2]=arr[2].substring(0,arr[2].length()-1);
f.setText(arr[0]+arr[1]+arr[2]);
if(arr[2].length()==0){arr[2]=null;}
}}
if(s.equals("1/x")){
if(f.getText().equals("")){
f.setText("");
}
else{
temp=Double.parseDouble(arr[0]);
temp=1/temp;
f.setText("1/"+arr[0]+"="+temp);
}}
if(s.equals("x^2")){
if(f.getText().equals("")){
f.setText("");
}
else{
temp=Double.parseDouble(arr[0]);
temp=Math.pow(temp,2);
f.setText(arr[0]+"^2"+"="+temp);
}}
if(s.equals("sqrt(x)")){
if(f.getText().equals("")){
f.setText("");
}
else{
temp=Double.parseDouble(arr[0]);
temp=Math.sqrt(temp);
f.setText("sqrt("+arr[0]+")"+"="+temp);
}}
if(s.equals("/")){
if(f.getText().equals("")){
f.setText("");
}
else{
f.setText(arr[0]+"/");
arr[1]="/";
}}
if(s.equals("*")){
if(f.getText().equals("")){
f.setText("");
}
else{
f.setText(arr[0]+"*");
arr[1]="*";
}}
if(s.equals("-")){
if(f.getText().equals("")){
f.setText("");
}
else{
f.setText(arr[0]+"-");
arr[1]="-";
}}
if(s.equals("+")){
if(f.getText().equals("")){
f.setText("");
}
else{
f.setText(arr[0]+"+");
arr[1]="+";
}}
if(s.equals(".")){
if(f.getText().equals("")){
f.setText(f.getText() + ".");
arr[0]=".";
}
else if(arr[1]!=null&&arr[2]==null){
f.setText(arr[0]+arr[1]+".");
arr[2]=".";}
else if(arr[2]!=null){f.setText(arr[0]+arr[1]+arr[2]+".");
arr[2]+=".";}
else{
f.setText(arr[0]+ ".");
arr[0]+=".";
}}
if(s.equals("=")){
if(f.getText().equals("")){
f.setText("");
}
else{
temp=Double.parseDouble(arr[0]);
temp1=Double.parseDouble(arr[2]);
switch(arr[1]){
case "+":
result=temp+temp1;
break;
case "-":
result=temp-temp1;
break;
case "*":
result=temp*temp1;
break;
case "/":
result=temp/temp1;
break;
case "%":
result=temp%temp1;
break;
}
f.setText("");
f.setText(arr[0]+arr[1]+arr[2]+"="+result);
arr[0]=Double.toString(result);
arr[1]=null;
arr[2]=null;
}}
}}