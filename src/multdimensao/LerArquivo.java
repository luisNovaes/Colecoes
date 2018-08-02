/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multdimensao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author luis.silva
 */
public class LerArquivo {

    public static void lerTexto(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNext()) {
                System.out.print(sc.nextLine());
            }

            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        lerTexto("c:\\imprimir.txt ");
        System.out.println();
    }
}
