package KitapSiralayici;

public class Book implements Comparable<Book> {

    String isim;
    int sayfaSayisi;
    String yazar;
    int yayinTarihi;

    public Book(String isim, int sayfaSayisi, String yazar, int yayinTarihi) {
        this.isim = isim;
        this.sayfaSayisi = sayfaSayisi;
        this.yazar = yazar;
        this.yayinTarihi = yayinTarihi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(int yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }

    @Override
    public int compareTo(Book o) {
        return this.getIsim().compareTo(o.getIsim()); // Kitapları isme göre sıralar (A'dan Z'ye)
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "isim='" + isim + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +
                ", yazar='" + yazar + '\'' +
                ", yayinTarihi=" + yayinTarihi +
                '}';
    }
}
