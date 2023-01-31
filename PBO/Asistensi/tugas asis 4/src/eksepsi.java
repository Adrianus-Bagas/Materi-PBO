import java.util.Scanner;
public class eksepsi {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        int a[]=new int[21];
        int jml=0;
        try{
        System.out.println("---Penjumlahan Bilangan---");
        System.out.print("Masukkan sebuah bilangan    : ");
        int x=input.nextInt();
        a[x]=x;
        String s=Integer.toString(x);
        for(int i=0;i<=x;i++){
            jml=jml+i;
        }
        System.out.println("Penjumlahan Bilangan dari 0 sampai "+x+" adalah "+jml);
        } catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Error   : Rentang angka 0-20");
        }catch(Exception e1){
            System.out.println("Error   : Isinya harus angka");
        } 
    }
}
class kali{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a[]=new int[11];
        int jml=1;
        try{
            System.out.println("---Perkalian Bilangan---");
            System.out.print("Masukkan sebuah bilangan  : ");
            int x=input.nextInt();
            a[x]=x;
            String s=Integer.toString(x);
            for(int i=1;i<=x;i++){
                jml=jml*i;
            }
            System.out.println("Perkalian bilangan dari 1 sampai "+x+" adalah "+jml);
        } catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Error   : Rentang angka 1-10");
        } catch(Exception e2){
            System.out.println("Error   : Harus diisi angka");
        }
    }
}