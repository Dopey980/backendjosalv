
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "arriendos")
public class Arriendo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_arriendo;
    
    @Column
    private String Descripcion;
    
    @Column
    private int Inmueble;

    public int getid_arriendo() {
        return id_arriendo;
    }

    public void setid_arriendo(int id_arriendo) {
        this.id_arriendo = id_arriendo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getInmueble() {
        return Inmueble;
    }

    public void setInmueble(int Inmueble) {
        this.Inmueble = Inmueble;
    }
    
    
    
}
