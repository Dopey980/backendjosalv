
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_venta;
    
    @Column
    private String Descripcion;
     
    @Column
    private int Inmueble;
    
    @Column
    private int Persona;

    public int getPersona() {
        return Persona;
    }

    public void setPersona(int Persona) {
        this.Persona = Persona;
    }

    public void setid_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setInmueble(int Inmueble) {
        this.Inmueble = Inmueble;
    }

    public int getid_venta() {
        return id_venta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getInmueble() {
        return Inmueble;
    }
}
