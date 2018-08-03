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
public class PautaRandomica extends Principal {

    boolean loop = false;

    public int geradorrandomico() {
        Random gerador = new Random();
        for (int i = 0; i < 1; i++) {
        }
        int resultado = gerador.nextInt(9);
        return resultado;
    }

    public boolean primeiraLinha() {
        Scanner sc = new Scanner(System.in);
        Principal reset = new Principal();
        int sair = 0;
        do {
            System.out.println("Qual é a nota na LINHA 1?");
            String opcao0 = (sc.nextLine());
            if (opcao0.equals("G")) {
                System.out.println("***** CORRETO É A NOTA G *****");
                System.out.println("___________________________________");
                System.out.println();
//                sc.nextLine();
                sair = 0;
                reset.main();
            } else {
                System.out.println("ERRADO ** CONTINUI TENTANDO!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();
                sair = 1;
            }
        } while (sair != 0);

        return true;
    }

    public boolean primeiroEspaco() {
        Scanner sc = new Scanner(System.in);
        Principal reset = new Principal();
        int sair = 0;
        do {
            System.out.println("Qual é a nota no ESPAÇO 1?");
            String opcao0 = (sc.nextLine());
            if (opcao0.equals("A")) {
                System.out.println("***** CORRETO É A NOTA A *****");
                System.out.println("___________________________________");
                System.out.println();
//                sc.nextLine();
                sair = 0;
                reset.main();
            } else {
                System.out.println("ERRADO ** CONTINUI TENTANDO!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();
                sair = 1;
            }
        } while (sair != 0);

        return true;
    }

    public boolean segundaLinha() {
        Scanner sc = new Scanner(System.in);
        Principal reset = new Principal();
        int sair = 0;
        do {
            System.out.println("Qual é a nota na LINHA 2?");
            String opcao0 = (sc.nextLine());
            if (opcao0.equals("B")) {
                System.out.println("***** CORRETO É A NOTA B *****");
                System.out.println("___________________________________");
                System.out.println();
//                sc.nextLine();
                sair = 0;
                reset.main();
            } else {
                System.out.println("ERRADO ** CONTINUI TENTANDO!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();
                sair = 1;
            }
        } while (sair != 0);
        return false;
    }

    public boolean segundoEspaco() {
        Scanner sc = new Scanner(System.in);
        Principal reset = new Principal();
        int sair = 0;
        do {
            System.out.println("Qual é a nota no ESPAÇO 2?");
            String opcao0 = (sc.nextLine());
            if (opcao0.equals("C")) {
                System.out.println("___________________________________");
                System.out.println();
//                sc.nextLine();
                sair = 0;
                reset.main();

            } else {
                System.out.println("ERRADO ** CONTINUI TENTANDO!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();
                sair = 1;
            }
        } while (sair != 0);
        return false;
    }

    public boolean terceiraLinha() {
        Scanner sc = new Scanner(System.in);
        Principal reset = new Principal();
        int sair = 0;
        do {
            System.out.println("Qual é a nota no LINHA 3?");
            String opcao0 = (sc.nextLine());
            if (opcao0.equals("D")) {
                System.out.println("***** CORRETO É A NOTA D *****");
                System.out.println("___________________________________");
                System.out.println();
//                sc.nextLine();
                sair = 0;
                reset.main();
            } else {
                System.out.println("ERRADO ** CONTINUI TENTANDO!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();
                sair = 1;
            }
        } while (sair != 0);
        return false;
    }

    public boolean terceiroEspaco() {
        Scanner sc = new Scanner(System.in);
        Principal reset = new Principal();
        int sair = 0;
        do {
            System.out.println("Qual é a nota no ESPAÇO 3?");
            String opcao0 = (sc.nextLine());
            if (opcao0.equals("E")) {
                System.out.println("***** CORRETO É A NOTA E *****");
                System.out.println("___________________________________");
                System.out.println();
//                sc.nextLine();
                sair = 0;
                reset.main();
            } else {
                System.out.println("ERRADO ** CONTINUI TENTANDO!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();
                sair = 1;
            }
        } while (sair != 0);
        return false;
    }

    public boolean quartaLinha() {
        Scanner sc = new Scanner(System.in);
        Principal reset = new Principal();
        int sair = 0;
        do {
            System.out.println("Qual é a nota na LINHA 4?");
            String opcao0 = (sc.nextLine());
            if (opcao0.equals("F")) {
                System.out.println("***** CORRETO É A NOTA F *****");
                System.out.println("___________________________________");
                System.out.println();
//                sc.nextLine();
                sair = 0;
                reset.main();
            } else {
                System.out.println("ERRADO ** CONTINUI TENTANDO!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();
                sair = 1;
            }
        } while (sair != 0);
        return false;
    }

    public boolean quartoEspaco() {
        Scanner sc = new Scanner(System.in);
        Principal reset = new Principal();
        int sair = 0;
        do {
            System.out.println("Qual é a nota no ESPAÇO 4?");
            String opcao0 = (sc.nextLine());
            if (opcao0.equals("G")) {
                System.out.println("***** CORRETO É A NOTA G ******");
                System.out.println("___________________________________");
                System.out.println();
//                sc.nextLine();
                sair = 0;
                reset.main();
            } else {
                System.out.println("ERRADO ** CONTINUI TENTANDO!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();
                sair = 1;
            }
        } while (sair != 0);
        return false;
    }

    public boolean quintaLinha() {
        Scanner sc = new Scanner(System.in);
        Principal reset = new Principal();
        int sair = 0;
        do {
            System.out.println("Qual é a nota LINHA 5?");
            String opcao0 = (sc.nextLine());
            if (opcao0.equals("A")) {
                System.out.println("***** CORRETO É A NOTA A *****");
                System.out.println("___________________________________");
                System.out.println();
//                sc.nextLine();
                sair = 0;
                reset.main();
            } else {
                System.out.println("ERRADO ** CONTINUI TENTANDO!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();
                sair = 1;
            }
        } while (sair != 0);
        return false;
    }

}
