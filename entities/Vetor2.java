package entities;

public class Vetor2 {

    private String nome;
    private double price;

    // Constructor
    public Vetor2(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }


    // getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nome = "
                + getNome()
                + ", "
                + "Preço = "
                + getPrice();
    }

}
