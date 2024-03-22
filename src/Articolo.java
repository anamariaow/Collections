import java.util.Objects;

public record Articolo(String nome, Double prezzo) {
    public Articolo(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }
    public String nome;

    public String getNome() {
        return nome;
    }

    public Double prezzo;

    public Double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articolo articolo = (Articolo) o;
        return Objects.equals(nome, articolo.nome) && Objects.equals(prezzo, articolo.prezzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, prezzo);
    }
}