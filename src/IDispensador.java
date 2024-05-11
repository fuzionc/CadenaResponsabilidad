public interface IDispensador {
    void dispensar(int cantidad);
    void establecerSiguienteDispensador(IDispensador siguienteDispensador);
}