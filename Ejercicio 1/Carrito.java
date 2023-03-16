
public class Carrito {

    String propietario = "";


    public Carrito(){

    }
    public  Carrito (Persona propietario){
            this.propietario = String.valueOf(propietario);
        }
        public int calcPrecio(Producto[] array){
        int sum = 0;
        for (Producto y : array){
            sum += Producto.getPrecioP(y);
        }
            return sum;
    }
}
