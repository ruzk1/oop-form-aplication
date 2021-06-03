package converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame {
    JButton jButtonReturn;
    JLabel jLabel1;
   Handler event = new Handler();

    About(){
        //�����������
        super("� ���������");
        this.setSize(600, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        jButtonReturn = new JButton("�����");
        jButtonReturn.setBackground(new Color(255,255,255));
        jLabel1 = new JLabel("<html><div style='text-align:center'>� ���������"
                + "<div style='text-align: center; padding-top: 40px'>������ ���������� ������� ��� ����������� ������ ���������, � ������ ������ ������ ��������� ������ �����"
                + "</html>");
        jLabel1.setFont(new Font("arial", Font.BOLD, 18));
        add(jButtonReturn,BorderLayout.SOUTH);
        add(jLabel1,BorderLayout.CENTER);
        //���������� ���������
        jButtonReturn.addActionListener(event);
        
    }
    
    public class Handler implements ActionListener {
      @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == jButtonReturn){
                Converter f = new Converter();
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setResizable(false);
                f.setLocationRelativeTo(null);
                dispose();
            }
        }
    }
}