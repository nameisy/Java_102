package PatikaStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Magaza magaza = new Magaza();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ürün EkLe");
            System.out.println("2. Ürünleri Listele");
            System.out.println("3. Ürün SiL");
            System.out.println("4. Marka Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seciminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();
            switch (secim) {
                case 1:
                    System.out.print("Ürün Adı: ");
                    String urunAdi = scanner.nextLine();
                    System.out.print("BIrim Flyat: ");
                    double birimFiyat = scanner.nextDouble();
                    System.out.print("Stok Miktara: ");
                    int stokMiktari = scanner.nextInt();
                    System.out.print("Marka ID: ");
                    int markaId = scanner.nextInt();
                    System.out.println("Cep Telofonu Eklemek icin 1' e basin..");
                    System.out.println("Notebook Eklemek icin 2' ye basin..");
                    int techSecim = scanner.nextInt();
                    scanner.nextLine();
                    Marka marka = magaza.getMarkaById(markaId);
                    if (marka != null) {
                        int depolama, kamera, ram;
                        double ekranBoyutu, pilGucu;
                        if (techSecim == 1) {
                            System.out.print("Depolama (GB): ");
                            depolama = scanner.nextInt();
                            System.out.print("Ekran Boyutu (inç): ");
                            ekranBoyutu = scanner.nextDouble();
                            System.out.print("Kamera (MP): ");
                            kamera = scanner.nextInt();
                            System.out.print("Pil GÜCü (mAh): ");
                            pilGucu = scanner.nextDouble();
                            scanner.nextLine();
                            Urun cepTelefonu = new Urun(birimFiyat, stokMiktari, urunAdi, marka, depolama, ekranBoyutu, kamera, pilGucu);
                            magaza.urunEkle(cepTelefonu, techSecim);
                        } else {
                            System.out.print("Depolama (GB): ");
                            depolama = scanner.nextInt();
                            System.out.print("RAM (GB): ");
                            ram = scanner.nextInt();
                            System.out.print("Ekran Boyuty (ing): ");
                            ekranBoyutu = scanner.nextDouble();
                            scanner.nextLine();
                            Urun notebook = new Urun(birimFiyat, stokMiktari, urunAdi, marka, depolama, ekranBoyutu, ram);
                            magaza.urunEkle(notebook, techSecim);
                        }
                        System.out.println("Urun eklendi!");
                    } else {
                        System.out.println("Geçersiz marka ID");
                    }
                    break;
                case 2:
                    magaza.urunListele();
                    break;
                case 3:
                    System.out.println("Silmek istediğiniz ürünü seçin");
                    int silinecekId = scanner.nextInt();
                    System.out.println("Urun silindi!");
                    break;
                case 4:
                    magaza.markaListele();
                    break;
                case 5:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}