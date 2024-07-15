
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "pagos_por_comisiones")
public class PagoPorComision {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pago_por_comision;
    
    @Column
    private int Negocios_cerrados;
    
    @Column
    private int Venta;
    
    @Column
    private int Empleado;

    public void setid_pago_por_comision(int id_pago_por_comision) {
        this.id_pago_por_comision = id_pago_por_comision;
    }

    public void setNegocios_cerrados(int Negocios_cerrados) {
        this.Negocios_cerrados = Negocios_cerrados;
    }

    public void setVenta(int Venta) {
        this.Venta = Venta;
    }

    public void setEmpleado(int Empleado) {
        this.Empleado = Empleado;
    }

    public int getid_pago_por_comision() {
        return id_pago_por_comision;
    }

    public int getNegocios_cerrados() {
        return Negocios_cerrados;
    }

    public int getVenta() {
        return Venta;
    }

    public int getEmpleado() {
        return Empleado;
    }
}
