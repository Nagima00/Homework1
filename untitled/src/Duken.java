

import java.util.*;

public class Duken<T extends Kitap> implements DukenOperations<T> {
    private List<T> kitapList;
    private Map<String, T> satilganKitaplar;

    public Duken() {
        this.kitapList = new ArrayList<>();
        this.satilganKitaplar = new HashMap<>();
    }

    public void addBook(T kitap) {
        kitapList.add(kitap);
        System.out.println("Кітап қосылды: " + kitap);
    }

    public void kitapKaitaru(String isbn) throws BookNotFoundException {
        if (satilganKitaplar.containsKey(isbn)) {
            T kitap = satilganKitaplar.remove(isbn);
            kitapList.add(kitap);
            System.out.println("Кітап қайтарылды: " + kitap.getTitle());
        } else {
            throw new BookNotFoundException("Бұл кітап дүкеннен алынбаған: " + isbn);
        }
    }


    public void kitapKorset() {
        for (T kitap : kitapList) {
            System.out.println(kitap);
        }
    }
}


