//Produto.java

// Classe abstrata Produto
abstract class Produto {
    // Atributos da classe
    private String nome;
    private String categoria;
    private double preco;
    private int quantidade;

    // Construtor da classe Produto
    public Produto(String nome, String categoria, double preco, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getters e setters para acessar e modificar os atributos privados
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método abstrato para exibir as informações do produto
    public abstract void exibirProduto();
}

// Classe concreta ProdutoPerecivel que herda de Produto
class ProdutoPerecivel extends Produto {
    private String dataValidade;

    // Construtor da classe ProdutoPerecivel
    public ProdutoPerecivel(String nome, String categoria, double preco, int quantidade, String dataValidade) {
        super(nome, categoria, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    // Método getter e setter para a data de validade
    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Implementação do método abstrato exibirProduto
    @Override
    public void exibirProduto() {
        System.out.println("Nome do Produto: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Quantidade em Estoque: " + getQuantidade());
        System.out.println("Data de Validade: " + dataValidade);
        System.out.println("----------------------------");
    }
}

// Classe concreta ProdutoNaoPerecivel que herda de Produto
class ProdutoNaoPerecivel extends Produto {
    private String tipo;

    // Construtor da classe ProdutoNaoPerecivel
    public ProdutoNaoPerecivel(String nome, String categoria, double preco, int quantidade, String tipo) {
        super(nome, categoria, preco, quantidade);
        this.tipo = tipo;
    }

    // Método getter e setter para o tipo de produto
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Implementação do método abstrato exibirProduto
    @Override
    public void exibirProduto() {
        System.out.println("Nome do Produto: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Quantidade em Estoque: " + getQuantidade());
        System.out.println("Tipo de Produto: " + tipo);
        System.out.println("----------------------------");
    }
}


