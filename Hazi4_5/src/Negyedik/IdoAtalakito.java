package Negyedik;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IdoAtalakito extends JFrame implements ActionListener{
    
    private JButton bt;
    
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private JTextField tf11;
    private JTextField tf12;
    
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb5;
    private JLabel lb6;
    private JLabel lb7;
    private JLabel lb8;
    private JLabel lb9;
    private JLabel lb10;
    private JLabel lb11;
    private JLabel lb12;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    
    public IdoAtalakito(String title) throws HeadlessException {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        this.bt = new JButton("Számol");
        
        this.tf1 = new JTextField(4);
        this.tf2 = new JTextField(4);
        this.tf3 = new JTextField(4);
        this.tf4 = new JTextField(4);
        this.tf5 = new JTextField(4);
        this.tf6 = new JTextField(4);
        this.tf7 = new JTextField(4);
        this.tf8 = new JTextField(4);
        this.tf9 = new JTextField(4);
        this.tf10 = new JTextField(4);
        this.tf11 = new JTextField(4);
        this.tf12 = new JTextField(4);
        
        this.lb1 = new JLabel("nap");
        this.lb2 = new JLabel("óra");
        this.lb3 = new JLabel("perc");
        this.lb4 = new JLabel("másodperc");
        this.lb5 = new JLabel("nap");
        this.lb6 = new JLabel("óra");
        this.lb7 = new JLabel("perc");
        this.lb8 = new JLabel("másodperc");
        this.lb9 = new JLabel("nap");
        this.lb10 = new JLabel("óra");
        this.lb11 = new JLabel("perc");
        this.lb12 = new JLabel("másodperc");
        
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        
        GridLayout gr = new GridLayout(4,1);
        setLayout(gr);
        GridLayout gr1 = new GridLayout(1,1);
        p3.setLayout(gr1);
                
        p1.add(tf1);
        p1.add(lb1);
        p1.add(tf2);
        p1.add(lb2);
        p1.add(tf3);
        p1.add(lb3);
        p1.add(tf4);
        p1.add(lb4);
        
        p2.add(tf5);
        p2.add(lb5);
        p2.add(tf6);
        p2.add(lb6);
        p2.add(tf7);
        p2.add(lb7);
        p2.add(tf8);
        p2.add(lb8);
        
        p3.add(bt);
        
        p4.add(tf9);
        p4.add(lb9);
        p4.add(tf10);
        p4.add(lb10);
        p4.add(tf11);
        p4.add(lb11);
        p4.add(tf12);
        p4.add(lb12);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        
        bt.addActionListener(this);
        
        super.pack();
    }
    
    public static void main(String[] args) {
        IdoAtalakito ido = new IdoAtalakito("IdoAtalakito");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a,b,a2,b2,a3,b3,a4,b4;
        a = Integer.valueOf(tf4.getText());
        b = Integer.valueOf(tf8.getText());
        a2 = Integer.valueOf(tf3.getText());
        b2 = Integer.valueOf(tf7.getText());
        a3 = Integer.valueOf(tf2.getText());
        b3 = Integer.valueOf(tf6.getText());
        a4 = Integer.valueOf(tf1.getText());
        b4 = Integer.valueOf(tf5.getText());
        int c,c2,c3,c4;
        c = a + b;
        c2 = a2 + b2;
        c3 = a3 + b3;
        c4 = a4 + b4;
        
        
        if(e.getSource()==bt) {
            if(a + b < 60) {
             tf12.setText(String.valueOf(c));
            } else {
                tf12.setText(String.valueOf(c-60));
                c2 = c2 + 1;
            }
            
            if(a2 + b2 < 60) {
                tf11.setText(String.valueOf(c2));
            } else {
                tf11.setText(String.valueOf(c2-60));
                c3 = c3 + 1;
            }
            
            if(a3 + b3 < 24) {
                tf10.setText(String.valueOf(c3));
            } else {
                tf10.setText(String.valueOf(c3-24));
                c4 = c4 + 1;
            }
            
            tf9.setText(String.valueOf(c4));
        }
    }
    
}