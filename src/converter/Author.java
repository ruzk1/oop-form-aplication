package converter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Author extends JFrame {
    JLabel jLabel1;
    JButton jButtonReturn;
   Handler event = new Handler();

    Author(){
        //�����������
        super("�� ������");
        this.setSize(400, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        jButtonReturn = new JButton("�����");
        jButtonReturn.setBackground(new Color(255,255,255));
         jLabel1 = new JLabel("<html>"
                + "<div style='text-align: center'>������ ���-9</div>"
                + "<div style='text-align: center; padding-top: 30px'>����: ���������� ��������-���������������� ����������:  ��������� ������ ��������� </div>"
                + "<div style='text-align: center'>������� 8: ������� ��������� ������ ����� (����� �����) </div>"
                + "<div style='text-align: center; padding-top: 190px'>������ ��������� ���������"
                + "<div style='text-align: center'>�������, 2021"
                + "</html>");
        jLabel1.setFont(new Font("arial", Font.BOLD, 16));
        add(jLabel1,BorderLayout.CENTER);
        add(jButtonReturn,BorderLayout.SOUTH);
        //���������� ���������
        jButtonReturn.addActionListener(event);
    }
    
    public class Handler implements ActionListener {
      @Override
        //������� � �������� ����
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == jButtonReturn)
                {
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