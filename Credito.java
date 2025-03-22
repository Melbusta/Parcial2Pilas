public class Credito {
    private String usuario;
    private double monto;
    private double interes;
    private int plazo;

    public Credito(String usuario, double monto, double interes, int plazo) {
        this.usuario = usuario;
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
    }

    public String getUsuario() {
        return usuario;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    @Override
    public String toString() {
        return "Usuario: " + usuario + ", Monto: $" + monto + ", Interés: " + interes + "%, Plazo: " + plazo + " meses";
    }
}