package br.com.loja;

import br.com.loja.enums.Tamanho;
import br.com.loja.pojo.ItemIncluso;
import br.com.loja.pojo.Produto;
import br.com.loja.pojo.ProdutoInternacional;
import br.com.loja.pojo.ProdutoNacional;
import java.util.ArrayList;
import java.util.List;

public class LojaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.GRANDE);

        // Outras Propriedades
        meuProduto.setValor(0);

        // Itens Inclusos
        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Playstation 5", 1);
        itensInclusos.add(primeiroItemIncluso); // 0

        ItemIncluso segundoItemIncluso = new ItemIncluso("Cabo HMDI 2.1", 1);
        itensInclusos.add(segundoItemIncluso); // 1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de Energia", 1);
        itensInclusos.add(terceiroItemIncluso); // 2

        ItemIncluso quartoItemIncluso = new ItemIncluso("God of War", 1);
        itensInclusos.add(quartoItemIncluso); // 3

        ItemIncluso quintoItemIncluso = new ItemIncluso("Controle Dual Sense", 1);
        itensInclusos.add(quintoItemIncluso); // 4

        meuProduto.setItensInclusos(itensInclusos);


        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());


        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Estes foram os itens que acompanham o Produto");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.GRANDE);
        meuProdutoNacional.setImpostoNacional(0.5677);
        System.out.println(meuProdutoNacional.getMarca());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.GRANDE);
        meuProdutoInternacional.setTaxaDeImportacao(1.85);
        System.out.println(meuProdutoInternacional.getMarca());
    }
}
