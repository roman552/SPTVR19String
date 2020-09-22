/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19string;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("---String---");
        String text1 = "Съешь же ещё этих мягких французских булок да выпей чаю";
        String text2 = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] text2Array = text2.toCharArray();
        boolean a = true;
        System.out.println("Ваша строка: "+text1);
        System.out.println("Русский алфавит: "+text2);
        text1 = text1.replace(" ", "");
        text1 = text1.replace(".", "");
        text1 = text1.replace(",", "");
        text1 = text1.toLowerCase();
        char[] text1Array = text1.toCharArray();
        int t = 0;
        for (int i = 0; i < 33;) {
            for (int j = 0; j < text1Array.length;) {
                if (text2Array[i]==text1Array[j]) {
                    i++;
                    t++;
                    j=0;
                    if (i==33) { 
                        if (t==33) {
                            System.out.println("Строка содержит все буквы русского алфавита!");
                            a = false;
                            break;
                        }
                    }
                }
                else {
                    if (j+1 == text1Array.length) {
                        System.out.println("Строка НЕ содержит все буквы русского алфавита!");
                        a =false;
                        break;                       
                    }
                    if (j<text1Array.length) {
                        if (i <= 33) {
                            j++;
                        }
                    }
                }
            }
            if (a==false) {
                System.out.println("---Конец программы---");
                break;
            }
        }
    }
}
