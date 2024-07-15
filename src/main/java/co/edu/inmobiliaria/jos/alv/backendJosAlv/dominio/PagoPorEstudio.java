
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "pagos_por_estudio")
public class PagoPorEstudio {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pago_por_estudio;
    
    @Column
    private int Cliente;
    
    @Column
    private int Pago;
    
    @Column
    private int Empleado;
    
    @Column
    private int Inmueble;

    public void setid_pago_por_estudio(int id_pago_por_estudio) {
        this.id_pago_por_estudio = id_pago_por_estudio;
    }

    public void setCliente(int Cliente) {
        this.Cliente = Cliente;
    }

    public void setPago(int Pago) {
        this.Pago = Pago;
    }

    public void setEmpleado(int Empleado) {
        this.Empleado = Empleado;
    }

    public void setInmueble(int Inmueble) {
        this.Inmueble = Inmueble;
    }

    public int getid_pago_por_estudio() {
        return id_pago_por_estudio;
    }

    public int getCliente() {
        return Cliente;
    }

    public int getPago() {
        return Pago;
    }

    public int getEmpleado() {
        return Empleado;
    }

    public int getInmueble() {
        return Inmueble;
    }
}
