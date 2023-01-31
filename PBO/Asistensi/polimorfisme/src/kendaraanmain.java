public class kendaraanmain {
    public static void main(String[] args){
        kendaraan p;
        pesawat psw=new pesawat("Boeing 707","Pesawat Komersil");
        mobil mbl1=new mobil("Toyota Kijang","Jeep");
        mobil mbl2=new mobil("Suzuki Baleno","Sedan");
        mobil mbl3=new mobil("VW Combi");
        kapal kpl1=new kapal("Queen Mary 2","Kapal Pesiar");
        
        p=psw;
        p.info(); System.out.println();
        p=mbl1;
        p.info(); System.out.println();
        p=mbl2;
        p.info(); System.out.println();
        p=mbl3;
        p.info(); System.out.println();
        p=kpl1;
        p.info();
    }
}
