package converter;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.util.Objects;

import static java.lang.Double.parseDouble;

/**
 *
 */
class Converter extends JFrame {

//���������� ����������
Handler event = new Handler();

//���������� ����(Layout)
JPanel jPanelHeader, jPanelConvert, jPanelAnswer,jPanelFunctionButton, jPanelMain;
JLabel jLabel1, jLabel2, jLabelAnswer, jLabel3, jLabel4, jLabelInfo;
JTextField jTextField1;
JOptionPane jOptionPaneMessage;
JButton jButtonExit, jButtonAuthor, jButtonAbout, jButtonClear, jButtonConvert;
JComboBox<String> jComboBox1;
JComboBox<String> jComboBox2;

    Converter(){ 
        super("���������");
        this.setSize(1200, 600);
        //�������� ����(Layout) � �� ��� ������.
        jPanelMain = new JPanel();
        jPanelMain.setBackground(new Color(255, 255, 255));
        jPanelHeader = new JPanel();
        jPanelHeader.setBackground(new Color(255,255, 255));
        jPanelConvert = new JPanel();
        jPanelConvert.setBackground(new Color(255, 255, 255));
        jPanelAnswer = new JPanel();
        jPanelAnswer.setBackground(new Color(255,255,255));
        jPanelFunctionButton = new JPanel();
        jPanelFunctionButton.setBackground(new Color(255,255,255));
        jLabel1 = new JLabel("");
        jLabel2 = new JLabel("");
        jLabel3 = new JLabel("�� : ");
        jLabel4 = new JLabel("� : ");
        jLabelAnswer = new JLabel("�����: ");
        jButtonExit = new JButton("�����");
        jButtonExit.setBackground(new Color(255,255,255));
        jButtonAuthor = new JButton("�� ������");
        jButtonAuthor.setBackground(new Color(255,255,255));
        jButtonAbout = new JButton("� ���������");
        jButtonAbout.setBackground(new Color(255,255,255));
        jButtonClear = new JButton("��������");
        jButtonClear.setBackground(new Color(255,255,255));
        jButtonConvert =new JButton("��������������");
        jButtonConvert.setBackground(new Color(255,255,255));
        jTextField1 =new JTextField(5);
        jTextField1.setText("100");

        jComboBox1 = new JComboBox<>();
        jComboBox1.setBackground(new Color(255,255,255));
        jComboBox1.setEditable(true);
        jComboBox1.addItem("���� �� ��. ����");
        jComboBox1.addItem("�������� �� ��. ����");
        jComboBox1.addItem("���� �� ��. ���������");
        jComboBox1.addItem("���� �� ��. ����");
        jComboBox1.addItem("������ � ������� �� ��. ����");
        jComboBox1.addItem("����������� (����.) � ��� �� ��. ����");
        jComboBox1.addItem("����������� (����.) � ��� �� ��. ���");
        jComboBox1.addItem("������� (����.) � ������ �� ��. ���������");
        jComboBox1.addItem("������� (����.) � ��� �� ��. ���������");
        jComboBox1.addItem("������� (����.) � ������ �� ��. ���������");

        jComboBox2 = new JComboBox<>();
        jComboBox2.setBackground(new Color(255,255,255));
        jComboBox2.setEditable(true);
        jComboBox2.addItem("���� �� ��. ����");
        jComboBox2.addItem("�������� �� ��. ����");
        jComboBox2.addItem("���� �� ��. ���������");
        jComboBox2.addItem("���� �� ��. ����");
        jComboBox2.addItem("������ � ������� �� ��. ����");
        jComboBox2.addItem("����������� (����.) � ��� �� ��. ����");
        jComboBox2.addItem("����������� (����.) � ��� �� ��. ���");
        jComboBox2.addItem("������� (����.) � ������ �� ��. ���������");
        jComboBox2.addItem("������� (����.) � ��� �� ��. ���������");
        jComboBox2.addItem("������� (����.) � ������ �� ��. ���������");

        jLabelInfo = new JLabel("<html>"
            + "<div style='text-align: justify; width:140px; margin-right:5px;'>� ������� ���������� ����� ������ ��������������� ���� ���������� �������� � ������</div>"
            + "</html>");
        //�������� �������������� � ������������ ������������������ 
        Box vertical = Box.createVerticalBox();
        Box box = Box.createHorizontalBox();
        
        //������ ������
        jPanelHeader.add(box);
        jPanelHeader.add(jButtonAbout);
        jPanelHeader.add(jButtonAuthor);
        jPanelHeader.add(jButtonExit);
        vertical.add(jPanelHeader);
        
        //������ ������
        jPanelConvert.add(jLabelInfo);
        jPanelConvert.add(box);
        jPanelConvert.add(jLabel3);
        jPanelConvert.add(jComboBox1);
        jPanelConvert.add(jTextField1);
        jPanelConvert.add(jLabel1);
        jPanelConvert.add(jLabel4);
        jPanelConvert.add(jComboBox2);
        vertical.add(Box.createVerticalStrut(50));
        vertical.add(jPanelConvert);
        
        //������ ������
        jPanelFunctionButton.add(jButtonConvert);
        jPanelFunctionButton.add(jButtonClear);
        vertical.add(Box.createVerticalStrut(50));
        vertical.add(jPanelFunctionButton);
        
        //�������� ������
        jPanelAnswer.add(box);
        jPanelAnswer.add(jLabelAnswer);
        jPanelAnswer.add(jLabel2);
        vertical.add(Box.createVerticalStrut(50));
        vertical.add(jPanelAnswer);
        
        //���������� �� ����� �������� ����(Layout)
         this.add(jPanelMain,BorderLayout.CENTER);
         jPanelMain.add(vertical);
         
        //���������� ���������
        jButtonConvert.addActionListener(event);
        jButtonExit.addActionListener(event);
        jButtonClear.addActionListener(event);
        jButtonAuthor.addActionListener(event);
        jButtonAbout.addActionListener(event);
        
        //������ ����� ���� � �.�. � ���� ��� �����
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (jTextField1.getText().length() >= 15) {
                    e.consume();
                }
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9')
                        || (c == KeyEvent.VK_BACK_SPACE)
                        || (c == KeyEvent.VK_DELETE)
                        || (c == '.')
                        )) 
                {
                    e.consume();
                }
            }
        });    
    }
    
    //������� ��� �����������
     // var �������� ������� ������������
     // ratio ����������� �� ������� ����� �������� ��������� ��������

    double Convert (double var,double ratio)
    {
        return var * ratio;
    }
    //������������� ����������
    
    public class Handler implements ActionListener {
      @Override
        public void actionPerformed(ActionEvent e) {
          if(e.getSource()== jButtonConvert){
              try{
        if(Objects.requireNonNull(jComboBox1.getSelectedItem()).toString().equals("���� �� ��. ����"))
            {
              jLabel1.setText("��/�?");
              jLabelInfo.setText("<html>"
                      + "<div style='text-align: justify; width:140px; margin-right:5px;'>���� �� ���������� ���� (��/�?) � ����������� ������� �� ��� ��������� ��������� ��������� ������, ����������� ����� �������� ���������. �� �����������, ���� �� ���������� ���� � ��� �������� ����� � ���� ����, ���������� ����� ���� ���������� ���� �������, ���������������� � ����������� ������.</div>"
                      + "</html>");
            }
        if(jComboBox1.getSelectedItem().toString().equals("�������� �� ��. ����"))
            {
              jLabel1.setText("���/�?");
                jLabelInfo.setText("<html>"
                        + "<div style='text-align: justify; width:140px; margin-right:5px;'>�������� �� ���������� ���� (���/�?) � ������� ��������� ��������� ��������� ������, ����������� ����� �������� ���������, ������� ����������� ������� �� ���� �� ���������� ����. �� �����������, ���� �� ���������� ���� � ��� �������� ����� � ���� ����, ���������� ����� ���� ���������� ���� �������, ���������������� � ����������� ������.</div>"
                        + "</html>");
            }
        if(jComboBox1.getSelectedItem().toString().equals("���� �� ��. ���������"))
            {
              jLabel1.setText("��/��?");
                jLabelInfo.setText("<html>"
                        + "<div style='text-align: justify; width:140px; margin-right:5px;'>���� �� ���������� ��������� (��/��?) � ������� ��������� ��������� ��������� ������, ����������� ����� �������� ���������, ������� ����������� ������� �� ���� �� ���������� ����. �� �����������, ���� �� ���������� ���� � ��� �������� ����� � ���� ����, ���������� ����� ���� ���������� ���� �������, ���������������� � ����������� ������.</div>"
                        + "</html>");
            }
        if(jComboBox1.getSelectedItem().toString().equals("���� �� ��. ����"))
            {
              jLabel1.setText("��/����?");
                jLabelInfo.setText("<html>"
                        + "<div style='text-align: justify; width:140px; margin-right:5px;'>���� �� ���������� ���� (��/����?) � ������������� ������� ��������� ��������� ��������� ������, ����������� ����� �������� ���������. �� �����������, ���� �� ���������� ���� � ��� �������� ����� � ���� ����, ���������� ����� ���� ���������� ���� �������, ���������������� � ����������� ������.</div>"
                        + "</html>");
            }
        if(jComboBox1.getSelectedItem().toString().equals("������ � ������� �� ��. ����"))
            {
              jLabel1.setText("��/��?");
                jLabelInfo.setText("<html>"
                        + "<div style='text-align: justify; width:140px; margin-right:5px;'>������ � ������� �� ���������� ���� (��/��?) � ����������� ������� �� ��� ��������� ��������� ��������� ������, ����������� ����� �������� ���������. �� �����������, ������ � ������� �� ���������� ���� � ��� �������� ����� � ���� ������ � ������� (���� ����), ���������� ����� ���� ���������� ���� �������, ���������������� � ����������� ������.</div>"
                        + "</html>");
            }
        if(jComboBox1.getSelectedItem().toString().equals("����������� (����.) � ��� �� ��. ����"))
            {
              jLabel1.setText("����(�)/���?");
                jLabelInfo.setText("<html>"
                        + "<div style='text-align: justify; width:140px; margin-right:5px;'>������������� ����������� � ��� �� ���������� ���� (����(�)/���?) � ����������� ������� ��� ��������� ��������� ��������� ������, ����������� ����� �������� ���������. �� �����������, ����������� � ��� �� ���������� ���� � ��� �������� ����� � ���� ����������� � ���, ���������� ����� ���� ���������� ���� �������, ���������������� � ����������� ������.</div>"
                        + "</html>");
            }
        if(jComboBox1.getSelectedItem().toString().equals("����������� (����.) � ��� �� ��. ���"))
            {
              jLabel1.setText("����(�)/�����?");
                jLabelInfo.setText("<html>"
                        + "<div style='text-align: justify; width:140px; margin-right:5px;'>������������� ����������� � ��� �� ���������� ��� (����(�)/�����?) � ������� � ������������ � ���������� ������������ �������� ��� ��� ��������� ��������� ��������� ������, ����������� ����� �������� ���������. �� �����������, ����������� � ��� �� ���������� ��� � ��� �������� ����� � ���� ����������� � ���, ���������� ����� ���� ���������� ��� �������, ���������������� � ����������� ������.</div>"
                        + "</html>");
            }
        if(jComboBox1.getSelectedItem().toString().equals("������� (����.) � ������ �� ��. ���������"))
            {
              jLabel1.setText("���(�)/�����?");
                jLabelInfo.setText("<html>"
                        + "<div style='text-align: justify; width:140px; margin-right:5px;'>������������� ������� � ������ �� ���������� ��������� (���(�)/�����?) � ����������� ������� ��� ��������� ��������� ��������� ������, ����������� ����� �������� ���������. �� �����������, ������� � ������ �� ���������� ��������� � ��� �������� ����� � ���� ������� � ������, ���������� ����� ���� ���������� ��������� �������, ���������������� � ����������� ������.</div>"
                        + "</html>");
            }
        if(jComboBox1.getSelectedItem().toString().equals("������� (����.) � ��� �� ��. ���������"))
            {
              jLabel1.setText("���(�)/����?");
                jLabelInfo.setText("<html>"
                        + "<div style='text-align: justify; width:140px; margin-right:5px;'>������������� ������� � ��� �� ���������� ��������� (���(�)/����?) � ����������� ������� ��������� ��������� ��������� ������, ����������� ����� �������� ���������. �� �����������, ������� � ��� �� ���������� ��������� � ��� �������� ����� � ���� ������� � ���, ���������� ����� ���� ���������� ��������� �������, ���������������� � ����������� ������.</div>"
                        + "</html>");
            }
        if(jComboBox1.getSelectedItem().toString().equals("������� (����.) � ������ �� ��. ���������"))
            {
              jLabel1.setText("���(�)/�����?");
                jLabelInfo.setText("<html>"
                        + "<div style='text-align: justify; width:140px; margin-right:5px;'>��������������� ������� � ������ �� ���������� ��������� (���(�)/�����?) � ����������� ������� ��� ��������� ��������� ��������� ������, ����������� ����� �������� ���������. �� �����������, ������� � ������ �� ���������� ��������� � ��� �������� ����� � ���� ������� � ������, ���������� ����� ���� ���������� ��������� �������, ���������������� � ����������� ������.</div>"
                        + "</html>");
            }
        if(Objects.requireNonNull(jComboBox2.getSelectedItem()).toString().equals("���� �� ���������� ����"))
            {
              jLabel2.setText(".");
            }
        if(jComboBox2.getSelectedItem().toString().equals("�������� �� ��. ����"))
            {
              jLabel2.setText(".");
            }
        if(jComboBox2.getSelectedItem().toString().equals("���� �� ��. ���������"))
            {
               jLabel2.setText(".");
            }
        if(jComboBox2.getSelectedItem().toString().equals("���� �� ��. ����"))
            {
              jLabel2.setText(".");
            }
        if(jComboBox2.getSelectedItem().toString().equals("������ � ������� �� ��. ����"))
            {
              jLabel2.setText(".");
            }
        if(jComboBox2.getSelectedItem().toString().equals("����������� (����.) � ��� �� ��. ����"))
            {
              jLabel2.setText(".");
            }
        if(jComboBox2.getSelectedItem().toString().equals("����������� (����.) � ��� �� ��. ���"))
            {
              jLabel2.setText(".");
            }
        if(jComboBox2.getSelectedItem().toString().equals("������� (����.) � ������ �� ��. ���������"))
            {
              jLabel2.setText(".");
            }
        if(jComboBox2.getSelectedItem().toString().equals("������� (����.) � ��� �� ��. ���������"))
            {
              jLabel2.setText(".");
            }
        if(jComboBox2.getSelectedItem().toString().equals("������� (����.) � ������ �� ��. ���������"))
            {
              jLabel2.setText(".");
            }
//������ ��� �����������

        double [][] coef = new double[][]
                {   
                    new double [] {1,0.001,0.0001,0.0006451599995,1,0.8598452279,0.07988223556,0.0014330753796,0.08598452278,0.00143403441683},
                    new double [] {1000,1,0.1,0.6451599995,1000,859.8452279,79.88223556,1.4330753796,85.98452278,1.43403441683},
                    new double [] {10000,10,1,6.451599995,10000,8598.452279,798.8223556,14.330753796,859.8452278,14.3403441683},
                    new double [] {1550.003101207,1.550003101207,0.1550003101207,1,1550.003101207,1332.762769803,123.8177128493,2.221271282642,133.2762769647,2.222757793322},
                    new double [] {1,0.001,0.0001,0.0006451599995,1,0.8598452279,0.07988223556,0.0014330753796,0.08598452278,0.00143403441683},
                    new double [] {1.162999999945,0.001162999999945,0.0001162999999945,0.0007503210793827,1.162999999945,1,0.09290303995185,0.001666666666395,0.09999999998835,0.001667782026694},
                    new double [] {12.51842782052,0.01251842782052,0.001251842782052,0.008076388886427,12.51842782052,10.76391042228,1,0.01793985070089,1.076391042104,0.01795185633923},
                    new double [] {697.8000000803,0.6978000000803,0.06978000000803,697.8000000803,600.0000000977,55.74182398019,1,60.00000000279,1.000669216179},
                    new double [] {11.6300000008,0.0116300000008,0.00116300000008,0.0075032107947,11.6300000008,10.00000000116,0.9290303996263,0.01666666666589,1,0.01667782026888},
                    new double [] {697.3333333314,0.6973333333314,0.06973333333314,0.4498915729834,697.3333333314,599.5987389206,55.70454559702,0.9993312313716,59.95987388509,1}
                };
        //�����������        
        if(jComboBox1.getSelectedItem().toString().equals("���� �� ��. ����"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[0][jComboBox2.getSelectedIndex()]));
              
            }
        if(jComboBox1.getSelectedItem().toString().equals("�������� �� ��. ����"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[1][jComboBox2.getSelectedIndex()]));
            }
        if(jComboBox1.getSelectedItem().toString().equals("���� �� ��. ���������"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[2][jComboBox2.getSelectedIndex()]));
            }
        if(jComboBox1.getSelectedItem().toString().equals("���� �� ��. ����"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[3][jComboBox2.getSelectedIndex()]));
            }
        if(jComboBox1.getSelectedItem().toString().equals("������ � ������� �� ��. ����"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[4][jComboBox2.getSelectedIndex()]));
            }
        if(jComboBox1.getSelectedItem().toString().equals("����������� (����.) � ��� �� ��. ����"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[5][jComboBox2.getSelectedIndex()]));
            }
        if(jComboBox1.getSelectedItem().toString().equals("����������� (����.) � ��� �� ��. ���"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[6][jComboBox2.getSelectedIndex()]));
            }
        if(jComboBox1.getSelectedItem().toString().equals("������� (����.) � ������ �� ��. ���������"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[7][jComboBox2.getSelectedIndex()]));
            }
        if(jComboBox1.getSelectedItem().toString().equals("������� (����.) � ��� �� ��. ���������"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[8][jComboBox2.getSelectedIndex()]));
            }
        if(jComboBox1.getSelectedItem().toString().equals("������� (����.) � ������ �� ��. ���������"))
            {
              jLabelAnswer.setText("�����: "+ Convert(parseDouble(jTextField1.getText()),coef[9][jComboBox2.getSelectedIndex()]));
            }
              }
              //����������� ���� ��� �� ����� �������� 
                          catch(NumberFormatException p){
                 JFrame frame = new JFrame("Show Message Box");
                 jOptionPaneMessage = new JOptionPane();
                 JOptionPane.showMessageDialog(frame, "������� ��������");
                 
                 jLabelAnswer.setText("������");
              }
          }
          //����� �� ��������� ��������
          if(e.getSource()== jButtonExit){
                HomePage f = new HomePage ("���������");
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(450, 500);
                f.setResizable(false);
                f.setLocationRelativeTo(null);
                dispose();  
          }
          //������� �����
          if(e.getSource()== jButtonClear){
            jTextField1.setText("");
            jLabelAnswer.setText("�����: ");
            jLabel1.setText("");
            jLabel2.setText("");
            jLabelInfo = new JLabel("<html>"
                    + "<div style='text-align: justify; width:140px; margin-right:5px;'>� ������� ���������� ����� ������ ��������������� ���� ���������� �������� � ������</div>"
                    + "</html>");
          }
           if(e.getSource()== jButtonAuthor){
                Author f = new Author();
                f.setLocationRelativeTo(null);
                dispose();  
          }
               if(e.getSource()== jButtonAbout){
                About f = new About();
                f.setLocationRelativeTo(null);
                dispose();  
          }
        }
    }
}