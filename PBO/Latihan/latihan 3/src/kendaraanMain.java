public class kendaraanMain {
        public static void main(String[] args){
            kendaraanClass k1=new kendaraanClass();
            kendaraanClass k2=new kendaraanClass("Hitam",1500);
            kendaraanClass k3=new kendaraanClass("Merah",2500,"Matic");
            truk t1=new truk("Merah",2500,"Manual",150);
            truk t2=new truk("Hitam",2000,400);
            k1.info();
            k2.info();
            k3.info();
            t1.infoTruk();
            /*k1.setKapmesin(2500);
            k1.info();
            System.out.println();
            k2.setTransmisi("Kopling");
            k2.info();
            System.out.println();
            t1.setWarna("Orange");
            t1.setUkuranBak(250);
            t1.infoTruk();
            System.out.println();
            t2.infoTruk();*/
        }
}
