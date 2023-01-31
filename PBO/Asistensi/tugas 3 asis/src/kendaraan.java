public class kendaraan {
    private String warna,merk;
     public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna;
    }
    public void setMerk(String m){
        this.merk=m;
    }
    public String getMerk(){
        return merk;
    }
    public void infokendaraan(){
        System.out.println("Warna                   : "+getWarna());
        System.out.println("Merk                    : "+getMerk());
    }
}
class darat extends kendaraan{
    private String transmisi;
    private int kapmesin;
    public void setKapmesin(int km){
        this.kapmesin=km;
    }
    public void setTransmisi(String t){
        this.transmisi=t;
    }
    public int getKapmesin(){
        return kapmesin;
    }
    public String getTransmisi(){
        return transmisi;
    }
    public void infodarat(){
        super.infokendaraan();
        System.out.println("Kapasitas Mesin         : "+getKapmesin()+" cc");
        System.out.println("Transmisi               : "+getTransmisi());
    }
}
class laut extends kendaraan{
    private String bahan;
    public void setBahan(String b){
        this.bahan=b;
    }
    public String getBahan(){
        return bahan;
    }
    public void infolaut(){
        super.infokendaraan();
        System.out.println("Bahan                   : "+getBahan());
    }
}
class udara extends kendaraan{
    private String mesin;
    public void setMesin(String m){
        this.mesin=m;
    }
    public String getMesin(){
        return mesin;
    }
    public void infoudara(){
        super.infokendaraan();
        System.out.println("Mesin                   : "+getMesin());
    }
}
class motor extends darat{
    private int bagasi;
    public void setBagasi(int b){
        this.bagasi=b;
    }
    public int getBagasi(){
        return bagasi;
    }
    public void infomotor(){
        super.infodarat();
        System.out.println("Ukuran Bagasi           : "+getBagasi()+" liter");
    }
}
class truk extends darat{
    private String jenis;
    public void setJenis(String j){
        this.jenis=j;
    }
    public String getJenis(){
        return jenis;
    }
    public void infotruk(){
        super.infodarat();
        System.out.println("Jenis Truk              : "+getJenis());
    }
} 
class perahu extends laut{
    private int layar;
    public void setLayar(int l){
        this.layar=l;
    }
    public int getLayar(){
        return layar;
    }
    public void infoperahu(){
        super.infolaut();
        System.out.println("Jumlah Layar            : "+getLayar());
    }
}
class pesiar extends laut{
    private String fasilitas;
    public void setFasilitas(String f){
        this.fasilitas=f;
    }
    public String getFasilitas(){
        return fasilitas;
    }
    public void infopesiar(){
        super.infolaut();
        System.out.println("Fasilitas               : "+getFasilitas());
    }
}    
class pesawat extends udara{
    private int penumpang;
    public void setPenumpang(int p){
        this.penumpang=p;
    }
    public int getPenumpang(){
        return penumpang;
    }
    public void infopesawat(){
        super.infoudara();
        System.out.println("Jumlah Penumpang        : "+getPenumpang());
    }
}
class helikopter extends udara{
    private int radius;
    public void setRadius(int r){
        this.radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public void infohelikopter(){
        super.infoudara();
        System.out.println("Radius Baling-Baling    : "+getRadius()+" meter");
    }
}