import java.util.Scanner;

public class test {
    public static int returnIndeks(int[] arr, int indeks) {
        if (indeks < 0 || indeks >= arr.length) {
            throw new IndexOutOfBoundsException();
        }
        return arr[indeks];
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 7, 8, 9, 11, 44, 22};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir indeks giriniz : ");
        int indeks = scanner.nextInt();

        try {
            int eleman = returnIndeks(arr, indeks);
            System.out.println("indeksteki eleman : " + eleman);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dizi boyutun dışında !!");
        }

    }
}