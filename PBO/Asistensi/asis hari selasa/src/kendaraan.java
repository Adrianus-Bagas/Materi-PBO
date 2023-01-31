public class kendaraan {
    private int idkendaraan;
    protected float jaraktempuh,jaraktempuhawal,bahanbakar;
    public int IdKendaraan(){
        return idkendaraan;
    }
    public float TotalJarak(){
        return jaraktempuh+jaraktempuhawal;
    }
    public float Efektifitas(){
       float a=TotalJarak()/bahanbakar;
        return (float) (Math.pow(Math.E, a)*Math.log(2));
    }
    public void info(){
    }
}
class mobil extends kendaraan{
    private String nama, tipe;
    private int kapmesin;
    public String getNama(){
        return nama;
    }
    public String getTipe(){
        return tipe;
    }
    public void info(){
        System.out.println("Nama            : "+getNama());
        System.out.println("Tipe            : "+getTipe());
        System.out.println("Kapasitas Mesin : "+kapmesin);
        System.out.println("Bahan Bakar     : "+bahanbakar);
        System.out.println("Efektifitas     : "+Efektifitas());
    }
}
class motor extends kendaraan{
    private String nama, tipe;
    public String getNama(){
        return nama;
    }
    public String getTipe(){
        return tipe;
    }
    public void info(){
        System.out.println("Nama            : "+getNama());
        System.out.println("Tipe            : "+getTipe());
        System.out.println("Bahan Bakar     : "+bahanbakar);
        System.out.println("Efektifitas     : "+Efektifitas());
    }
}
