/**
          *���������� ������, � ������� ��������� �����
 */
package CharCalc;
/**
          *���������� ��������� ��� �������� ���������� �����
 */
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
/**
 * ���������� ������ FirstB
 */
public class FirstB implements ActionListener {
public void actionPerformed(ActionEvent event){
/**
 * ������� ����� ����"����������"
 */
 JFrame frame = new JFrame("����������");
 /**
  * ������� ����� ������ panel
  */
JPanel panel = new JPanel();
/**
 * ������� ����� ������ panel1
 */
JPanel panel1 = new JPanel();
/**
 * ������� ����� ������ panel2
 */
JPanel panel2 = new JPanel();
/**
 * ������� ����� ������ panel3
 */
JPanel panel3 = new JPanel();
/**
 * ������� ����� ������ panel4
 */
JPanel panel4 = new JPanel();
/**
 * ������� ������ ��� �������� ��������
 */
JButton countButton = new JButton("��������� ���������� ��������");
/**
 * ������� ������ ��� ������� ���������� ����
 */
JButton ochistButton = new JButton("��������");
/**
 *  ������� ������ ��� ������ �� ���������
 */
JButton exitButton = new JButton("�����");
/**
 * ������� � 1
 */
JLabel label=new JLabel("������� ��� �����:");
/**
 * ������� � 2
 */
JLabel label1=new JLabel("���������: ");
/**
 *  ������� ���� ��� ����� ������:
 *  */
final JTextArea area = new JTextArea("������� ���� ���� �����...",20, 50);
/**
 * ������� ������ ���������
 */
 JScrollPane scrollBar = new JScrollPane(area);
/**
 * ��������� ������ ��������� �� ��������� ����
 */
frame.getContentPane().add(scrollBar);
/**
 *  ������� ���� ��� ������ ����������
 */
final JTextField result = new JTextField(30);
/**
 * ���������� ��������� ��� �������� ����
 */
frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
/**
 * ������������� ������ ������������ ��������� �� �����
 */
frame.setLayout(new FlowLayout());
/**
 * ��������� ��������� �������� �������� ����
 */
frame.setResizable(false);  
/**
 * ��������� �������� ����
 */
frame.setSize(600, 500);
/**
 * ������ ����
 */
frame.setVisible(true);
/**
 * ��������� ����� ������
 */
panel1.setBackground(new Color(205,205,205));
/**
 * ��������� ����� ������
 */
panel3.setBackground(new Color(232,242,254));
/**
 * ��������� ����� ������ "�����"
 */
exitButton.setBackground(new Color(255,190,210));
/**
 * ��������� ����� ������ "��������� ���������� ��������"
 */
countButton.setBackground(new Color(165,226,179));
/**
 * ���������� ������ �� ����
 */
frame.add(panel);
/**
 * ���������� ������ �� ����
 */
frame.add(panel1);
/**
 * ���������� ������ �� ����
*/
frame.add(panel2);
/**
 * ���������� ������ �� ����
 */
frame.add(panel3);
/**
 * ���������� ������ �� ����
 */
frame.add(panel4);
/**
 * ���������� ������� � 1 �� ������
 */         
panel.add(label);
/**
 * ���������� ������ ��������� �� ������
 */
panel1.add(scrollBar);
/**
 * ���������� ������ "��������" �� ������
 */
panel2.add(ochistButton);
/**
 * ���������� ������ "��������� ���������� ��������" �� ������
 */
panel2.add(countButton);
/**
 * ���������� ������� � 2 �� ������
 */
panel3.add(label1);
/**
 * ���������� ��������� ���� �� ������
 */
panel3.add(result);
/**
 * ���������� ������ "�����" �� ������
 */
panel4.add(exitButton);
/**
 * ������ �� ���� � ���� ����������:
 */
result.setEditable(false);
/**
 * ���������� ������ �� ��������� �����:
 */
area.setLineWrap(true);
/**
 *  ������� ���� ������� �� ��������� ������:
 */
 area.setWrapStyleWord(true);
/**
 * ������� "���������" ��� ������ ������� ��������. ���� ����
 *  ��� ����� ������ �� ������, �� �������������� ���������� ��������
 *   � ����, ����� ������� ������:"������ ������� �����!"
 */
countButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0)
result.setText("���������� ��������: " + area.getText().length() + ". ���������� ����: " + area.getText().trim().split("\\s+").length);
else
result.setText("������ ������� �����!");
 }
});
/**
 * ������� "���������" ��� ������ ��������. ��� ��������� �������
 * ���� ��� ����� ������
 */
ochistButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
area.setText(null);
}
});
/**
 *  ������� "���������" ��� ������ ������
 */
exitButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
}    
}


