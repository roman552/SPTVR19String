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
        String text1 = "ac";
        char[] text1Array = text1.toCharArray();
        String text2 = "abc";
        char[] text2Array = text2.toCharArray();
        boolean a = true;
        System.out.println(text1Array);
        System.out.println(text2Array);
        for (int i = 0; i < text1Array.length;) {
            for (int j = 0; j < text2Array.length;) {
                if (text1Array[i]==text2Array[j]) {
                    i++;
                    j=0;
                    a = true;
                
                    if (i==text1Array.length) {
                        if (a==true) {
                            System.out.println("строка содержит алфавит");
                            break;
                        } else {
                            System.out.println("строка НЕ содержит алфавит");
                            break;
                        }
                    }
                } else {
                    j++;
                    a = false;
                    if (j==text1Array.length) {
                        if (a==true) {
                            System.out.println("строка содержит алфавит");
                            break;
                        } else {
                            System.out.println("строка НЕ содержит алфавит");
                            break;
                    
                    }
                }
            }
        }
        
        
    }
}
