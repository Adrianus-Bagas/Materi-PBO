import java.util.Scanner;
public class hewanmain {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String p,o;
        hewan hw;
        anjing ajg=new anjing();
        tenggiri t=new tenggiri();
        ayam ay=new ayam();
        System.out.println("Jenis Hewan");
        System.out.println("1. Mamalia");
        System.out.println("2. Pisces");
        System.out.println("3. Unggas");
        System.out.print("Pilih nomor untuk lebih lanjut  : ");
        int x=input.nextInt();
        System.out.println("=======================================");
        if(x==1){
            System.out.print("Nama                : ");
            String n=input.next();
            p=input.nextLine();
            System.out.print("Alat Pernapasan     : ");
            p=input.nextLine();
            System.out.print("Jenis Pembuahan     : ");
            String b=input.next();
            System.out.print("Cara Berkembangbiak : ");
            String k=input.next();
            System.out.print("Jenis               : ");
            String j=input.next();
            System.out.println();
            ajg.setNama(n);
            ajg.setNapas(p);
            ajg.setBuah(b);
            ajg.setBiak(k);
            ajg.setJenis(j);
            try{
            if(n.equalsIgnoreCase("anjing")){
                
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : "+n+" bukan binatang");   
        } 
            try{
            if(p.equalsIgnoreCase("paru paru")||p.equalsIgnoreCase("paru-paru")){
                
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Anjing bernapas dengan paru-paru");
        } 
            try{
            if(b.equalsIgnoreCase("internal")){
                
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Pembuahan anjing internal ");
        } 
            System.out.println("=======================================");
            hw=ajg;
            hw.info();
        } else if(x==2){
            System.out.print("Nama                 : ");
            String n=input.next();
            p=input.nextLine();
            System.out.print("Alat Pernapasan      : ");
            p=input.nextLine();
            System.out.print("Jenis Pembuahan      : ");
            String b=input.next();
            System.out.print("Jenis Air(Tawar/Laut): ");
            String a=input.next();
            o=input.nextLine();
            System.out.print("Jenis Olahan         : ");
            o=input.nextLine();
            System.out.println();
            t.setNama(n);
            t.setNapas(p);
            t.setBuah(b);
            t.setAir(a);
            t.setOlahan(o);
               try{
            if(n.equalsIgnoreCase("tenggiri")){
                
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Pilihan pisces hanya tenggiri");   
        } 
             try{
            if(p.equalsIgnoreCase("insang")){
                
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Tenggiri bernapas dengan insang");   
        } 
             try{
            if(b.equalsIgnoreCase("eksternal")){
                
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Pembuahan tenggiri eksternal");   
        } 
            System.out.println("=======================================");
            hw=t;
            hw.info();
        } else if(x==3){
            System.out.print("Nama                : ");
            String n=input.next();
            p=input.nextLine();
            System.out.print("Alat Pernapasan     : ");
            p=input.nextLine();
            System.out.print("Jenis Pembuahan     : ");
            String b=input.next();
            System.out.print("Kemampuan terbang   : ");
            String k=input.next();
            System.out.print("Harga               : ");
            int h=input.nextInt();
            System.out.println();
            ay.setNama(n);
            ay.setNapas(p);
            ay.setBuah(b);
            ay.setTerbang(k);
            ay.setHarga(h);
               try{
            if(n.equalsIgnoreCase("ayam")){
                
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Pilihan unggas hanya ayam");   
        } 
             try{
            if(p.equalsIgnoreCase("paru paru")||p.equalsIgnoreCase("paru-paru")){
                
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Ayam bernapas dengan paru paru");   
        } 
                try{
            if(b.equalsIgnoreCase("internal")){
                
            } else {
                throw new NullPointerException();
            }
        } catch(NullPointerException npe1){
            System.out.println("Kesalahan       : Pembuahan ayam internal");   
        } 
            System.out.println("=======================================");
            hw=ay;
            hw.info();
        }
    }
}