
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visitas")
public class Visita {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_visita;
    
    @Column
    private int Interesado;
     
    @Column
    private Date Fecha;
     
    @Column
    private int Inmueble;

    public int getid_visita() {
        return id_visita;
    }

    public void setid_visita(int id_visita) {
        this.id_visita = id_visita;
    }

    public int getInteresado() {
        return Interesado;
    }

    public void setInteresado(int Interesado) {
        this.Interesado = Interesado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getInmueble() {
        return Inmueble;
    }

    public void setInmueble(int Inmueble) {
        this.Inmueble = Inmueble;
    }

    
}