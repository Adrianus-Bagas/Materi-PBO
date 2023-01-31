public class kendaraanClass {
    private String warna;
    private int kapmesin;
    private String transmisi;
    //constructor non parameter//
    public kendaraanClass(){
        this.warna="Hitam";
        this.kapmesin=800;
        this.transmisi="manual";
    }
    //constructor berparameter//
    public kendaraanClass(String w, int k){
        this.warna=w;
        this.kapmesin=k;
    }
    public kendaraanClass(String wn, int km, String tt){
        this.warna=wn;
        this.kapmesin=km;
        this.transmisi=tt;
    }
    public void setWarna(String w){
        this.warna=w;
    }
    public void setKapmesin(int k){
        this.kapmesin=k;
    }
    public void setTransmisi(String t){
        this.transmisi=t;
    }
    public String getWarna(){
        return warna;
    }
    public int getKapmesin(){
        return kapmesin;
    }
    public String getTransmisi(){
        return transmisi;
    }
    public void info(){
        System.out.println("Warna           : "+getWarna());
        System.out.println("Kapasitas Mesin : "+getKapmesin());
        System.out.println("Transmisi       : "+getTransmisi());
    }
}
class truk extends kendaraanClass{
    private int ukuranBak;
    private String tipeTruk;
    public truk(String wn, int km, int ub){
        super(wn,km);
        this.ukuranBak=ub;                                             
    }
    public truk(String wn, int km, String tt, int ub){
        super(wn,km,tt);
        this.ukuranBak=ub;                                             
    }
    public void setUkuranBak(int u){
        this.ukuranBak = u;
    }
    public int getUkuranBak(){
        return ukuranBak;
    }
    public void setTipeTruk(String tp){
        this.tipeTruk=tp;
    }
    public String getTipeTruk(){
        if(getUkuranBak()>1000){
            tipeTruk="Fuso";
        } else if (getUkuranBak()>250){
            tipeTruk="Truk Engkel";
        } else if(getUkuranBak()>0){
            tipeTruk="Pick Up";
        } else {
            tipeTruk="Zonk";
        }
        return tipeTruk;
    }
    public void infoTruk(){
        super.info();
        System.out.println("Ukuran Bak      : "+getUkuranBak());
        System.out.println("Tipe Truk       : "+getTipeTruk());
    }
}