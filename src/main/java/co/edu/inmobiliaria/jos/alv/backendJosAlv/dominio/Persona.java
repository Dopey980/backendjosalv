
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_persona;
    
    @Column
    private String Nombre;
    
    @Column
    private String Apellido;
    
    @Column
    private int Documento;
    
    @Column
    private int Tipo_de_persona;
    
    @Column
    private int Edad;
    
    @Column
    private int Sucursal;
    
    public int getid_persona() {
        return id_persona;
    }

    public void setid_persona(int id_persona) {
        this.id_persona = id_persona;
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

    public int getTipo_de_persona() {
        return Tipo_de_persona;
    }

    public void setTipo_de_persona(int Tipo_de_persona) {
        this.Tipo_de_persona = Tipo_de_persona;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getSucursal() {
        return Sucursal;
    }

    public void setSucursal(int Sucursal) {
        this.Sucursal = Sucursal;
    }

}
