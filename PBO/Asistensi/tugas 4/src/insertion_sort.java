import java.util.Random;
public class insertion_sort {
    public void insertion_sort(int[]list){
        for(int i=1;i<list.length;i++){
            int currentElement=list[i];
            int k;
            for(k=i-1;k>=0 && list[k]>currentElement;k--){
                list[k+1]=list[k];
            }
            list[k+1]=currentElement;
        }
    }
    public void infoList(int[]list){
        for(int i=0;i<list.length;i++){
            System.out.print(" "+list[i]);
        }
    }
    public void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
         // Array may be sorted and next pass not needed
        needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
            if (list[i] > list[i + 1]) {
             // Swap list[i] with list[i + 1]
            int temp = list[i];
            list[i] = list[i + 1];
            list[i + 1] = temp;

            needNextPass = true; // Next pass still needed
            }
        }
    }   
    }
}
class main{
    public static void main(String[] args) {
        int[]list=new int[100000];
        Random input=new Random();
        for(int i=0;i<list.length;i++){
            list[i]=input.nextInt(100000);
        }
        insertion_sort i= new insertion_sort();
        double starttime=System.currentTimeMillis();
        i.insertion_sort(list);
        System.out.println("");
        double endtime=System.currentTimeMillis();
        double elapsedtime=(endtime-starttime)/1000;
        System.out.println("Waktu Insert    : "+String.valueOf(elapsedtime)+" s");
    }
}
class bubble{
       public static void main(String[] args) {
        int[]list=new int[100000];
        Random input=new Random();
        for(int i=0;i<list.length;i++){
            list[i]=input.nextInt(100000);
        }
        insertion_sort i= new insertion_sort();
        double starttime=System.currentTimeMillis();
        i.bubbleSort(list);
        System.out.println("");
        double endtime=System.currentTimeMillis();
        double elapsedtime=(endtime-starttime)/1000;
        System.out.println("Waktu Bubble    : "+String.valueOf(elapsedtime)+" s");
    }
}