/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

import javax.smartcardio.CardTerminals;

/**
 *
 * @author Guilherme
 */
public class ProvaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float vlor;

        SUV objsuv = new SUV();
        Sedan objSedan = new Sedan();

        objSedan.setMarca("BMW");
        objSedan.setModelo("M8");
        objSedan.setAno(2021);
        objSedan.setQuantidadeDePortas(4);
        objSedan.setValor(1136950);

        vlor = (float) objSedan.getValor();
        //////////////////////////

        objsuv.setMarca("BMW");
        objsuv.setModelo("X6");
        objsuv.setAno(2021);
        objsuv.setQuantidadeDePortas(4);
        objsuv.setValor(618950);
        //////////////////////////
        
        
        System.out.println(objsuv.toString());
        System.out.println("Valor com desconto: " + objsuv.desconto(objsuv.Valor));
        System.out.println("-----------------------------------");
        System.out.println(objSedan.toString());
        System.out.println("Aumento anual ficara no valor de: " + objSedan.Aumentoanual(vlor));
        System.out.println("-----------------------------------");

    }

}
