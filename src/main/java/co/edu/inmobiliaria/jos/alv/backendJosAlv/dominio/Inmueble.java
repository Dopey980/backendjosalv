
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "inmuebles")
public class Inmueble {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_inmueble;
    
    @Column
    private String Tipo_de_inmueble;
    
    @Column
    private String Estado_del_inmueble;
    
    @Column
    private int Ubicacion;
    
    @Column
    private int Persona;
    

    public void setid_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    public void setTipo_de_inmueble(String Tipo_de_inmueble) {
        this.Tipo_de_inmueble = Tipo_de_inmueble;
    }

    public void setEstado_del_inmueble(String Estado_del_inmueble) {
        this.Estado_del_inmueble = Estado_del_inmueble;
    }

    public void setUbicacion(int Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public void setPersona(int Persona) {
        this.Persona = Persona;
    }
    
    public int getid_inmueble() {
        return id_inmueble;
    }

    public String getTipo_de_inmueble() {
        return Tipo_de_inmueble;
    }

    public String getEstado_del_inmueble() {
        return Estado_del_inmueble;
    }

    public int getUbicacion() {
        return Ubicacion;
    }

    public int getPersona() {
        return Persona;
    }
  
    
    

}
