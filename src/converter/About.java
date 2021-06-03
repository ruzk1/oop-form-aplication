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
        //Конструктор
        super("О программе");
        this.setSize(600, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        jButtonReturn = new JButton("Назад");
        jButtonReturn.setBackground(new Color(255,255,255));
        jLabel1 = new JLabel("<html><div style='text-align:center'>О программе"
                + "<div style='text-align: center; padding-top: 40px'>Данное приложения создано для конвертации единиц измерения, в данном случае единиц измерения потока тепла"
                + "</html>");
        jLabel1.setFont(new Font("arial", Font.BOLD, 18));
        add(jButtonReturn,BorderLayout.SOUTH);
        add(jLabel1,BorderLayout.CENTER);
        //Добавление Лисенеров
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