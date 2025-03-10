import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar uma lista de músicas
        List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica("Música A", 500_000)); // Menos popular
        musicas.add(new Musica("Música B", 2_500_000)); // Popular Moderada
        musicas.add(new Musica("Música C", 9_000_000)); // Muito Popular
        musicas.add(new Musica("Música D", 1_200_000)); // Popular Moderada
        musicas.add(new Musica("Música E", 7_800_000)); // Quase no topo do ranking

        // Ordenar as músicas usando Bucket Sort
        List<Musica> ordenadas = BucketSortMusicas.bucketSort(musicas);

        // Exibir o resultado ordenado por popularidade.
        System.out.println("Músicas ordenadas por popularidade:");
        for (Musica musica : ordenadas) {
            System.out.println(musica);
        }
    }
}