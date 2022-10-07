package set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        /*Dadas as seguintes informações sobre minhas séries favoritas,
        crie um conjunto e ordene este conjunto exibindo:

        (nome - genero - tempo de episódio);
        Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
        Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
        Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
        */

        Set<Serie> serieSet = new HashSet<>() {{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("DARK", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        System.out.println("--\tOrdem aleatória\t--");
//        for (Serie serie : serieSet) {
//            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
//        }

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> serieLinked = new LinkedHashSet<>() {{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("DARK", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
//        for (Serie serie : serieLinked) {
//            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
//        }

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
//        Set<Serie> seriesTreeSet = new TreeSet<>(serieLinked);
//        for (Serie serie : seriesTreeSet) {
//            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
//        }

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> seriesTreeSet2 = new TreeSet<>(new ComparatorNomeGeneroTempoEpi());
        seriesTreeSet2.addAll(serieLinked);

        for (Serie serie : seriesTreeSet2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


        //Pra você
//        System.out.println("--\tOrdem gênero\t--");
//        System.out.println("--\tOrdem Tempo Episódio\t--");

    }


    static class Serie implements Comparable<Serie> {
        private String nome;
        private String genero;
        private Integer tempoEpisodio;

        public Serie(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEpisodio() {
            return tempoEpisodio;
        }

        @Override
        public String toString() {
            return "Serie -> " +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio= " + tempoEpisodio;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }

        @Override
        public int compareTo(Serie serie) {
            int tempoEpi = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());

            if (tempoEpi != 0) return tempoEpi;

            return this.getGenero().compareTo(serie.getGenero());
        }
    }

}

class ComparatorNomeGeneroTempoEpi implements Comparator<ExemploOrdenacaoSet.Serie> {

    @Override
    public int compare(ExemploOrdenacaoSet.Serie s1, ExemploOrdenacaoSet.Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        int genero = s1.getGenero().compareTo(s2.getGenero());

        if (nome != 0) return nome;
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}
