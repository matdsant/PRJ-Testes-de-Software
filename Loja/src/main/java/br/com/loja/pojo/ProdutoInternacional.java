package br.com.loja.pojo;

import br.com.loja.enums.Tamanho;
import br.com.loja.interfaces.Favorito;

// Abaixo temos um exemplo de Herança, com o uso de Extends
public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaDeImportacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor){
        if (novoValor > 100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 100");
        }
    }

    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}