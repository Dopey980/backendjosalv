
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "personas_arriendos")
public class Persona_arriendo {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_persona_arriendo;
    
    @Column
    private String Nombre;
    
    @Column
    private String Apellido;
    
    @Column
    private int Documento;
    
    @Column
    private int Edad;
    
    @Column
    private int Arriendo;

    public int getid_persona_arriendo() {
        return id_persona_arriendo;
    }

    public void setid_persona_arriendo(int id_persona_arriendo) {
        this.id_persona_arriendo = id_persona_arriendo;
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

    public int getArriendo() {
        return Arriendo;
    }

    public void setArriendo(int Arriendo) {
        this.Arriendo = Arriendo;
    }
    

}
