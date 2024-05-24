import java.util.Scanner;

class TryCatchPratik {
    public static void main(String[] args) {

        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int indeks;
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan veri alma ve dizi indeksini isteme
        System.out.print("Dizideki elemanın indeksini girin: ");
        indeks = scanner.nextInt();
        System.out.print(indeks + ". indeks numarası: ");

        // Değerleri parametre olarak alır ve istenen elemanı döndürür.
        dondur(dizi, indeks);
    }

    // Try-catch bloğu ile hata kontrolü.
    public static void dondur(int[] dizi, int indeks) {
        try {
            System.out.println(dizi[indeks]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata! Dizin dışı bir indeks girildi. " + e.getMessage());
        }
    }
}