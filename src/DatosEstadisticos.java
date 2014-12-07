import java.math.BigInteger;

class DatosEstadisticos {

    private float tiempo;
    private boolean error;
    private BigInteger orden;
    private BigInteger resultado;

    public DatosEstadisticos() {
        tiempo = 0;
        error = false;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    public void setFactor(BigInteger orden) {
        this.orden = orden;
    }
    
    public void setError() {
        error = true;
    }
    
    public void setResultado(BigInteger resultadomulti) {
        resultado = resultadomulti;
    }
    
    public float getTiempo() {
        return tiempo;
    }

    public BigInteger getOrden() {
        return orden;
    }
    
    public boolean getError() {
        return error;
    }
    
    public BigInteger getResultado() {
        return resultado;
    }
}
