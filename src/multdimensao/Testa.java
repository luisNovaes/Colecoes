/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multdimensao;

/**
 *
 * @author luis.silva/* To change this license header, choose License Headers in
 * Project Properties. To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luis.silva
 */
public class Testa {

    public static void main(String[] args) {
        dadosPessoas();
    }

    public static void dadosPessoas() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Digite a nota da  respectiva corda");
            System.out.println("Opção 2 - Escalas");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                Random gerador = new Random();

                for (int i = 0; i < 1; i++) {
                }
                int resultado = gerador.nextInt(8);
                int sair = 0;
                do {
                    if (resultado == 0) {
                        System.out.println("Qual é a nota na LINHA 1?");
                        String opcao0 = (sc.nextLine());
                        if (opcao0.equals("G")) {
                            System.out.println("Isso mesmo, a primeira linha corresponde a nota G");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 0;
                        } else {
                            System.out.println("CONTINUI TENTANDO!");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 1;
                        }
                    }
                } while (sair != 0);

                do {
                    if (resultado == 1) {
                        System.out.println("Qual é a nota no ESPAÇO 1?");
                        String opcao0 = (sc.nextLine());
                        if (opcao0.equals("A")) {
                            System.out.println("Isso mesmo, o primeiro espaço corresponde a nota A");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 0;
                        } else {
                            System.out.println("CONTINUI TENTANDO!");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 1;
                        }
                    }
                } while (sair != 0);

                do {
                    if (resultado == 2) {
                        System.out.println("Qual é a nota na LINHA 2?");
                        String opcao0 = (sc.nextLine());
                        if (opcao0.equals("B")) {
                            System.out.println("Isso mesmo, a segunda linha corresponde a nota B");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 0;
                        } else {
                            System.out.println("CONTINUI TENTANDO!");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 1;
                        }
                    }
                } while (sair != 0);

                do {
                    if (resultado == 3) {
                        System.out.println("Qual é a nota no ESPAÇO 2?");
                        String opcao0 = (sc.nextLine());
                        if (opcao0.equals("C")) {
                            System.out.println("Isso mesmo, o segundo espaço corresponde a nota C");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 0;
                        } else {
                            System.out.println("CONTINUI TENTANDO!");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 1;
                        }
                    }
                } while (sair != 0);

                do {
                    if (resultado == 4) {
                        System.out.println("Qual é a nota no LINHA 3?");
                        String opcao0 = (sc.nextLine());
                        if (opcao0.equals("D")) {
                            System.out.println("Isso mesmo, o terceira linha corresponde a nota D");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 0;
                        } else {
                            System.out.println("CONTINUI TENTANDO!");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 1;
                        }
                    }
                } while (sair != 0);
                do {
                    if (resultado == 5) {
                        System.out.println("Qual é a nota no ESPAÇO 3?");
                        String opcao0 = (sc.nextLine());
                        if (opcao0.equals("E")) {
                            System.out.println("Isso mesmo, o terceiro espaço corresponde a nota E");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 0;
                        } else {
                            System.out.println("CONTINUI TENTANDO!");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 1;
                        }
                    }
                } while (sair != 0);
                do {
                    if (resultado == 6) {
                        System.out.println("Qual é a nota na LINHA 4?");
                        String opcao0 = (sc.nextLine());
                        if (opcao0.equals("F")) {
                            System.out.println("Isso mesmo, o quarta linha corresponde a nota F");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 0;
                        } else {
                            System.out.println("CONTINUI TENTANDO!");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 1;
                        }
                    }
                } while (sair != 0);

                do {
                    if (resultado == 7) {
                        System.out.println("Qual é a nota no ESPAÇO 4?");
                        String opcao0 = (sc.nextLine());
                        if (opcao0.equals("G")) {
                            System.out.println("Isso mesmo, o quarto espaço corresponde a nota G");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 0;
                        } else {
                            System.out.println("CONTINUI TENTANDO!");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 1;
                        }
                    }
                } while (sair != 0);

                do {
                    if (resultado == 8) {
                        System.out.println("Qual é a nota LINHA 5?");
                        String opcao0 = (sc.nextLine());
                        if (opcao0.equals("A")) {
                            System.out.println("Isso mesmo, o quinta linha corresponde a nota A");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 0;
                        } else {
                            System.out.println("CONTINUI TENTANDO!");
                            System.out.println("Pressione qualquer tecla para continuar!");
                            sc.nextLine();
                            sair = 1;
                        }
                    }
                } while (sair != 0);

                System.out.println();

                /**
                 * ******************************************************************************
                 */
            } else if (opcao == 2) {
                System.out.println("Em breve outro modulo!");
                System.out.println("Pressione qualquer tecla para continuar!");
                sc.nextLine();

            }
        } while (opcao != 0);

        sc.close();
    }
}
