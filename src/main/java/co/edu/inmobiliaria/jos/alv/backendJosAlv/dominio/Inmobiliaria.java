
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "inmobiliaria")
public class Inmobiliaria {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_inmobiliaria;
    
    @Column
    private String Nombre;

    public void setid_inmobiliaria(int id_inmobiliaria) {
        this.id_inmobiliaria = id_inmobiliaria;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getid_inmobiliaria() {
        return id_inmobiliaria;
    }

    public String getNombre() {
        return Nombre;
    }
    
}
