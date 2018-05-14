/**
 * Создаем "слушателя" для кнопки расчета символов. Если поле
 *  для ввода текста не пустое, то подсчитывается количество символов
 *   и слов, иначе выводит ошибку:"Сперва введите текст!"
 */
countButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0)
result.setText("Количество символов: " + area.getText().length() + ". Количество слов: " + area.getText().trim().split("\\s+").length);
else
result.setText("Сперва введите текст!");
 }
});
/**
 * Создаем "слушателя" для кнопки очистить. Она полностью очищает
 * поле для ввода текста
 */
ochistButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
area.setText(null);
}
});
/**
 *  Создаем "слушателя" для кнопки выхода
 */
exitButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
}    
}
