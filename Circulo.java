/**
 * Created by Marc on 21/9/2016.
 */
public class Circulo {

    double r;

    public Circulo(double r){

        this.r = r;

    }

    public double area(){

        return Math.PI*Math.pow(r,2);
    }
}
