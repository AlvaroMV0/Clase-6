
public class Producto  extends Carrito {

    public String nombreP;
    public int precioP;
    public Producto(String nombreP, int precioP){
        this.nombreP = nombreP;
        this.precioP = precioP;
    }

    public static int getPrecioP(Producto producto) {
        return producto.precioP;
    }
}
