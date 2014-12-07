import java.math.BigInteger;

class DatosEstadisticos {

    private float tiempo;
    private boolean error;
    private BigInteger factor1, factor2, resultado;

    public DatosEstadisticos() {
        tiempo = 0;
        error = false;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    public void setFactores(BigInteger n, BigInteger m) {
        factor1 = n;
        factor2 = m;
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
    
    public BigInteger getFactor1() {
        return factor1;
    }

    public BigInteger getFactor2() {
        return factor2;
    }
    
    public boolean getError() {
        return error;
    }
    
    public BigInteger getResultado() {
        return resultado;
    }
}
