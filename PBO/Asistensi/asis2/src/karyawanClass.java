public class karyawanClass {
    private String nama,id,divisi;
    private double gaji;
    public karyawanClass(){
        this.nama="Bagas";
        this.id="061102";
        this.divisi="Office Boy";
        this.gaji=15000;
    }
    public void setNama(String n){
        this.nama=n;
    }
    public void setID(String id){
        this.id=id;
    }
    public void setDivisi(String d){
        this.divisi=d;
    }
    public void setGaji(double g){
        this.gaji=g;
    }
    public String getNama(){
        return nama;
    }
    public String getID(){
        return id;
    }
    public String getDivisi(){
        return divisi;
    }
    public double getGaji(){
        return gaji;
    }
    public double zakat(){
        double z=getGaji()*0.005;
        return z;
    }
    public void cetakData(){
        System.out.println("Nama    : "+getNama());
        System.out.println("ID      : "+getID());
        System.out.println("Divisi  : "+getDivisi());
        System.out.println("Gaji    : "+getGaji());
        System.out.println("Zakat   : "+zakat());
    }
    }

