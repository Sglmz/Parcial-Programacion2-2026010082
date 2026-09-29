public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("Vendedor: " + nombre);
        System.out.printf("Venta total: $%.2f%n", ventasMes);
        System.out.printf("Comision (%s): $%.2f%n", estrategia.getClass().getSimpleName(), comision);
    }
}
