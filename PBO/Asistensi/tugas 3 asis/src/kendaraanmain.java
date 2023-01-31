import java.util.Scanner;
public class kendaraanmain {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String jenis,fasil;
        motor m1=new motor();
        truk t1=new truk();
        perahu p1=new perahu();
        pesiar p=new pesiar();
        pesawat p2=new pesawat();
        helikopter h1=new helikopter();
        System.out.println("Jenis Kendaraan");
        System.out.println("1. Darat");
        System.out.println("2. Laut");
        System.out.println("3. Udara");
        System.out.print("Pilih nomor untuk lebih lanjut : ");
        int a=input.nextInt();
        System.out.println("======================================");
        if(a==1){
            System.out.println("Kendaraan Darat");
            System.out.println("1. Sepeda Motor");
            System.out.println("2. Truk");
            System.out.print("Pilih huruf untuk lebih lanjut : ");
            int b=input.nextInt();
            if(b==1){
                System.out.print("Warna             : ");
                String warnamotor=input.next();
                System.out.print("Merk              : ");
                String merkmotor=input.next();
                System.out.print("Kapasitas Mesin   : ");
                int kapmotor=input.nextInt();
                System.out.print("Tipe Transmisi    : ");
                String transmotor=input.next();
                System.out.print("Ukuran Bagasi     : ");
                int bagasi=input.nextInt();
                System.out.println("======================================");
                m1.setWarna(warnamotor);
                m1.setMerk(merkmotor);
                m1.setKapmesin(kapmotor);
                m1.setTransmisi(transmotor);
                m1.setBagasi(bagasi);
                System.out.println("Sepeda Motor");
                m1.infomotor();
            } else if (b==2){
                System.out.print("Warna             : ");
                String warnatruk=input.next();
                System.out.print("Merk              : ");
                String merktruk=input.next();
                System.out.print("Kapasitas Mesin   : ");
                int kaptruk=input.nextInt();
                System.out.print("Tipe Transmisi    : ");
                String transtruk=input.next();
                jenis=input.nextLine();
                System.out.print("Jenis Truk        : ");
                jenis=input.nextLine();
                System.out.println("======================================");
                t1.setWarna(warnatruk);
                t1.setMerk(merktruk);
                t1.setKapmesin(kaptruk);
                t1.setTransmisi(transtruk);
                t1.setJenis(jenis);
                System.out.println("Truk");
                t1.infotruk();
            } else {
                System.out.println("Zonk");
            }
        } else if (a==2){
            System.out.println("Kendaraan Laut");
            System.out.println("1. Perahu Layar");
            System.out.println("2. Kapal Pesiar");
            System.out.print("Pilih huruf untuk lebih lanjut : ");
            int b=input.nextInt();
            if(b==1){
                System.out.print("Warna           : ");
                String warnaperahu=input.next();
                System.out.print("Merk            : ");
                String merkperahu=input.next();
                System.out.print("Bahan           : ");
                String bahanperahu=input.next();
                System.out.print("Jumlah Layar    : ");
                int jumlah=input.nextInt();
                System.out.println("======================================");
                p1.setWarna(warnaperahu);
                p1.setMerk(merkperahu);
                p1.setBahan(bahanperahu);
                p1.setLayar(jumlah);
                System.out.println("Perahu Layar");
                p1.infoperahu();
            } else if (b==2){
                System.out.print("Warna            : ");
                String warnapesiar=input.next();
                System.out.print("Merk             : ");
                String merkpesiar=input.next();
                System.out.print("Bahan            : ");
                String bahanpesiar=input.next();
                fasil=input.nextLine();
                System.out.print("Fasilitas        : ");
                fasil=input.nextLine();
                System.out.println("======================================");
                p.setWarna(warnapesiar);
                p.setMerk(merkpesiar);
                p.setBahan(bahanpesiar);
                p.setFasilitas(fasil);
                System.out.println("Kapal Pesiar");
                p.infopesiar();
            } else {
                System.out.println("Zonk");
            }
        } else if (a==3){
            System.out.println("Kendaraan Udara");
            System.out.println("1. Pesawat Penumpang");
            System.out.println("2. Helikopter");
            System.out.print("Pilih huruf untuk lebih lanjut : ");
            int b=input.nextInt();
            if(b==1){
                System.out.print("Warna                : ");
                String warnapesawat=input.next();
                System.out.print("Merk                 : ");
                String merkpesawat=input.next();
                System.out.print("Mesin                : ");
                String mesinpesawat=input.next();
                System.out.print("Jumlah Penumpang     : ");
                int penumpang=input.nextInt();
                System.out.println("======================================");
                p2.setWarna(warnapesawat);
                p2.setMerk(merkpesawat);
                p2.setMesin(mesinpesawat);
                p2.setPenumpang(penumpang);
                System.out.println("Pesawat Penumpang");
                p2.infopesawat();
            } else if (b==2){
                System.out.print("Warna                       : ");
                String warnaheli=input.next();
                System.out.print("Merk                        : ");
                String merkheli=input.next();
                System.out.print("Mesin                       : ");
                String mesinheli=input.next();
                System.out.print("Radius Baling=Baling        : ");
                int radius=input.nextInt();
                System.out.println("======================================");
                h1.setWarna(warnaheli);
                h1.setMerk(merkheli);
                h1.setMesin(mesinheli);
                h1.setRadius(radius);
                System.out.println("Helikopter");
                h1.infohelikopter();
            } else {
                System.out.println("Zonk");
            }
        } else {
            System.out.println("Zonk");
        }
    }
}
