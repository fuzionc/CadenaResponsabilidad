public class CajeroAutomatico {
    private IDispensador cadenaDispensadores;

    public CajeroAutomatico() {
        cadenaDispensadores = new Denominacion100000();
        IDispensador dispensador50000 = new Denominacion50000();
        IDispensador dispensador20000 = new Denominacion20000();
        IDispensador dispensador10000 = new Denominacion10000();
        IDispensador dispensador5000 = new Denominacion5000();

        cadenaDispensadores.establecerSiguienteDispensador(dispensador50000);
        dispensador50000.establecerSiguienteDispensador(dispensador20000);
        dispensador20000.establecerSiguienteDispensador(dispensador10000);
        dispensador10000.establecerSiguienteDispensador(dispensador5000);
    }

    public void dispensar(int cantidad) {
        if (cantidad % 5000 != 0) {
            System.out.println("Error: Debes ingresar una cantidad que sea un múltiplo de 5,000.");
        } else {
            cadenaDispensadores.dispensar(cantidad);
        }
    }
}