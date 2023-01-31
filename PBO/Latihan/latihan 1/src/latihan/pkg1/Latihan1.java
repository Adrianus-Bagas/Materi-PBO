package latihan.pkg1;
public class Latihan1 {
    private String merk;
    private String BahanBakar;
    private int jmlhroda;
    
    public void setMerk(String m){
        this.merk=m;
    }
    public void setBahanBakar(String bb){
        this.BahanBakar=bb;
    }
    public void setJmlroda(int r){
        this.jmlhroda=r;
    }
    public String getMerk(){
        return merk;
    }
    public String getBahanBakar(){
        return BahanBakar;
    }
    public int getJmlroda(){
        return jmlhroda;
    }
    public void info(){
        System.out.println("Merk Kendaraan        : "+getMerk());
        System.out.println("Bahan Bakar Kendaraan : "+getBahanBakar());
        System.out.println("Jumlah roda Kendaraan : "+getJmlroda());
    }
    public static void main(String[] args) {
        Latihan1 k1=new Latihan1();
        Latihan1 k2=new Latihan1();
        k1.setMerk("Beat");
        k1.setBahanBakar("Bensin");
        k1.setJmlroda(2);
        k1.info();
        System.out.println();
        k2.setMerk("Avanza");
        k2.setBahanBakar("Solar");
        k2.setJmlroda(4);
        k2.info();
    }
}
