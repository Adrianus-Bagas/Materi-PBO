public class bentukClass {
    private String warna;
    public bentukClass(String w){
        this.warna=w;
    }
    public void setWarna(String w){
        this.warna=w;
    }
    public String getWarna(){
        return warna;
    }
    public void info(){
        System.out.println("Bentuk berwarna         : "+getWarna());
    }
}
class kotak extends bentukClass{
    private double sisi;
    public kotak(String w, double s) {
        super(w);
        this.sisi=s;
    }
    public void setSisi(double s){
        this.sisi=s;
    }
    public double getSisi(){
        return sisi;
    }
    public double hitungLuas(){
        double LK=getSisi()*getSisi();
        return LK;
    }
    public void infoKotak(){
        System.out.println("Bujur Sangkar berwarna  : "+getWarna());
        System.out.println("Luas Bujur Sangkar      : "+hitungLuas());
    }    
}
class lingkaran extends bentukClass{
    private double radius;
    public lingkaran(String w, double r){
        super(w);
        this.radius=r;
    }
    public void setRadius(double r){
        this.radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public double hitungLuas(){
        double LL=Math.PI*getRadius()*getRadius();
        return LL;
    }
    public void infoLingkaran(){
        System.out.println("Lingkaran berwarna      : "+getWarna());
        System.out.println("Luas Lingkaran          : "+hitungLuas());
    }
}
class tabung extends lingkaran{
    private double tinggi;
    public tabung(String w, double r, double t){
        super(w,r);
        this.tinggi=t;
    }
    public void setTinggi(double t){
        this.tinggi=t;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double hitungVolume(){
        double V=hitungLuas()*getTinggi();
        return V;
    }
    public void infoTabung(){
        System.out.println("Silinder berwarna       : "+getWarna());
        System.out.println("Volume Tabung           : "+hitungVolume());
    }
}
