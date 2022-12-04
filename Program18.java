//Simple Calculator using Java Swing
import java.awt.event.*;
import javax.swing.*;
class Program18 extends JFrame implements ActionListener{
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    public Program18(){
        setSize(700,700);
        setLayout(null);
        l1=new JLabel("1st no:");
        l1.setBounds(100,100,75,50);
        add(l1);
        l2=new JLabel("2nd no:");
        l2.setBounds(300,100,75,50);
        add(l2);
        l3=new JLabel("");
        l3.setBounds(180,500,75,50);
        add(l3);
        t1=new JTextField();
        t1.setBounds(100,150,75,50);
        add(t1);
        t2=new JTextField();
        t2.setBounds(300,150,75,50);
        add(t2);
        b1=new JButton("+");
        b1.setBounds(100,300,50,50);
        add(b1);
        b2=new JButton("-");
        b2.setBounds(150,300,50,50);
        add(b2);
        b3=new JButton("*");
        b3.setBounds(200,300,50,50);
        add(b3);
        b4=new JButton("/");
        b4.setBounds(250,300,50,50);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Integer ans=0;
        Integer n1=Integer.parseInt(t1.getText());
        Integer n2=Integer.parseInt(t2.getText());
        if(e.getSource()==b1)
            ans=n1+n2;
        else if(e.getSource()==b2)
            ans=n1-n2;
        else if(e.getSource()==b3)
            ans=n1*n2;
        else
            ans=n1/n2;
        l3.setText(ans.toString());
    }
    public static void main(String args[]){
        Program18 p=new Program18();
        p.setVisible(true);
    }
}