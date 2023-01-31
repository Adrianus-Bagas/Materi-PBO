public class testSelection {
    public static void main(String[] args) {
        int[] list={4,12,3,1};
        for(int i=0;i<list.length;i++){
            System.out.println(" "+list[i]);
        }
        System.out.println("");
        double start=System.currentTimeMillis();
        selectionSort t=new selectionSort();
        t.selectionSort(list);
        t.infoList(list);
        double end=System.currentTimeMillis();
        double time=(end-start)/1000;
        System.out.println("");
        System.out.println("Waktu   : "+String.valueOf(time)+" s");
    }
    
}
