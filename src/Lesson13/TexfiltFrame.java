package Lesson13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class TexfiltFrame extends JFrame {
    JTextField textField1;

    JTextField textField2;
    JOptionPane optionPane;
    JTextField textField3;
    int count1  = 0;
    int count2  = 0;

    Scanner in = new Scanner(System.in);
    String s = MathOperation.randomMth(15);


    public TexfiltFrame() {
        super("Matemmatika");
        setLayout(new FlowLayout());
        textField1 = new JTextField(10);
        textField1.setText(s.substring(0,s.indexOf("=")+1));
        textField1.setSize(100,20);
        add(textField1);


        textField2 = new JTextField("0 "+(char)10004);
        textField2.setSize(20,10);
        add(textField2);

        textField3 = new JTextField("0 "+(char)10008);
        textField3.setSize(20,10);
        add(textField3);

        Handler handler = new Handler();
        textField1.addActionListener(handler);
    }
    private class  Handler implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==textField1&&count1+count2!=10){
                String s2 = textField1.getText();
                if (s.substring(s.indexOf("=")+2).equals(s2.substring(s2.indexOf("=")+1))){

                    Random random = new Random();
                    int ragbat = random.nextInt(9);
                    switch (ragbat){
                        case 0:{JOptionPane.showMessageDialog(null,"to'g'ri.!","Malades.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 1:{JOptionPane.showMessageDialog(null,"To'g'ri bratishka malades davom et!","Malatse.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 2:{JOptionPane.showMessageDialog(null,"Seni buyk kelajak kutmoqda!","Malloch.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 3:{JOptionPane.showMessageDialog(null,"to'g'ri.!","Malades.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 4:{JOptionPane.showMessageDialog(null,"To'xtab qomaymiza.!","Malades.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 5:{JOptionPane.showMessageDialog(null,"Davom etamiza.!","Malades.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 6:{JOptionPane.showMessageDialog(null,"To'g'ri oxirigacha!!!","Malades.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 7:{JOptionPane.showMessageDialog(null,"To'g'ri ozgina qoldi!!!","Malades.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 8:{JOptionPane.showMessageDialog(null,"Jichcha qoldi.! YANA OZGINA","Malades.!",JOptionPane.DEFAULT_OPTION);} break;

                    }
                    count1++;

                } else {
                    Random random = new Random();
                    int ragbat = random.nextInt(9);
                    switch (ragbat){
                        case 0:{JOptionPane.showMessageDialog(null,"XATO ISHLADINGU SHUNI HAM BILMAYSANMI.!","Xto.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 1:{JOptionPane.showMessageDialog(null,"XATO.!","Xto.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 2:{JOptionPane.showMessageDialog(null,"XATO-YU.! :(  YIB QO'YDING...","Xto.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 3:{JOptionPane.showMessageDialog(null,"XATO.!","Xto.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 4:{JOptionPane.showMessageDialog(null,"XATO SHUNAQASI HAM BO'LIB TURADI.! :)","Xto.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 5:{JOptionPane.showMessageDialog(null,"XATO.!","Xto.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 6:{JOptionPane.showMessageDialog(null,"KALLANGNI ISHLAT JIGAR :(","Xto.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 7:{JOptionPane.showMessageDialog(null,"XATO","Xto.!",JOptionPane.DEFAULT_OPTION);} break;
                        case 8:{JOptionPane.showMessageDialog(null,"SIQILMA HAMMASI YAXSHI BO'LADI.!","Xto.!",JOptionPane.DEFAULT_OPTION);} break;

                    }
                    count2++;
                }
                textField2.setText(Integer.toString(count1)+(char)10004);
                add(textField2);
                textField3.setText(Integer.toString(count2)+(char)10008);
                add(textField3);
                s = MathOperation.randomMth(10);
                textField1.setText(s.substring(0,s.indexOf("=")+1));
            }
            if (count1+count2==10){
                textField1.setText("TEST TUGADI.! :)");
                optionPane.showMessageDialog(null,"siz "+count1+"ta to'g'ri ishladingiz.!","TAMOM.!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
