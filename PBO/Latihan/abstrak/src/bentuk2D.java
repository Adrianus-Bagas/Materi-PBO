public class bentuk2D implements shape,shape2{
    private double sisi, tinggi;
    public bentuk2D(){
        this.sisi=0;
    }
    public void setSisi(double s){
        this.sisi=s;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double luas(){
        return sisi*sisi;
    }
    public double keliling(){
        return 4*sisi;
    }
    public double volume(){
        return sisi*tinggi;
    }
    public void info(){
        System.out.println("Luas        : "+luas());
        System.out.println("Keliling    : "+keliling());
        System.out.println("Volume      : "+volume());
    }
}
