
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "personas_ventas")
public class Persona_venta {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_persona_venta;
    
    @Column
    private String Nombre;
    
    @Column
    private String Apellido;
    
    @Column
    private int Documento;
    
    @Column
    private int Edad;
    
    @Column
    private int Venta;

    public int getid_persona_venta() {
        return id_persona_venta;
    }

    public void setid_persona_venta(int id_persona_venta) {
        this.id_persona_venta = id_persona_venta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getVenta() {
        return Venta;
    }

    public void setVenta(int Venta) {
        this.Venta = Venta;
    }
       
}
