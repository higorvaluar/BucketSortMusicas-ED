// Classe que representa uma música com nome e número de reproduções
public class Musica {
    private String nome;
    private int plays;

    // Construtor para inicializar os atributos da música
    public Musica(String nome, int plays) {
        this.nome = nome;
        this.plays = plays;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getPlays() {
        return plays;
    }

    // Representação em texto da música para facilitar a exibição
    @Override
    public String toString() {
        return nome + " (" + plays + " plays)";
    }
}