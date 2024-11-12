package Funcional;

import Funcional.exceptions.EstoqueCheioException;
import Funcional.exceptions.ItemNaoEncontradoException;
import Funcional.exceptions.NaoExistemItensNoEstoqueException;
import Funcional.products.Alimentos;
import Funcional.products.Bebidas;
import Funcional.products.Item;
import Funcional.system.SistemaSupermercadoRT;

public class Main {
    public static void main(String[] args) {
        SistemaSupermercadoRT sistema = new SistemaSupermercadoRT();

        try {
            Bebidas bebida1 = new Bebidas("Coca-Cola", "Refrigerante", "001", 5.0, "Bebida Gaseificada", "2L");
            Bebidas bebida2 = new Bebidas("Suco de Laranja", "Suco Natural", "002", 10.0, "Suco", "1L");
            Alimentos alimento1 = new Alimentos("Arroz", "Arroz Branco", "003", 20.0, "Grãos", 1.0);

            sistema.adicionarAoEstoque(bebida1);
            sistema.adicionarAoEstoque(bebida2);
            sistema.adicionarAoEstoque(alimento1);

            for(Item item: sistema.listarTodosOsItensDoEstoque()){
                System.out.println(item);
                System.out.println("======================================================================================");
            }

            // Teste para adicionar um item extra e disparar a exceção EstoqueCheioException
            Alimentos alimento2 = new Alimentos("Feijão", "Feijão Preto", "004", 15.0, "Grãos", 1.0);
            sistema.adicionarAoEstoque(alimento2);

        } catch (EstoqueCheioException e) {
            System.out.println(e.getMessage());
        } catch (ItemNaoEncontradoException e) {
            System.out.println("Item não encontrado: " + e.getMessage());
        } catch (NaoExistemItensNoEstoqueException e) {
            System.out.println("Não existem itens no estoque: " + e.getMessage());
        }
    }
}
