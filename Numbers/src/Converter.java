/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Tekijä: Petri Rämö
 * Pvm: 23.02. 2017
 */
public class Converter {
    String[] old;
    String neww;

    
    public Converter(String[] help) {
        old = help;
        neww = converter(old);
    }
    
    public String getNew() {
        return neww;
    }
    
    static String converter(String[] help) {
        String account;
        if (help[0].equals("1") || help[0].equals("2") || help[0].equals("3") || help[0].equals("6") || help[0].equals("8")) {
            account = converting1(help);

        } else if (help[0].equals("4") || help[0].equals("5")) {
            account = converting2(help);
        } else {
            System.out.println("Väärä syöte!");
            account = "";
        }
        
        return account;
    }
    
    static String converting1(String[] help) {
        int i = 0;
        String num = "";
        while (!help[i].equals("-")) {
            num += help[i];
            i++;
        }
        int y = 0;

        for (int u = 7; u < help.length; u++) {
            y = y + 1;

        }
        y = 8 - y;
        while (y != 0) {
            num += 0;
            y = y - 1;

        }
        i++;
        for (int t = i; t < help.length; t++) {
            num += help[t];
        }

        String[] numhelp = num.split("");
        String num2 = "";

        for (int o = 0; o < (numhelp.length - 1); o++) {
            if (o % 2 == 0) {
                num2 += (Integer.parseInt(numhelp[o]) * 2);
            } else {
                num2 += Integer.parseInt(numhelp[o]);
            }

        }
        String[] numhelp2 = num2.split("");
        int num3 = 0;

        for (int o = 0; o < numhelp2.length; o++) {
            num3 = num3 + Integer.parseInt(numhelp2[o]);
        }

        while (num3 > 0) {
            num3 = num3 - 10;
        }

        num3 = num3 * (-1);
        numhelp[13] = String.valueOf(num3);

        String account = "";

        for (int t = 0; t < numhelp.length; t++) {
            account += numhelp[t];
        }
        
        return account;
    }
    
    static String converting2(String[] help) {
        int i = 0;
        String num = "";
        while (!help[i].equals("-")) {
            num += help[i];
            i++;
        }
        int y = 0;
        
        i++;
        num += help[i];
        i++;

        for (int u = 7; u < help.length; u++) {
            y = y + 1;

        }
        y = 8 - y;
        while (y != 0) {
            num += 0;
            y = y - 1;

        }
        
        for (int t = i; t < help.length; t++) {
            num += help[t];
        }

        String[] numhelp = num.split("");
        String num2 = "";

        for (int o = 0; o < (numhelp.length - 1); o++) {
            if (o % 2 == 0) {
                num2 += (Integer.parseInt(numhelp[o]) * 2);
            } else {
                num2 += Integer.parseInt(numhelp[o]);
            }

        }
        String[] numhelp2 = num2.split("");
        int num3 = 0;

        for (int o = 0; o < numhelp2.length; o++) {
            num3 = num3 + Integer.parseInt(numhelp2[o]);
        }

        while (num3 > 0) {
            num3 = num3 - 10;
        }

        num3 = num3 * (-1);
        numhelp[13] = String.valueOf(num3);

        String account = "";

        for (int t = 0; t < numhelp.length; t++) {
            account += numhelp[t];
        }
        
        return account;
    }
}
