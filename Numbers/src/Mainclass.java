
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Tekijä: Petri Rämö
 * Pvm: 23.02.2017
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.print("Anna tilinumero: ");
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String help2;
        help2 = br.readLine();
        String[] help = help2.split("");
        String account;
        
        error(help);

        Converter c = new Converter(help);
        
        account = c.getNew();
        
        System.out.print("Uusi tilinumero: ");
        System.out.println(account);
    }
    
    
    
    static void error(String[] help) {
        
        for (int t = 0; t < help.length; t++) {
            if (help[t].matches("[a-zA-Z]")) {
                System.out.println("Väärä syöte!");
                exit(0);
            }
        }
        
        int i = 0;
        while (!help[i].equals("-")) {
            i++;
        }

        if (i != 6) {
            System.out.println("Väärä syöte!");
            exit(0);
        }
        
        int y = 0;
        for (int u = 7; u < help.length; u++) {
            y = y + 1;

        }
        
        if (y < 2 || y > 8) {
            System.out.println("Väärä syöte!");
            exit(0);
        }
    }
}