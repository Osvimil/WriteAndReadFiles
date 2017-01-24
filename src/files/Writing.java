/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author oswaldosaldivar
 */
public class Writing {
    
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("Datos.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        Scanner sc = new Scanner(System.in);
        String cadena1;
        String seguir = "";
        
        do{
            System.out.println("Write whatever you want");
            cadena1 = sc.nextLine();
            bw.write(cadena1);
            bw.newLine();
            System.out.println("One more time Y/N?");
            seguir = sc.nextLine();
        
        }while(!seguir.equalsIgnoreCase("no"));
        bw.close();
        fw.close();
        
        
    }
    
}
