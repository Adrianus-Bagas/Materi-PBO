public class TesMobil {
    public static void main(String[] args){
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();
        Mobil mobil3 = new Mobil();
        Mobil mobil4 = new Mobil();
        mobil1.setMerk("Toyota");
        mobil1.setWarna("Biru");
        mobil1.setJenis("Minibus");
        mobil1.setKapmesin(2000);
        mobil1.setPenumpang(7);
        mobil1.infoMobil();
        System.out.println();
        mobil2.setMerk("Daihatsu");
        mobil2.setWarna("Hitam");
        mobil2.setJenis("Pick Up");
        mobil2.setKapmesin(1500);
        mobil2.setPenumpang(2);
        mobil2.infoMobil();
        System.out.println();
        mobil3.setMerk("Suzuki");
        mobil3.setWarna("Silver");
        mobil3.setJenis("Suv");
        mobil3.setKapmesin(1800);
        mobil3.setPenumpang(5);
        mobil3.infoMobil();
        System.out.println();
        mobil4.setMerk("Honda");
        mobil4.setWarna("Merah");
        mobil4.setJenis("Sedan");
        mobil4.setKapmesin(1300);
        mobil4.setPenumpang(5);
        mobil4.infoMobil();
    }
}
