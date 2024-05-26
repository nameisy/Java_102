package EnCokGecenKelimeyiBulma;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnCokGecenKelimeyiBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Metni giriniz: ");
        String metin = scanner.nextLine();
        // Metni kelimelere bölme
        String[] kelimeleriAyir = metin.split(" ");

        HashMap<String, Integer> kelimeSayilari = new HashMap<>();

        // Kelimeleri saym.
        for (String kelime : kelimeleriAyir) {
            kelime = kelime.toLowerCase(); // Küçük harfe çevirme(Büyük-küçük harf duyarlılığını kaldırmak için.)
            if (kelimeSayilari.containsKey(kelime)) {
                kelimeSayilari.put(kelime, kelimeSayilari.get(kelime) + 1);
            } else {
                kelimeSayilari.put(kelime, 1);
            }
        }
        // Ekrana sonuç yazdırma.
        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            System.out.println("Kelime: '" + entry.getKey() + "' - Geçiş sayısı: " + entry.getValue());

        }
    }
}
