public class ComisionPersonalizada implements EstrategiaComision {
    private static final String PRIMER_NOMBRE = "Salvador";
    private static final double PORCENTAJE = (5 + PRIMER_NOMBRE.length()) / 100.0;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE;
    }
}
