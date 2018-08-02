/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multdimensao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luis.silva
 */
public class PautaRandomica {

    public static void executarExpelho() {

        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        for (int i = 0; i < 1; i++) {
        }
        int resultado = gerador.nextInt(8);

        switch (resultado) {

            case 0:

                System.out.println("QUAL É A NOTA NA LINHA 1?");
                String opcao0 = (sc.nextLine());

                if (opcao0.equals("G")) {
                    System.out.println("Isso mesmo, a primeira linha corresponde a nota G");
                } else {
                    System.out.println("CONTINUI TENTANDO!");
                }
                break;

            case 1:
                System.out.println(" QUAL É A NOTA NO ESPACO 1");
                String opcao1 = (sc.nextLine());

                if (opcao1.equals("A")) {
                    System.out.println("Isso mesmo, a primeira linha corresponde a nota A");
                } else {
                    System.out.println("CONTINUI TENTANDO!");
                }
                break;

            case 2:
                System.out.println("QUAL É A NOTA NA LINHA 2");
                String opcao2 = (sc.nextLine());

                if (opcao2.equals("B")) {
                    System.out.println("Isso mesmo, a primeira linha corresponde a nota B");
                } else {
                    System.out.println("CONTINUI TENTANDO!");
                }
                break;

            case 3:
                System.out.println(" QUAL É A NOTA NO ESPACO 2");
                String opcao3 = (sc.nextLine());

                if (opcao3.equals("C")) {
                    System.out.println("Isso mesmo, a primeira linha corresponde a nota C");
                } else {
                    System.out.println("CONTINUI TENTANDO!");
                }
                break;

            case 4:
                System.out.println("QUAL É A NOTA NA LINHA 3");
                String opcao4 = (sc.nextLine());

                if (opcao4.equals("D")) {
                    System.out.println("Isso mesmo, a primeira linha corresponde a nota D");
                } else {
                    System.out.println("QUAL É A NOTA NA LINHA 1");
                    sc.nextLine();
                    System.out.println("CONTINUI TENTANDO!");
                }
                break;

            case 5:
                System.out.println("QUAL É A NOTA NO ESPACO 3");
                String opcao5 = (sc.nextLine());

                if (opcao5.equals("E")) {
                    System.out.println("Isso mesmo, a primeira linha corresponde a nota E");
                } else {
                    System.out.println("QUAL É A NOTA NA LINHA 1");
                    sc.nextLine();
                    System.out.println("CONTINUI TENTANDO!");
                }
                break;

            case 6:
                System.out.println("QUAL É A NOTA NA LINHA 4");
                String opcao6 = (sc.nextLine());

                if (opcao6.equals("F")) {
                    System.out.println("Isso mesmo, a primeira linha corresponde a nota F");
                } else {
                    System.out.println("QUAL É A NOTA NA LINHA 1");
                    sc.nextLine();
                    System.out.println("CONTINUI TENTANDO!");
                }
                break;

            case 7:
                System.out.println("QUAL É A NOTA NO ESPACO 4");
                String opcao7 = (sc.nextLine());

                if (opcao7.equals("G")) {
                    System.out.println("Isso mesmo, a primeira linha corresponde a nota G");
                } else {
                    System.out.println("QUAL É A NOTA NA LINHA 1");
                    sc.nextLine();
                    System.out.println("CONTINUI TENTANDO!");
                }
                break;

            case 8:
                System.out.println("QUAL É A NOTA NA LINHA 5");
                String opcao8 = (sc.nextLine());

                if (opcao8.equals("A")) {
                    System.out.println("Isso mesmo, a primeira linha corresponde a nota A");
                } else {
                    System.out.println("QUAL É A NOTA NA LINHA 1");
                    sc.nextLine();
                    System.out.println("CONTINUI TENTANDO!");
                }
                break;

            default:

                System.out.println("Este numero não é válido!");

        }
    }

    public static void main(String[] args) {
        executarExpelho();
    }
}
