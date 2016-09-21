/**
 * Created by Marc on 21/9/2016.
 */
public class Triangulo {

    double b;
    double h;

    public Triangulo(double b, double h){

        this.b = b;
        this.h = h;

    }

    public double area(){
        return (h*b)/2;
    }
}
