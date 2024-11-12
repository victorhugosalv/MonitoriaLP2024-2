package Funcional.products;

public abstract class Item {

    private String nome;
    private String descricao;
    private String etiqueta;
    private double preco;

    public Item(String nome, String descricao, String etiqueta, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.etiqueta = etiqueta;
        this.preco = 0;
    }

    public Item() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Descrição: " + descricao + '\n' +
                "Etiqueta: " + etiqueta + '\n' +
                "Preço: " + preco ;
    }
}
