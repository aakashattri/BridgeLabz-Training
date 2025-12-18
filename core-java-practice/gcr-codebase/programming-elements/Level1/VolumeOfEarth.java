
public class VolumeOfEarth {
    public static void main(String[] args){
        int radius =6378;
        float r = 6378*1.6f;
        System.out.println("The Volume of earth in Cubic Kilometers is "+((4/3)*3.14*radius*radius*radius)+" and in Cubic Miles is "+((4/3)*3.14*r*r*r));
    }

}
