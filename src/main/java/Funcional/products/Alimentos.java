package Funcional.products;

public class Alimentos extends Item{

    private String tipoDeComida;
    private double peso;

    public Alimentos(String nome, String descricao, String etiqueta, double preco, String tipoDeComida, double peso) {
        super(nome, descricao, etiqueta, preco);
        this.tipoDeComida = tipoDeComida;
        this.peso = peso;
    }

    public Alimentos() {}

    public String getTipoDeComida() {
        return tipoDeComida;
    }

    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de Comida: " + tipoDeComida
                + "\nPeso: " + peso;
    }
}
