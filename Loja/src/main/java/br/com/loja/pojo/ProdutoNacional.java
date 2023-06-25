package br.com.loja.pojo;

import br.com.loja.enums.Tamanho;
import br.com.loja.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {

    private double impostoNacional;

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor){
        if (novoValor > 100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 100");
        }
    }

    public double getImpostoNacional(){
        return this.impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional){
        this.impostoNacional = novoImpostoNacional;
    }

    public String getDadosFavoritos(){
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}