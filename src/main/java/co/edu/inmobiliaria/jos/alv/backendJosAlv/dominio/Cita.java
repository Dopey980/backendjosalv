
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "citas")
public class Cita {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cita;
    
    @Column
    private String Fecha; 
    
    @Column
    private int Propietario;
    
    @Column
    private int Interesado;
    
    @Column
    private int Comercial;

    public int getid_cita() {
        return id_cita;
    }

    public void setid_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getPropietario() {
        return Propietario;
    }

    public void setPropietario(int Propietario) {
        this.Propietario = Propietario;
    }

    public int getInteresado() {
        return Interesado;
    }

    public void setInteresado(int Interesado) {
        this.Interesado = Interesado;
    }

    public int getComercial() {
        return Comercial;
    }

    public void setComercial(int Comercial) {
        this.Comercial = Comercial;
    }

    
}
