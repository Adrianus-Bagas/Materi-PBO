public class selectionSort {
    public void selectionSort(int[] list){
        for(int i=0;i<list.length-1;i++){
            int index=i;
            for(int j=i+1;j<list.length;j++){
                if(list[j]<list[index]){
                    index=j;
                }
            }
            int smallerNumber=list[index];
            list[index]=list[i];
            list[i]=smallerNumber;
        }
    }
    public void infoList(int[] list){
        for(int i=0;i<list.length;i++){
            System.out.print(" "+list[i]);
        }
    }
}
