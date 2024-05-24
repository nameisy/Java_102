package KitapSiralayici;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // 5 Kitap Oluşturma
        Book kitap1 = new Book("Küçük Prens", 120, "Antoine de Saint-Exupéry",1943);
        Book kitap2 = new Book("Suç ve Ceza", 672, "Fyodor Dostoyevski", 1866);
        Book kitap3 = new Book("1984", 328, "George Orwell", 1949);
        Book kitap4 = new Book("Savaş ve Barış", 1432, "Lev Tolstoy", 1869);
        Book kitap5 = new Book("Uğultgitulu Tepeler", 340, "Emily Brontë", 1847);

        // İsme Göre Sıralama (TreeSet Kullanımı)
        TreeSet<Book> kitaplarIsmeGore = new TreeSet<>();
        kitaplarIsmeGore.addAll(Arrays.asList(kitap1, kitap2, kitap3, kitap4, kitap5));

        System.out.println("İsme Göre Sıralı Kitaplar:");
        for (Book kitap : kitaplarIsmeGore) {
            System.out.println(kitap);
        }

        // Sayfa Sayısına Göre Sıralama (TreeSet Kullanımı)
        TreeSet<Book> kitaplarSayfaSayisinaGore = new TreeSet<>();
        kitaplarSayfaSayisinaGore.addAll(Arrays.asList(kitap1, kitap2, kitap3, kitap4, kitap5));

        System.out.println("\nSayfa Sayısına Göre Sıralı Kitaplar:");
        for (Book kitap : kitaplarSayfaSayisinaGore) {
            System.out.println(kitap);
        }
    }
}