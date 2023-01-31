public abstract class cBentuk2D {
    private String warna;
    protected cBentuk2D(){
    warna="transparan";
}
    protected cBentuk2D(String w){
        warna=w;
    }
    public void setWarna(String w){
        warna=w;
    }
    public String getWarna(){
        return warna;
    }
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    
    public void info(){
        System.out.println("Warna Benda     : "+getWarna());
        System.out.println("Luas Benda      : "+hitungLuas());
        System.out.println("Keliling Benda  : "+hitungKeliling());
    }
}
class lingkaran extends cBentuk2D{
    private double jari;
    public lingkaran(){
        super();
        jari=0;
    }
    public lingkaran(double r, String w){
        super(w);
        jari=r;
    }
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    public double hitungLuas(){
        return Math.PI*jari*jari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jari;
    }
}
class kotak extends cBentuk2D{
    private double panjang, lebar;
    public kotak(){
        super();
        panjang=0;
        lebar=0;
    }
    public kotak(double p, double l, String w){
        super(w);
        panjang=p;
        lebar=l;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double hitungLuas(){
        return panjang*lebar;
    }
    public double hitungKeliling(){
        return 2*panjang+2*lebar;
    }
}