package converter;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        //������ �����
         HomePage f = new HomePage("���������");
        
        //����������� ���������
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
    }
}
