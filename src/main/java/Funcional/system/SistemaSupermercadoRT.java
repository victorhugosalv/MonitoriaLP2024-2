package Funcional.system;

import Funcional.exceptions.EstoqueCheioException;
import Funcional.exceptions.ItemNaoEncontradoException;
import Funcional.exceptions.NaoExistemItensNoEstoqueException;
import Funcional.products.Item;

import java.util.ArrayList;
import java.util.List;

public class SistemaSupermercadoRT implements SistemaSupermercado{

    List<Item> estoque;
    private static final double TAMANHO_DO_ESTOQUE = 3;

    public SistemaSupermercadoRT() {
        this.estoque = new ArrayList<>();
    }

    @Override
    public void adicionarAoEstoque(Item item) throws EstoqueCheioException {
        calcularValorDeVenda(item);
        if (estoque.size() == TAMANHO_DO_ESTOQUE) {
            throw new EstoqueCheioException("ESTOQUE ESTÁ CHEIO");
        }
        estoque.add(item);
    }

    @Override
    public void removerDoEstoque(Item item) {
        //TODO
    }


    @Override
    public Item buscarItemNoEstoquePorEtiqueta(String etiqueta) throws ItemNaoEncontradoException {
        //TODO
        return null;
    }

    @Override
    public List<Item> listarTodosOsItensDoEstoque() throws NaoExistemItensNoEstoqueException {
        if (estoque.isEmpty()) {
            throw new NaoExistemItensNoEstoqueException("O ESTOQUE ESTÁ VAZIO!");
        }
        return estoque;
    }

    @Override
    public void calcularValorDeVenda(Item item) {
        double valor = item.getPreco() * 1.25;
        item.setPreco(valor);
    }
}
