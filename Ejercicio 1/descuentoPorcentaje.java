public class descuentoPorcentaje extends descuento{

    @Override
    public float obtenerDescuento(float valorBase) {
        return getValorDes() * valorBase;
    }

    @Override
    public float precioFinalConDescuento(float valorBase) {
        if(getValorDes()>1){
            return 0;
        } else return valorBase - this.obtenerDescuento(valorBase);
    }
 }
