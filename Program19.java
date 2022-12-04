//String counting using Java Swing
import java.awt.event.*;
import javax.swing.*;
class Program19 extends JFrame implements ActionListener{
    private JLabel l1;
    private JLabel l2;
    private JTextField t1;
    private JButton b1;
    public Program19(){
        setSize(700,700);
        setLayout(null);
        l1=new JLabel("Enter a text:");
        l1.setBounds(100,100,100,50);
        add(l1);
        l2=new JLabel("");
        l2.setBounds(180,600,75,50);
        add(l2);
        t1=new JTextField();
        t1.setBounds(150,150,150,50);
        add(t1);
        b1=new JButton("COUNT!");
        b1.setBounds(180,300,100,50);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String s1=t1.getText();
        Integer t=0;
        byte b[]=s1.getBytes();
        for(int i=0;i<b.length;i++)        {
            if(b[i]==' '){
                t++;
            }
        }
        t=t+1;
        l2.setText(t.toString());
    }
    public static void main(String args[]){
        Program19 p19=new Program19();
        p19.setVisible(true);
    }
}