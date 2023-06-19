package br.com.loja;

import br.com.loja.enums.Tamanho;
import br.com.loja.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        // Outras Propriedades
        meuProduto.setNome("Playstation 4");
        meuProduto.setMarca("Sony");
        meuProduto.setValor(4200.00);
        meuProduto.setTamanho(Tamanho.PEQUENO);

        // Itens Inclusos
        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("1 Controles");
        itensInclusos.add("3 Jogos");
        itensInclusos.add("1 Cabo de Energia");
        itensInclusos.add("1 Cabo HDMI 2.1");
        meuProduto.setItensInclusos(itensInclusos);

        // Testes
        System.out.println(meuProduto.getItensInclusos().get(3));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
    }
}
