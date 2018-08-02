/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multdimensao;

/**
 *
 * @author luis.silva
 */
public class Main {

    static final String[] linhaArray;
    static String[] espacoArray;

    static {
        linhaArray = new String[]{new String("LINHA -  A"),
            new String("ESPAÇO - G"), new String("LINHA -  F"),
            new String("ESPAÇO - E"), new String("LINHA -  D"),
            new String("ESPAÇO - C"), new String("LINHA -  B"),
            new String("ESPAÇO - A"), new String("LINHA -  G")};
    }

    public static void main(String args[]) {
        for (String linhaArray1 : linhaArray) {
            System.out.println(linhaArray1);

        }
    }

}
