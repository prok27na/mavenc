/**
 * Создаем "слушателя" для кнопки расчета стоимости текста
 */
resButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0);
/**
 * читаем с текстового поля текст, преобразуем в Double
*/
Double summ1a = Double.valueOf(obyem.getText());
/**
 * читаем с текстового поля текст, преобразуем в Double
 */
Double a = Double.valueOf(summa.getText());
a = a*(summ1a/100);
/**
 *  вывод обратно результата в текстовое поле
 */
resultS.setText(a.toString());
}
});
/**
 *  Создаем "слушателя" для кнопки очистить. Она
 *   полностью очищает поле для ввода текста
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
}
