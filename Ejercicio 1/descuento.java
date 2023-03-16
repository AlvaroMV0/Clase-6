public abstract class descuento {

    private static float valorDes;

    public abstract float obtenerDescuento(float valorDes);
    public abstract float precioFinalConDescuento(float valorDes);


    public static float getValorDes() {
        return valorDes;
    }
    public static void setValorDes(float valor) {
        valorDes = valor;
    }
}
