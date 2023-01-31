public class Mobil {
    private String merk, warna, jenis;
    private int kapmesin, penumpang;
    public Mobil(){
        this.merk="Honda";
        this.warna="Biru";
        this.jenis="Sedan";
        this.kapmesin=1500;
        this.penumpang=6;
    }
    public void setMerk(String m){
        this.merk=m;
    }
    public void setWarna(String w){
        this.warna=w;
    }
    public void setJenis(String j){
        this.jenis=j;
    }
    public void setKapmesin(int k){
        this.kapmesin=k;
    }
    public void setPenumpang(int p){
        this.penumpang=p;
    }
    public String getMerk(){
        return merk;
    }
    public String getWarna(){
        return warna;
    }
    public String getJenis(){
        return jenis;
    }
    public int getKapmesin(){
        return kapmesin;
    }
    public int getPenumpang(){
        return penumpang;
    }
    public void infoMobil(){
        System.out.println("Merk                : "+getMerk());
        System.out.println("Warna               : "+getWarna());
        System.out.println("Jenis               : "+getJenis());
        System.out.println("Kapasitas Mesin     : "+getKapmesin());
        System.out.println("Jumlah Penumpang    : "+getPenumpang());
    }
}
