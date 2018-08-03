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
public class Principal {

    public boolean main() {
        PautaRandomica pauta = new PautaRandomica();
        pauta.geradorrandomico();
        int resultado = pauta.geradorrandomico();

        switch (resultado) {
            case 0:
                pauta.primeiraLinha();
                System.out.println(resultado);
                break;
            case 1:
                pauta.primeiroEspaco();
                System.out.println(resultado);
                break;
            case 2:
                pauta.segundaLinha();
                System.out.println(resultado);
                break;
            case 3:
                pauta.segundoEspaco();
                System.out.println(resultado);
                break;
            case 4:
                pauta.terceiraLinha();
                System.out.println(resultado);
                break;
            case 5:
                pauta.terceiroEspaco();
                System.out.println(resultado);
                break;
            case 6:
                pauta.quartaLinha();
                System.out.println(resultado);
                break;
            case 7:
                pauta.quartoEspaco();
                System.out.println(resultado);
                break;
            case 8:
                pauta.quintaLinha();
                System.out.println(resultado);
                break;

            default:
                System.out.println("Este não é um parâmetro válido!");
        }
        return false;
    }

}
