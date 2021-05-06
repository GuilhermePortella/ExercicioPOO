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
public class SUV extends Automoveis {

    public double porcentagemDesconto(float valor) {
        double porcentagem = 0;
        float valorCarro, retorno;
        
        if (valor <= 5000) {
            System.out.println("Desconto 2%");
            retorno = (2f / 100);
            valorCarro = valor * retorno;
            
        } else if (valor > 5000.01 && valor <= 15000) {
            System.out.println("Desconto 5%");
            retorno = (5f / 100);
            valorCarro = valor * retorno;

        } else if (valor >= 15000.01 && valor <= 25000) {
            System.out.println("Desconto 15%");
            retorno = (15f / 100);
            valorCarro = valor * retorno;

        } else {
            System.out.println("Desconto 30%");
            retorno = (30f / 100);
            valorCarro = valor * retorno;
        }
        return valorCarro;
    }

    public double desconto(float valor) {
        
        double novoValorCarro = valor;
        double novoValorCarro1 = 0;

        novoValorCarro1 = porcentagemDesconto(valor);

        novoValorCarro = (valor - novoValorCarro1);

        return novoValorCarro;
    }

}
