public class insertshort {
    public void insertShort(int[] list){
        for(int i=1;i<list.length;i++){
            int currentelement=list[i];
            int k;
            for(k=i-1;k>=0&&list[k]>currentelement;k--){
                list[k+1]=list[k];
            }
            list[k+1]=currentelement;
        }
    }
    public void infolist(int[] list){
        for(int i=0;i<list.length;i++){
            System.out.print(" "+list[i]);
        }
    }
}
