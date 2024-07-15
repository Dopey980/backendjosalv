
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "compras")
public class Compra {
   @Id
   @Column
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_compra;
   
   @Column
    private String Detalles;
   
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
    
    public void setid_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public void setInmueble(int Inmueble) {
        this.Inmueble = Inmueble;
    }

    public int getid_compra() {
        return id_compra;
    }

    public String getDetalles() {
        return Detalles;
    }

    public int getInmueble() {
        return Inmueble;
    }
}
