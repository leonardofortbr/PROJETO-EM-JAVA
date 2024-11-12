//SistemaEstoque.java
// Classe principal para testar o código
import java.util.List;
import java.util.ArrayList;

public class SistemaEstoque {
    public static void main(String[] args) {
        // Instância do estoque
        Estoque estoque = new Estoque();

        // Criando objetos de produtos perecíveis e não perecíveis
        ProdutoPerecivel carne = new ProdutoPerecivel("Carne Bovina", "Frigorífico", 25.0, 500, "01/01/2027");
        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", "Bebidas", 4.50, 300, "08/01/2027");
        ProdutoNaoPerecivel acucar = new ProdutoNaoPerecivel("Açúcar", "Mercearia", 3.70, 300, "Grãos");
        ProdutoPerecivel bolo = new ProdutoPerecivel("Bolo de chocolate", "Padaria", 15.00, 150, "02/11/2027");
        ProdutoNaoPerecivel cajuina = new ProdutoNaoPerecivel("Cajuína São Geraldo 2L", "Bebidas", 10.00, 200, "Refrigerante");

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(carne);
        estoque.adicionarProduto(leite);
        estoque.adicionarProduto(acucar);
        estoque.adicionarProduto(bolo);
        estoque.adicionarProduto(cajuina);

        // Exibindo informações dos produtos
        estoque.exibirProdutos();
    }
}

// Classe Estoque que gerencia os produtos
class Estoque {
    private  List<Produto> produtos;

    // Construtor da classe Estoque
    public  Estoque() {
        produtos = new ArrayList<>();
    }

    // Método para adicionar produtos ao estoque
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para exibir todos os produtos no estoque
    public void exibirProdutos() {
        System.out.println("Produtos disponíveis no armazém: ");
        for (Produto produto : produtos) {
            produto.exibirProduto();
        }
    }
}
