import java.util.*;

public class Main {
    public static void main(String[] args) {
        Articolo article1 = new Articolo("Pizza", 1.50);
        Articolo article2 = new Articolo("Coca cola", 0.50);
        Articolo article3 = new Articolo("Tiramisù", 1.00);

        //mutable (se creato da 0 possiamo modificare/eliminare elementi)
        Map<String, Articolo> articoliCategorizzati = new HashMap<>();
        articoliCategorizzati.put("Cibo", article1);
        articoliCategorizzati.put("Bibita", article2);
        articoliCategorizzati.put("Dolce", article3);
        System.out.println("articoliCategorizzati: " + articoliCategorizzati);

        Articolo doppio = new Articolo("Pizza", 1.50);

        System.out.println(article1.nome()); //abbiamo metodo .nome

        Boolean sonoUguali = article1.equals(doppio);
        System.out.println(sonoUguali);

    }
}