// Packages
package br.com.loja.pojo;

// Imports
import br.com.loja.enums.Tamanho;
import java.util.List;

public class Produto  {
    private String nome;
    private String marca;

    // Encapsulamento
    // 1. Atributo deve ser privado, "Protected" ou "Private"
    // 2. Criar um método para capturar o valor que está dentro dele
    // 3. Criar um método para adicionar o valor que está dentro dele
    // O privado do atributo é privado apenas para outras classes,
    // mas na própria classe é possível alterar os atributos;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;


    // Construtores
    public Produto(String marcaInicial, Tamanho tamanhoInicial){
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

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
    // Encapsulamento, criar o método para ser acessado
    public double getValor(){
        return this.valor;
    }

    // Parâmetro "double novoValor"
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
    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
