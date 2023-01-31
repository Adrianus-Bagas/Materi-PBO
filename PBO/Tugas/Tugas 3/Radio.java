public class Radio implements InterfaceElektronik, InterfaceChannelTV{
    private boolean mesin;
    private int volume;
    public boolean on(){
        mesin=true;
        return mesin;
    }
    public boolean off(){
        mesin=false;
        return mesin;
    }
    public int gantichannel(int c){
        return c;
    }
    public int perbesarvolume(int tambah){
        volume+=tambah;
        return volume;
    }
    public int perkecilvolume(int kurang){
        volume-=kurang;
        return volume;
    }
}