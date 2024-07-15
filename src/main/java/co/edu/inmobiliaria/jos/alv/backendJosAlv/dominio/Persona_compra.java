
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "personas_compras")
public class Persona_compra {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_persona_compra;
    
    @Column
    private String Nombre;
    
    @Column
    private String Apellido;
    
    @Column
    private int Documento;
    
    @Column
    private int Edad;
    
    @Column
    private int Compra;

    public int getid_persona_compra() {
        return id_persona_compra;
    }

    public void setid_persona_compra(int id_persona_compra) {
        this.id_persona_compra = id_persona_compra;
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

    public int getCompra() {
        return Compra;
    }

    public void setCompra(int Compra) {
        this.Compra = Compra;
    }
    
}
    
    
    

