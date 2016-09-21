import org.w3c.dom.css.Rect;

/**
 * Created by Marc on 21/9/2016.
 */
public class Rectangulo {
    double l1;
    double l2;
    public Rectangulo(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public double area(){
        return l1*l2;
    }


}
