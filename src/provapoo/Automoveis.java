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
public class Automoveis {

    String modelo;
    String Marca;
    float Ano;
    float Valor;
    int QuantidadeDePortas;

    public Automoveis() {
    }

    public Automoveis(String modelo, String Marca, float Ano, float Valor, int QuantidadeDePortas) {
        this.modelo = modelo;
        this.Marca = Marca;
        this.Ano = Ano;
        this.Valor = Valor;
        this.QuantidadeDePortas = QuantidadeDePortas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public float getAno() {
        return Ano;
    }

    public void setAno(float Ano) {
        this.Ano = Ano;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public int getQuantidadeDePortas() {
        return QuantidadeDePortas;
    }

    public void setQuantidadeDePortas(int QuantidadeDePortas) {
        this.QuantidadeDePortas = QuantidadeDePortas;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\nMarca: " + Marca + "\nAno: " + Ano + "\nValor: " + "$"+Valor + "\nPortas: " + QuantidadeDePortas;
    }
    
    
    

}
