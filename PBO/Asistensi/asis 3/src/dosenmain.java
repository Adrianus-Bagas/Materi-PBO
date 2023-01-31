public class dosenmain {
    public static void main(String[] args){
        Dosen d1=new Dosen("Zayn","102","MTK");
        rektor r1=new rektor("Bagas","100","MTK",2018,10);
        dekan dk1=new dekan("Zayn","102","MTK","FMKSD");
        kalab k1=new kalab("Bagas","100","MTK","Komputasi");
        System.out.println("Dosen");
        d1.info(); System.out.println();
        System.out.println("Rektor");
        r1.info(); System.out.println();
        System.out.println("Dekan");
        dk1.info(); System.out.println();
        System.out.println("Kalab");
        k1.info();
        
        overload m=new overload();
        overload m1=new overload();
        System.out.println(m.jumlah(80.0, 18.0));
        System.out.println(m1.jumlah(2018, 18));
    }
}