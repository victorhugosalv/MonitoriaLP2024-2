package Funcional.system;

import Funcional.exceptions.EstoqueCheioException;
import Funcional.exceptions.ItemNaoEncontradoException;
import Funcional.exceptions.NaoExistemItensNoEstoqueException;
import Funcional.products.Item;

import java.util.List;

/**
 * Interface que define os métodos para o funcionamento de um sistema de supermercado.
 * O sistema deve permitir a adição, remoção, busca e listagem de itens no estoque, além de calcular o valor de venda de um item.
 */
public interface SistemaSupermercado {

    /**
     * Adiciona um item ao estoque do supermercado.
     *
     * @param item O item a ser adicionado ao estoque.
     * @throws EstoqueCheioException Se o estoque estiver cheio e não puder acomodar mais itens.
     */
    void adicionarAoEstoque(Item item) throws EstoqueCheioException;

    /**
     * Remove um item do estoque do supermercado.
     *
     * @param item O item a ser removido do estoque.
     * @throws ItemNaoEncontradoException Se o item não for encontrado no estoque.
     */
    void removerDoEstoque(Item item);

    /**
     * Busca um item no estoque através de sua etiqueta única.
     *
     * @param etiqueta A etiqueta única do item a ser buscado.
     * @return O item correspondente à etiqueta fornecida.
     * @throws ItemNaoEncontradoException Se o item não for encontrado no estoque.
     */
    Item buscarItemNoEstoquePorEtiqueta(String etiqueta) throws ItemNaoEncontradoException;

    /**
     * Lista todos os itens presentes no estoque do supermercado.
     *
     * @return Uma lista contendo todos os itens do estoque.
     * @throws NaoExistemItensNoEstoqueException Se não houver itens no estoque.
     */
    List<Item> listarTodosOsItensDoEstoque() throws NaoExistemItensNoEstoqueException;

    /**
     * Calcula o valor de venda de um item.
     *
     * @param item O item para o qual o valor de venda deve ser calculado.
     */
    void calcularValorDeVenda(Item item);
}
