public class circle {
    private int radius;
    public circle(){
    this.radius=7;
}
    public int getRadius(){
        return radius;
    }
    public String toString(){
        return "Circle[...]";
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
class cylinder extends circle{
    private int height;
    public cylinder(){
        this.height=10;
    }
    public int getHeight(){
        return height;
    }
    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*height;
    }
    public double getArea(){
        return 2*Math.PI*getRadius()*getRadius()+2*Math.PI*getRadius()*height;
    }
    public String toString(){
        return "Cylinder[...]";
    }
}
class demo{
    public static void main (String[] args){
        circle c1=new circle();
        cylinder c2=new cylinder();
        
        System.out.println(c1.getArea());
        System.out.println(c2.getVolume());
        System.out.println(c2.getArea());
    }
}