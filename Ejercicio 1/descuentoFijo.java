public class descuentoFijo extends descuento{


    @Override
    public float obtenerDescuento(float valorBase) {
        return getValorDes();
    }

    @Override
    public float precioFinalConDescuento(float valorBase) {

        //si el valor de descuento es mayor a base, que devuelva 0
        if (getValorDes()>=valorBase){
            return 0;
        } else {
        return valorBase - this.obtenerDescuento(valorBase);
        }
    }

}
