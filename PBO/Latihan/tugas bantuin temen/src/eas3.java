public class eas3 {
    public void insertion_sort(int[]list, String[]nama){
        for(int i=1;i<list.length;i++){
            int currentElement=list[i];
            String name=nama[i];
            int k;
            for(k=i-1;k>=0 && list[k]<currentElement;k--){
                list[k+1]=list[k];
                nama[k+1]=nama[k];
            }
            list[k+1]=currentElement;
            nama[k+1]=name;
        }
    }
}
class maineas3{
    public static void main(String[] args) {
        String[]nama={"eka","dwi","tri","catur","panca","sat"};
        int[]nilai={87,89,78,90,77,92};
        eas3 e=new eas3();
        e.insertion_sort(nilai, nama);
        for(int i=0;i<nama.length;i++){
            System.out.println(nama[i]+"---"+nilai[i]);
        }
    }
}
class eas5{
     public int linear(int angka,int[] list){
        boolean temukan=false;
        int sum=0;
        for(int i=0;i<list.length;i++){
            if(angka==list[i]){
                temukan=true;
                sum=sum+1;
            }
        }
        if(temukan){
            return sum;
        } else {
            return -1;
        }
    }
}
class maineas5{
    public static void main(String[] args) {
       int[] list={5,1,10,3,5,2,7,7,5,10};
       eas5 l=new eas5();
        System.out.println(l.linear(10, list));
    }
}