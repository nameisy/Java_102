package PatikaStore;

public class Urun {
    private static int idCounter = 1;
    private int id;
    private double birimFiyatı;
    private double indirimOrani;
    private int stokMiktarı;
    private String urunAdi;
    private Marka marka;
    private int depolama;
    private double ekranBovutu;
    private int kamera;
    private double pilGucu;
    private int ram;
    private String renk;

    public Urun(double birimFiyatı, int stokMiktarı, String urunAdi, Marka marka, int depolama, double ekranBovutu, int kamera, double pilGucu) {
        this.id = idCounter++;
        this.birimFiyatı = birimFiyatı;
        this.stokMiktarı = stokMiktarı;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.depolama = depolama;
        this.ekranBovutu = ekranBovutu;
        this.kamera = kamera;
        this.pilGucu = pilGucu;
    }

    public Urun(double birimFiyatı, int stokMiktarı, String urunAdi, Marka marka, int depolama, double ekranBovutu, int ram) {
        this.id = idCounter++;
        this.birimFiyatı = birimFiyatı;
        this.stokMiktarı = stokMiktarı;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.depolama = depolama;
        this.ekranBovutu = ekranBovutu;
        this.ram = ram;
    }

    public Urun(double birimFiyatı, double indirimOrani, int stokMiktarı, String urunAdi, Marka marka, int depolama, double ekranBovutu, int kamera, double pilGucu, int ram, String renk) {
        this.id = idCounter++;
        this.birimFiyatı = birimFiyatı;
        this.indirimOrani = indirimOrani;
        this.stokMiktarı = stokMiktarı;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.depolama = depolama;
        this.ekranBovutu = ekranBovutu;
        this.kamera = kamera;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public double getBirimFiyatı() {
        return birimFiyatı;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public int getStokMiktarı() {
        return stokMiktarı;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public Marka getMarka() {
        return marka;
    }

    public int getDepolama() {
        return depolama;
    }

    public double getEkranBovutu() {
        return ekranBovutu;
    }

    public int getKamera() {
        return kamera;
    }

    public double getPilGucu() {
        return pilGucu;
    }

    public int getRam() {
        return ram;
    }

    public String getRenk() {
        return renk;
    }
}
