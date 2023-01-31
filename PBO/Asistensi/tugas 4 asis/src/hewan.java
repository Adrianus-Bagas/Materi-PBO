public class hewan {
    private String nama,napas,buah;
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNapas(String napas){
        this.napas=napas;
    }
    public void setBuah(String buah){
        this.buah=buah;
    }
    public String getNama() {
        return nama;
    }
    public String getNapas() {
        return napas;
    }
    public String getBuah() {
        return buah;
    }
    public void info(){
        System.out.println("Nama                : "+getNama());
        System.out.println("Pernapasan          : "+getNapas());
        System.out.println("Pembuahan           : "+getBuah());
    }
}
class mamalia extends hewan{
    private String biak;
    public void setBiak(String biak) {
        try{
            this.biak=biak;
            if(biak.equalsIgnoreCase("vivipar")||biak.equalsIgnoreCase("melahirkan")){           
            }
            else{
                throw new NullPointerException();
            }
        } catch(NullPointerException npe){
            System.out.println("Kesalahan       : Anjing itu vivipar atau melahirkan");
        }
    }
    public String getBiak() {
        return biak;
    }
    public void info(){
        super.info();
        System.out.println("Cara Berkembangbiak : "+getBiak());
    }
}
class pisces extends hewan{
    private String air;
    public String getAir() {
        return air;
    }
    public void setAir(String air) {
        try{
            this.air = air;
            if(air.equalsIgnoreCase("tawar")){
            }
            else if (air.equalsIgnoreCase("laut")){
                throw new Exception();
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Pilihannya tawar atau laut");
        } catch(Exception npe2){
            System.out.println("Kesalahan       : Tenggiri hidup di air tawar");
        }
    }
    public void info(){
        super.info();
        System.out.println("Jenis Air           : "+getAir());
    }
}
class unggas extends hewan{
    private String terbang;
    public String getTerbang() {
        return terbang;
    }
    public void setTerbang(String terbang) {
        try{
            this.terbang=terbang;
            if(terbang.equalsIgnoreCase("tidak")){
            } else if(terbang.equalsIgnoreCase("mampu")){
                throw new NullPointerException();
            } else {
                throw new Exception();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Ayam tidak bisa terbang");
        } catch(Exception e){
            System.out.println("Kesalahan       : Pilihannya mampu atau tidak");
        }
    }
    public void info(){
        super.info();
        System.out.println("Kemampuan Terbang   : "+getTerbang());
    }
}
class anjing extends mamalia{
    private String jenis;
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void info(){
        super.info();
        System.out.println("Jenis Anjing        : "+getJenis());
    }
}
class tenggiri extends pisces{
    private String olahan;
    public String getOlahan() {
        return olahan;
    }
    public void setOlahan(String olahan) {
        this.olahan = olahan;
    }
    public void info(){
        super.info();
        System.out.println("Jenis Olahan        : "+getOlahan());
    }
}
class ayam extends unggas{
    private int harga;
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void info(){
        super.info();
        System.out.println("Harga per kg        : Rp "+getHarga());
    }
}