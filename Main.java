import org.w3c.dom.css.Rect;

/**
 * Created by Marc on 21/9/2016.
 */
public class Main {

    public static void main(String[] args){


        Cuadrado cua = new Cuadrado(10);
        System.out.println("EL area del cuadrado es "+cua.area());

        Rectangulo rec = new Rectangulo(10,2);
        System.out.println("EL area del rectangulo es "+rec.area());

        Circulo cir = new Circulo(10);
        System.out.println("EL area del circulo es "+cir.area());

        Triangulo tri = new Triangulo(10,2);
        System.out.println("EL area del triangulo es "+tri.area());

        Figura[] ll = new Figura[3];
        ll[0] = new Cuadrado(10);
    }
}
