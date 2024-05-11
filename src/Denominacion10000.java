public class Denominacion10000 implements IDispensador {
    private static final int VALOR = 10000 ;
    private IDispensador siguienteDispensador;

    @Override
    public void dispensar(int cantidad) {
        if (cantidad >= VALOR) {
            int cantidadBilletes = cantidad / VALOR;
            System.out.println("Dispensando " + cantidadBilletes + " x $" + VALOR);
        }
        
        if (siguienteDispensador != null) {
            siguienteDispensador.dispensar(cantidad % VALOR);
        }
    }

    @Override
    public void establecerSiguienteDispensador(IDispensador siguienteDispensador) {
        this.siguienteDispensador = siguienteDispensador;
    }
}