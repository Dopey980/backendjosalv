
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "informacion_comercial")
public class Informacion_comercial {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_informacion_comercial;
    
    @Column
    private boolean Comportamiento_comercial;
    
    @Column
    private boolean Fuentes_de_ingreso;
    
    @Column
    private boolean Balance;
    
    @Column
    private boolean Comportamiento_financiero;
    
    @Column
    private int Persona;

    public int getid_informacion_comercial() {
        return id_informacion_comercial;
    }

    public void setid_informacion_comercial(int id_informacion_comercial) {
        this.id_informacion_comercial = id_informacion_comercial;
    }

    public boolean isComportamiento_comercial() {
        return Comportamiento_comercial;
    }

    public void setComportamiento_comercial(boolean Comportamiento_comercial) {
        this.Comportamiento_comercial = Comportamiento_comercial;
    }

    public boolean isFuentes_de_ingreso() {
        return Fuentes_de_ingreso;
    }

    public void setFuentes_de_ingreso(boolean Fuentes_de_ingreso) {
        this.Fuentes_de_ingreso = Fuentes_de_ingreso;
    }

    public boolean isBalance() {
        return Balance;
    }

    public void setBalance(boolean Balance) {
        this.Balance = Balance;
    }

    public boolean isComportamiento_financiero() {
        return Comportamiento_financiero;
    }

    public void setComportamiento_financiero(boolean Comportamiento_financiero) {
        this.Comportamiento_financiero = Comportamiento_financiero;
    }

    public int getPersona() {
        return Persona;
    }

    public void setPersona(int Persona) {
        this.Persona = Persona;
    }
    
    
}