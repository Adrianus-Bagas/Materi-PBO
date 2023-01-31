public class kendaraan {
    private String model;
    public kendaraan(String model){
        this.model=model;
    }
    public void info(){
        System.out.println("Model       : "+model);
    }
}
class pesawat extends kendaraan{
    private String nama,jenis;
    public pesawat(String nama){
        super("Pesawat");
        this.nama=nama;
        jenis="belum terdefinisi";
    }
    public pesawat(String nama, String jenis){
        super("Pesawat");
        this.nama=nama;
        this.jenis=jenis;
    }
    public void info(){
        super.info();
        System.out.println("Nama Pesawat    : "+nama);
        System.out.println("Jenis Pesawat   : "+jenis);
    }
}
class mobil extends kendaraan{
    private String nama,jenis;
    public mobil(String nama){
        super("Mobil");
        this.nama=nama;
        jenis="belum terdefinisi";
    }
    public mobil(String nama, String jenis){
        super("Mobil");
        this.nama=nama;
        this.jenis=jenis;
    }
    public void info(){
        super.info();
        System.out.println("Nama mobil  : "+nama);
        System.out.println("Jenis mobil : "+jenis);
    }
}
class kapal extends kendaraan{
    private String nama,jenis;
    public kapal(String nama){
        super("Kapal");
        this.nama=nama;
        jenis="belum terdefinisi";
    }
    public kapal(String nama, String jenis){
        super("Kapal");
        this.nama=nama;
        this.jenis=jenis;
    }
    public void info(){
        super.info();
        System.out.println("Nama Kapal  : "+nama);
        System.out.println("Jenis Kapal : "+jenis);
    }
}

