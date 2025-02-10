public interface DukenOperations<T extends Kitap> {
    void addBook(T kitap);
    void kitapSatipAl(String isbn) throws BookNotFoundException;
    void kitapKaitaru(String isbn) throws BookNotFoundException;
    void kitapKorset();
}


