import java.math.BigInteger;

class CalculadorEstadisticas {

    private static DatosEstadisticos estadisticaMultiplicacion(Multiplicacion metodo, BigInteger n, BigInteger m) {
        DatosEstadisticos datos = new DatosEstadisticos();
        
        try {
            metodo.multiplica(n, m, datos);
        } 
        catch (StackOverflowError e) {
            datos.setError();
        }
        return datos;
    }
    
    private static DatosEstadisticos[] vectorEstadisticas(Multiplicacion metodo, BigInteger[] datosN, BigInteger[] datosM) {
        DatosEstadisticos[] datosSalida = new DatosEstadisticos[datosM.length];
        for (int i = 0; i < datosSalida.length; i++) {
            
            datosSalida[i] = estadisticaMultiplicacion(metodo, datosN[i], datosM[i]);
            
        }
        return datosSalida;
    }

    static DatosEstadisticos[][] matrizEstadisticas(Multiplicacion[] metodos, BigInteger[] datosN, BigInteger[] datosM) {
        DatosEstadisticos[][] datosSalida = new DatosEstadisticos[metodos.length][datosM.length];
        
        for (int i = 0; i < datosSalida.length; i++) {
            datosSalida[i] = vectorEstadisticas(metodos[i], datosN, datosM);
        }
        
        return datosSalida;
    }

    
}
