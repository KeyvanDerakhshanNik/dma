/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.dma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author keyva
 */
public class dmaModel {
    // read a file 
    public String readFile(String f) {
        StringBuffer temp = new StringBuffer();
        File file = new File("resource//" + f + ".txt");
        Scanner sc;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                temp.append(sc.nextLine());
            }

        } catch (FileNotFoundException ex) {
            try {
                System.out.println("I can not read the file " + f + " so I created");
                file.createNewFile();
            } catch (IOException ex1) {
                System.out.println("I can not create the file");
            }

        }
        return temp.toString();

    }

    //write a file
    public void writeFile(String f, String l) {

        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("resource//" + f + ".txt");
            fileWriter.write(l);
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("I could not write" + f);
        }
    }
}
