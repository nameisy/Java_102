package PatikaStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Magaza {

    private List<Marka> markalar;
    private List<Urun> cepTelefonlari;
    private List<Urun> noteBooklar;

    public Magaza() {
        this.markalar = new ArrayList<>();
        this.cepTelefonlari = new ArrayList<>();
        this.noteBooklar = new ArrayList<>();
        //Marka ekleme.
        markalar.add(new Marka(1, "Apple"));
        markalar.add(new Marka(2, "Asus"));
        markalar.add(new Marka(3, "Casper"));
        markalar.add(new Marka(4, "HP"));
        markalar.add(new Marka(5, "Huawei"));
        markalar.add(new Marka(6, "Lenovo"));
        markalar.add(new Marka(7, "Monster"));
        markalar.add(new Marka(8, "Samsung"));
        markalar.add(new Marka(9, "Xiaomi"));
        markalar.sort(Comparator.comparing(Marka :: getName)); //Alfabetik sıralama.
    }

    public void urunEkle(Urun urun, int techSecim) {
        if (urun instanceof Urun) {
            for (Marka marka : markalar) {
                if (urun.getMarka().getName().equals(marka.getName())) {
                    if (techSecim == 1) {
                        cepTelefonlari.add(urun);
                    } else {
                        noteBooklar.add(urun);
                    }
                    break;
                }
            }
        }
    }

    public void urunSil(int urunId) {
        cepTelefonlari.removeIf(urun -> urun.getId() == urunId);
        noteBooklar.removeIf(urun -> urun.getId() == urunId);
    }

    public void urunListele() {
        System.out.println("Notebook Listesi");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                     | Fiyat     | Marka     | Depolama    | Ekran     | RAM       |");
        System.out.println("---------------------------------------------------------------------------------------------------");
        for (Urun urun : noteBooklar) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-11d | |\n", urun.getId(), urun.getUrunAdi(), urun.getBirimFiyatı(), urun.getMarka(), urun.getDepolama(), urun.getEkranBovutu(), urun.getRam());
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Cep Telefonu Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka    | Depolama    | Ekran     | Kamera     | Pil       | RAM       | Renk      | ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        for (Urun urun : cepTelefonlari) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-11d | |\n", urun.getId(), urun.getUrunAdi(), urun.getBirimFiyatı(), urun.getMarka(), urun.getDepolama(), urun.getEkranBovutu(), urun.getKamera(), urun.getPilGucu(), urun.getRam(), urun.getRam(), urun.getRenk());
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    public void markaListele() {
        System.out.println("| ID | Marke Adı |");
        for (Marka marka : markalar) {
            System.out.format("| %-1d | %-1s   |\n", marka.getId(), marka.getName());
        }
    }
        public Marka getMarkaById(int id) {
            for (Marka marka : markalar) {
                if (marka.getId() == id) {
                    return marka;
                }
            }
            return null;
        }
    }

