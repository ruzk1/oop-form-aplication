package converter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class HomePage extends JFrame {
    //����������� ������� �����
    JLabel jLabelMain;
    JButton jButtonContinue, jButtonExit;
    MyEvent event = new MyEvent();
    HomePage(String s){
       super(s);//����������� JFrame(String s)
       this.setSize(450, 500);
       //�������� ���������
       jButtonContinue = new JButton("�����");
       jButtonContinue.setBackground(new Color(255,255,255));
       jButtonExit = new JButton("�����");
       jButtonExit.setBackground(new Color(255,255,255));
       jLabelMain = new JLabel("<html>"
                + "<div style='text-align: center; padding-top: 20px'>"
                + "������������ ����������� ���������� ��������"
                + "<br>��������������� �������� ������������� ����������"
                + "<br>�������: '�������������� ����������'"
                + "<br><div style='text-align: center; padding-top: 30px; font-size: 16;'>���������� ������ ��������� ������ �����</div>"
                + "<br><br>�������� ����������� ������"
                + "<br>�� ���������� '�������� ��������������� ����������������'"
                + "<br><div style='text-align: right; padding-top:80px'>��������:"
                + "<br>������� ������ ���-9"
                + "<br>������ ��������� ���������</div>"
                + "<div style='text-align: center; padding-top: 50px'>�������, 2021</div>"
                + "</div>"
                + "</html>");
       jLabelMain.setForeground(new Color(0,0,0));
       Box box = Box.createHorizontalBox();
       JPanel p = new JPanel();     
       //���������� �� �����
       p.add(jLabelMain);
       box.add(jButtonExit);
       box.add(Box.createHorizontalGlue());
       box.add(jButtonContinue);
       this.add(p,BorderLayout.CENTER);
       this.add(box,BorderLayout.SOUTH);
       //���������� ���������
        jButtonContinue.addActionListener(event);
        jButtonExit.addActionListener(event);
        
       
    }
    
 public class MyEvent implements ActionListener {

 // ��� ������� �� ������ "�����" ����������� ������� �����.
 // ������ "�����" ���������� ������ ����������.

        public MyEvent() {
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == jButtonContinue){
                Converter f = new Converter ();
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setResizable(false);
                f.setLocationRelativeTo(null);
                dispose();  
            }
             if(e.getSource() == jButtonExit){
                dispose(); 
            }
        }
    }
    
}
