import java.util.Scanner;
class TryCatchPratik {
    public static void main(String[] args) {

        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int indeks;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizideki elemanın indeksini girin: ");
        indeks = scanner.nextInt();

        try {
            System.out.println(dizi[indeks]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata! Dizin dışı bir indeks girildi. " + e.getMessage());
        }

    }

}