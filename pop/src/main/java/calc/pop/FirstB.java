/**Указание пакета, в котором находится код программы*/
package CharCalc;
/**Импортирование библиотек необходимых для работы программы*/
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**объявление класса FirstB */
public class FirstB implements ActionListener {
public void actionPerformed(ActionEvent event){
/**Создаем новое окно"Копирайтер"*/
 JFrame frame = new JFrame("Копирайтер");
 /**Создаем новую панель panel*/
JPanel panel = new JPanel();
/**Создаем новую панель panel1*/
JPanel panel1 = new JPanel();
/**Создаем новую панель panel2*/
JPanel panel2 = new JPanel();
/**Создаем новую панель panel3*/
JPanel panel3 = new JPanel();
/**Создаем новую панель panel4*/
JPanel panel4 = new JPanel();
/** Создаем кнопку для подсчета символов*/
JButton countButton = new JButton("Расчитать количество символов");
/** Создаем кнопку для очистки текстового поля*/
JButton ochistButton = new JButton("Очистить");
/** Создаем кнопку для выхода из программы*/
JButton exitButton = new JButton("Выход");
/**надпись № 1*/
JLabel label=new JLabel("Введите ваш текст:");
/**надпись № 2*/
JLabel label1=new JLabel("Результат: ");
/** Создаем поле для ввода текста:*/
final JTextArea area = new JTextArea("Введите сюда свой текст...",20, 50);
/**Создаем полосу прокрутки*/
 JScrollPane scrollBar = new JScrollPane(area);
/**Добавляем полосу прокрутки на текстовое поле*/
frame.getContentPane().add(scrollBar, FlowLayout());
/** Создаем поле для вывода результата*/
final JTextField result = new JTextField(30);
/** Завершение программы при закрытии окна*/
frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
/**Устанавливаем способ расположения элементов на форме*/
frame.setLayout(new FlowLayout());
/**Запрещаем изменение размеров главного окна*/
frame.setResizable(false);  
/** Установка размеров окна*/
frame.setSize(600, 500);
/** Запуск окна*/
frame.setVisible(true);
/**Установка цвета панели*/
panel1.setBackground(new Color(205,205,205));
/**Установка цвета панели*/
panel3.setBackground(new Color(232,242,254));
/**Установка цвета кнопки "Выход"*/
exitButton.setBackground(new Color(255,190,210));
/**Установка цвета кнопки "Расчитать количество символов"*/
countButton.setBackground(new Color(165,226,179));
/**Добавление панели на окно*/
frame.add(panel);
/**Добавление панели на окно*/
frame.add(panel1);
/**Добавление панели на окно*/
frame.add(panel2);
/**Добавление панели на окно*/
frame.add(panel3);
/**Добавление панели на окно*/
frame.add(panel4);
/**Добавление надписи № 1 на панель*/         
panel.add(label);
/**Добавление полосы прокрутки на панель*/
panel1.add(scrollBar);
/**Добавление кнопки "Очистить" на панель*/
panel2.add(ochistButton);
/**Добавление кнопки "Расчитать количество символов" на панель*/
panel2.add(countButton);
/**Добавление надписи № 2 на панель*/
panel3.add(label1);
/**Добавление текствого поля на панель*/
panel3.add(result);
/**Добавление кнопки "Выход" на панель*/
panel4.add(exitButton);
/** Запрет на ввод в поле результата:*/
result.setEditable(false);
/**Разделение текста на несколько строк:*/
area.setLineWrap(true);
/** Перенос слов целиком на следующую строку:*/
 area.setWrapStyleWord(true);
 
/** Создаем "слушателя" для кнопки расчета символов. Если поле для ввода текста не пустое, то подсчитывается количество символов и слов, иначе выводит ошибку:*/
countButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0)
result.setText("Количество символов: " + area.getText().length() + ". Количество слов: " + area.getText().trim().split("\\s+").length);
else
result.setText("Сперва введите текст!");
 }
});
/** Создаем "слушателя" для кнопки очистить. Она полностью очищает поле для ввода текста*/
ochistButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
area.setText(null);
}
});
/** Создаем "слушателя" для кнопки выхода*/
exitButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
}
private Object FlowLayout() {
return null;
}      
}
