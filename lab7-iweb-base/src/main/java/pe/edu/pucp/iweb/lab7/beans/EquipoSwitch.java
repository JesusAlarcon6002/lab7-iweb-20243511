package pe.edu.pucp.iweb.lab7.beans;

/**
 * Ejercicio 2b: equipo de tipo 'SWITCH'.
 *
 * Soporte mensual (S/) = 0.015 x precio x cantidad
 */
public class EquipoSwitch extends EquipoRed{ // TODO 2b: debe heredar de EquipoRed
    private double soporte;
    private EquipoRed cantidad;
    private EquipoRed precio;

    public double getSoporte() {
        return soporte;
    }

    public void setSoporte(double soporte) {
        this.soporte = soporte;
    }

    public EquipoRed getCantidad() {
        return cantidad;
    }

    public void setCantidad(EquipoRed cantidad) {
        this.cantidad = cantidad;
    }

    public EquipoRed getPrecio() {
        return precio;
    }

    public void setPrecio(EquipoRed precio) {
        this.precio = precio;
    }

    // TODO 2b: implementar calcularSoporteMensual()
    @Override
    public double calcularSoporteMensual(double precio, int cantidad){
        soporte = 0.0015*precio*cantidad;
        return soporte;
    }
}
