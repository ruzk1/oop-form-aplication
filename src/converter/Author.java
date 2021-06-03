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
        //Конструктор
        super("Об авторе");
        this.setSize(400, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        jButtonReturn = new JButton("Назад");
        jButtonReturn.setBackground(new Color(255,255,255));
         jLabel1 = new JLabel("<html>"
                + "<div style='text-align: center'>Группа Итс-9</div>"
                + "<div style='text-align: center; padding-top: 30px'>Тема: Разработка объектно-ориентированного приложения:  конвертор единиц измерения </div>"
                + "<div style='text-align: center'>Вариант 8: Единицы измерения потока тепла (поток тепла) </div>"
                + "<div style='text-align: center; padding-top: 190px'>Дятлов Станислав Андреевич"
                + "<div style='text-align: center'>Витебск, 2021"
                + "</html>");
        jLabel1.setFont(new Font("arial", Font.BOLD, 16));
        add(jLabel1,BorderLayout.CENTER);
        add(jButtonReturn,BorderLayout.SOUTH);
        //Добавление Лисенеров
        jButtonReturn.addActionListener(event);
    }
    
    public class Handler implements ActionListener {
      @Override
        //Возврат к главному окну
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