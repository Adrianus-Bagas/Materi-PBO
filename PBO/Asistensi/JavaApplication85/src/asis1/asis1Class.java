package asis1;
public class asis1Class {
    private String nama,jurusan;
    private int nik;
    public asis1Class(){
        this.nama="Zayn";
        this.nik=12345;
        this.jurusan="MTK";
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void infoDosen(){
        System.out.println("Nama    : "+nama);
        System.out.println("NIK     : "+nik);
        System.out.println("Jurusan : "+jurusan);
    }
    public static void main(String[] args){
        asis1Class tes1=new asis1Class();
        asis1Class tes2=new asis1Class();
        tes1.setNama("Bagas");
        tes1.infoDosen();
        System.out.println();
        tes2.setNama("Chris");
        tes2.infoDosen();
    }
}
