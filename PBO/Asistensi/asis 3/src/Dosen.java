public class Dosen {
    protected String nama,nik,jurusan;
    public Dosen(String n, String nik, String j){
        this.nama=n;
        this.nik=nik;
        this.jurusan=j;
    }
    public void setNama(String n){
        this.nama=n;
    }
    public void setNIK(String nik){
        this.nik=nik;
    }
    public void setJurusan(String j){
        this.jurusan=j;
    }
    public String getNama(){
        return nama;
    }
    public String getNIK(){
        return nik;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void info(){
        System.out.println("Nama    : "+getNama());
        System.out.println("Nik     : "+getNIK());
        System.out.println("Jurusan : "+getJurusan());
    }
}
class rektor extends Dosen{
    private int tahun,jabatan;
    public rektor(String n, String nik, String j, int t, int jb){
        super(n,nik,j);
        this.tahun=t;
        this.jabatan=jb;
    }
    public void setTahun(int t){
        this.tahun=t;
    }
    public void setJabatan(int jb){
        this.jabatan=jb;
    }
    public int getTahun(){
        return tahun;
    }
    public int getJabatan(){
        return jabatan;
    }
    public void info(){
        super.info();
        System.out.println("Tahun jabatan mulai : "+getTahun());
        System.out.println("Jabatan rektor ke-"+getJabatan());
    }
}
class dekan extends Dosen{
    private String fakultas;
    public dekan(String n, String nik, String j, String f){
        super(n,nik,j);
        this.fakultas=f;
    }
    public void setFakultas(String f){
        this.fakultas=f;
    }
    public String getFakultas(){
        return fakultas;
    }
    public void info(){
        super.info();
        System.out.println("Fakultas    : "+getFakultas());
    }
}
class kalab extends Dosen{
    private String lab;
    public kalab(String n, String nik, String j, String l){
        super(n,nik,j);
        this.lab=l;
    }
    public void setLab(String l){
        this.lab=l;
    }
    public String getLab(){
        return lab;
    }
    public void info(){
        super.info();
        System.out.println("Laboratorium    : "+getLab());
    }
}
