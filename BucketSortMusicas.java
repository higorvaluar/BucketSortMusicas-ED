import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSortMusicas {

    // Metodo para ordenar as músicas usando Bucket Sort
    public static List<Musica> bucketSort(List<Musica> musicas) {
        // Criar 10 baldes (0-1M, 1-2M, ..., 9-10M)
        List<List<Musica>> baldes = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            baldes.add(new ArrayList<>());
        }

        // Distribuir as músicas nos baldes de acordo com o número de reproduções
        for (Musica musica : musicas) {
            int indice = Math.min(musica.getPlays() / 1_000_000, 9); // Garante que os valores acima de 9M fiquem no último balde
            baldes.get(indice).add(musica);
        }

        // Ordenar cada balde individualmente
        for (List<Musica> balde : baldes) {
            Collections.sort(balde, (a, b) -> a.getPlays() - b.getPlays()); // Ordena do menor para o maior número de plays
        }

        // Concatenar os baldes para formar a lista final ordenada
        List<Musica> resultado = new ArrayList<>();
        for (List<Musica> balde : baldes) {
            resultado.addAll(balde);
        }

        return resultado;
    }
}