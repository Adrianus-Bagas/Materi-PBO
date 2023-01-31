public class mahasiswaClass {
    private String nama; 
    private int nrp;
   
    public mahasiswaClass(String n, int nrp){
        this.nama=n;
        this.nrp=nrp;
    }
    public void setNama(String n){
        this.nama=n;
    }
    public void setNRP(int nrp){
        this.nrp=nrp;
    }
    public String getNama(){
        return nama;
    }
    public int getNRP(){
        return nrp;
    }
    public void info(){
        System.out.println("Nama    : "+getNama());
        System.out.println("NRP     : "+getNRP());
    }
}
