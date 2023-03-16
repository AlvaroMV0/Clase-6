import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Iniciar objetos descuento
        descuentoFijo descF = new descuentoFijo();
        descuentoPorcentaje descP = new descuentoPorcentaje();
        descuentoPorcentajeConTope descPT = new descuentoPorcentajeConTope();


        //Iniciar objeto persona y asignarle a carrito
        Persona persona1 = new Persona("Alvaro", 20);
        Carrito carrito1 = new Carrito(persona1);


        //Iniciar objetos productos
        Producto p1 = new Producto("Cepita 1L", 80);
        Producto p2 = new Producto("Pan",30);
        Producto p3 = new Producto("Pechuga x1kg",100);


        //Iniciar array de productos de carrito
        Carrito[] arr = new Producto[3];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;


        //Tipos de descuento
        System.out.printf("¿Hay un descuento fijo o de porcentaje? " +
                "%n Fijo                 # 1 " +
                "%n Porcentaje           # 2 " +
                "%n Porcentaje Con Tope  # 3 " +
                "%n Opción: ");

        int tipoDesc = sc.nextInt();


        //monto del descuento
        System.out.println("¿Cuanto es el valor del descuento?" + " Si es porcentaje colocar el número con decimales. Ej: 50% = 0.5");
        descuento.setValorDes(sc.nextFloat());

        if (tipoDesc == 3){
            //monto tope del descuento
            System.out.println("¿Cuanto es el valor tope del descuento?");
            descPT.setValorTope(sc.nextFloat());
        }


        //System.out.println(carrito1.propietario);
        System.out.print("El precio total SIN descuento es: ");
        System.out.println(carrito1.calcPrecio((Producto[]) arr));
        System.out.print("El precio total CON descuento es: ");


        //tipo de descuento según el criterio por parámetro
        if (tipoDesc == 1){
            System.out.println(descF.precioFinalConDescuento(carrito1.calcPrecio((Producto[]) arr)));
        } else if (tipoDesc == 2) {
            System.out.println(descP.precioFinalConDescuento(carrito1.calcPrecio((Producto[]) arr)));
        } else if (tipoDesc == 3) {
            System.out.println(descPT.precioFinalConDescuento(carrito1.calcPrecio((Producto[]) arr)));
        } else {
            System.out.println("||¡El tipo de descuento seleccionado no es válido!||");
        }
    }
}

