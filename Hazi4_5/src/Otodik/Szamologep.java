package Otodik;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Szamologep extends JFrame implements ActionListener{

    private String s="";
    private double elso;
    private double masodik;
    private double ered;
    
    private JButton bt;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;
    private JButton bt10;
    private JButton bt11;
    private JButton bt12;
    private JButton bt13;
    private JButton bt14;
    private JButton bt15;
    private JButton bt16;
    private JButton bt17;
    private JButton bt18;
    private JButton bt19;
    private JButton bt20;
    private JButton bt21;
    private JButton bt22;
    private JButton bt23;
    private JButton bt24;
    private JButton bt25;
    private JButton bt26;
    private JButton bt27;
    private JButton bt28;
    
    private TextField tf1;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;
    
    public Szamologep(String title) throws HeadlessException {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        this.bt = new JButton("");
        this.bt2 = new JButton("Backspace");bt2.setForeground(Color.RED);
        this.bt3 = new JButton("CE");bt3.setForeground(Color.RED);
        this.bt4 = new JButton("C");bt4.setForeground(Color.RED);
        this.bt5 = new JButton("MC");bt5.setForeground(Color.RED);
        this.bt6 = new JButton("7");
        this.bt7 = new JButton("8");
        this.bt8 = new JButton("9");
        this.bt9 = new JButton("/");bt9.setForeground(Color.RED);
        this.bt10 = new JButton("sqrt");
        this.bt11 = new JButton("MR");bt11.setForeground(Color.RED);
        this.bt12 = new JButton("4");
        this.bt13 = new JButton("5");
        this.bt14 = new JButton("6");
        this.bt15 = new JButton("*");bt15.setForeground(Color.RED);
        this.bt16 = new JButton("%");
        this.bt17 = new JButton("MS");bt17.setForeground(Color.RED);
        this.bt18 = new JButton("1");
        this.bt19 = new JButton("2");
        this.bt20 = new JButton("3");
        this.bt21 = new JButton("-");bt21.setForeground(Color.RED);
        this.bt22 = new JButton("1/x");
        this.bt23 = new JButton("M+");bt23.setForeground(Color.RED);
        this.bt24 = new JButton("0");
        this.bt25 = new JButton("+/-");
        this.bt26 = new JButton(".");
        this.bt27 = new JButton("+");bt27.setForeground(Color.RED);
        this.bt28 = new JButton("=");bt28.setForeground(Color.RED);
        
        this.tf1 = new TextField(60);
        
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        this.p4 = new JPanel();
        this.p5 = new JPanel();
        this.p6 = new JPanel();
        this.p7 = new JPanel();
        
        GridLayout gr = new GridLayout(6,1);
        setLayout(gr);
        GridLayout gr2 = new GridLayout(1,1);
        p1.setLayout(gr2);
        p2.setLayout(gr2);
        p3.setLayout(gr2);
        p4.setLayout(gr2);
        p5.setLayout(gr2);
        p6.setLayout(gr2);
        
        p1.add(tf1);
        
        p2.add(bt);
        p2.add(bt2);
        p2.add(bt3);
        p2.add(bt4);
        
        p3.add(bt5);
        p3.add(bt6);
        p3.add(bt7);
        p3.add(bt8);
        p3.add(bt9);
        p3.add(bt10);
        
        p4.add(bt11);
        p4.add(bt12);
        p4.add(bt13);
        p4.add(bt14);
        p4.add(bt15);
        p4.add(bt16);
        
        p5.add(bt17);
        p5.add(bt18);
        p5.add(bt19);
        p5.add(bt20);
        p5.add(bt21);
        p5.add(bt22);
        
        p6.add(bt23);
        p6.add(bt24);
        p6.add(bt25);
        p6.add(bt26);
        p6.add(bt27);
        p6.add(bt28);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        
        
        
        bt.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt15.addActionListener(this);
        bt16.addActionListener(this);
        bt17.addActionListener(this);
        bt18.addActionListener(this);
        bt19.addActionListener(this);
        bt20.addActionListener(this);
        bt21.addActionListener(this);
        bt22.addActionListener(this);
        bt23.addActionListener(this);
        bt24.addActionListener(this);
        bt25.addActionListener(this);
        bt26.addActionListener(this);
        bt27.addActionListener(this);
        bt28.addActionListener(this);
        
        super.pack();
    }
    
    public static void main(String[] args) {
        Szamologep szg = new Szamologep("Számológép");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt24) {
            s += "0";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt18) {
            s += "1";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt19) {
            s += "2";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt20) {
            s += "3";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt12) {
            s += "4";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt13) {
            s += "5";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt14) {
            s += "6";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt6) {
            s += "7";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt7) {
            s += "8";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt8) {
            s += "9";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt2) {
            s = tf1.getText();
            s = s.substring(0,s.length()-1);
            tf1.setText(s);
        }
        
        if(e.getSource() == bt27) {
            s =tf1.getText();
            elso = Double.parseDouble(s);
            s="";
            tf1.setText(s);
        }
        
        if(e.getSource() == bt28) {
            s = tf1.getText();
            masodik = Double.parseDouble(s);
            tf1.setText("" + (elso + masodik));
            }
        }
    }