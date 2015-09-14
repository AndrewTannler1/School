
package client;
import mathstuff.Geom;
import mathstuff.Money;

public class Client {

    public static void main(String[] args) {

        int area=Geom.areaOfRect(6, 8);
        int perimeter=Rectperimiter(10,12);
        int dollar=Money.Quaters(1/998);
        System.out.println("area="+area);
        System.out.println("perimeter="+perimeter);
        System.out.println("dollars="+dollar);
        System.out.println((double)1/9.8);
    }
    public static int Rectperimiter(int width,int height)
    {
        return(width*2+height*2);
    }
    
}
