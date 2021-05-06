/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

/**
 *
 * @author Guilherme
 */
public class Sedan extends Automoveis {

    public float Aumentoanual(float valor) {
        double porcentagem = 0;
        float valorCarro, retorno, teste;

        if (valor <= 5000) {
            System.out.println("Aumento 2%");
            retorno = (2f / 100);
            teste = valor * retorno;
            valorCarro = valor + teste;

        } else if (valor > 5000.01 && valor <= 15000) {
            System.out.println("Aumento 5%");
            retorno = (5f / 100);
            teste = valor * retorno;
            valorCarro = valor + teste;

        } else if (valor >= 15000.01 && valor <= 25000) {
            System.out.println("Aumento 15%");
            retorno = (15f / 100);
            teste = valor * retorno;
            valorCarro = valor + teste;

        } else {
            System.out.println("Desconto 10%");
            retorno = (10f / 100);
            teste = valor * retorno;
            valorCarro = valor - teste;
        }
        return valorCarro;
    }

}
