public class Pelajar {
    private String nama;
    private int ujian1,ujian2,tugas,nip;
    public void setNama(String n){
        this.nama=n;
    }
    public void setNip(int nip){
        this.nip=nip;
    }
    public void setUjian1(int n1){
        this.ujian1=n1;
    }
    public void setUjian2(int n2){
        this.ujian2=n2;
    }
    public void setTugas(int t){
        this.tugas=t;
    }
    public String getNama(){
        return nama;
    }
    public int getNip(){
        return nip;
    }
    public int getUjian1(){
        return ujian1;
    }
    public int getUjian2(){
        return ujian2;
    }
    public int getTugas(){
        return tugas;
    }
    public double nilaiAkhir(){
        double na=0.35*(double)getUjian1()+0.35*(double)getUjian2()+0.3*(double)getTugas();
        return na;   
    }
    public String isiLulus(){
        String a;
        if(nilaiAkhir()>=60){
            a="Lulus";
        } else {
            a="Tidak Lulus";
        }
        return a;
    }
    public void status(){
        System.out.println("Nama            : "+getNama());
        System.out.println("NIP             : "+getNip());
        System.out.println("Nilai Ujian 1   : "+getUjian1());
        System.out.println("Nilai Ujian 2   : "+getUjian2());
        System.out.println("Nilai Tugas     : "+getTugas());
        System.out.println("Status          : "+isiLulus());
    }
}
