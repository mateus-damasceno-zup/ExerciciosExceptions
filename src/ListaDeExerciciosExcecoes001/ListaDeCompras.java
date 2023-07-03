package ListaDeExerciciosExcecoes001;

public class ListaDeCompras {

    TiposDeAlimento tiposDeAlimento;
    private String nome;
    private Double peso;

    public ListaDeCompras(TiposDeAlimento tiposDeAlimento, String nome, Double peso) {
        this.tiposDeAlimento = tiposDeAlimento;
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "ListaDeCompras{" +
                "tiposDeAlimento=" + tiposDeAlimento +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
