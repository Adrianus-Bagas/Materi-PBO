public class multieksepsi {
    public static void cobaEksepsi(int pembilang, int penyebut){
        try{
            int hasil=pembilang/penyebut;
            System.out.println("Hasil bagi  : "+hasil);
            int[] array={1,2,3,4,5};
            array[10]=23;
        } catch(ArithmeticException eksepsi1){
            System.out.println("Terjadi pembagian dengan 0");
        } catch(ArrayIndexOutOfBoundsException eksepsi2){
            System.out.println("Indeks di luar rentang");
        } finally{
            System.out.println("Ini adalah statement dalam blok finally");
        }
    }
    public static void main(String[] args){
        cobaEksepsi(4,4);
        System.out.println();
        cobaEksepsi(12,4);
    }
}