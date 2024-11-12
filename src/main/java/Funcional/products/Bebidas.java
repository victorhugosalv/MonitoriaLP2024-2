package Funcional.products;

public class Bebidas extends Item{
    private String tipoDeBebida;
    private String volume;

    public Bebidas(String nome, String descricao, String etiqueta, double preco, String tipoDeBebida, String volume) {
        super(nome, descricao, etiqueta, preco);
        this.tipoDeBebida = tipoDeBebida;
        this.volume = volume;
    }

    public Bebidas(){}

    public String getTipoDeBebida() {
        return tipoDeBebida;
    }

    public void setTipoDeBebida(String tipoDeBebida) {
        this.tipoDeBebida = tipoDeBebida;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de Bebida: " + tipoDeBebida
                + "\nVolume: " + volume;
    }
}
