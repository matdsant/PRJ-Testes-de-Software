// Packages
package br.com.loja.pojo;

// Imports
import br.com.loja.enums.Tamanho;
import java.util.List;

public class Produto  {
    private String nome;
    private String marca;
    private double valor;
    private Tamanho tamanho;
    private List<String> itensInclusos;

    // Nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    // Marca
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    // Valor
    public double getValor(){
        return this.valor;
    }

    public void setValor(double novoValor){
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }
    }

    // Tamanho
    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }

    // Itens Inclusos
    public List<String> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<String> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
