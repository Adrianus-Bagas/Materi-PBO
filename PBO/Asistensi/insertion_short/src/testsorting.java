public class testsorting {
    public static void main(String[] args) {
        int[] list={4,12,3,1};
        for(int i=0;i<list.length;i++){
            System.out.print(" "+list[i]);
        }
        System.out.println("");
            insertshort s=new insertshort();
            s.insertShort(list);
            s.infolist(list);
            System.out.println("");
        }
    }