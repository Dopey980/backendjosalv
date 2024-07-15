
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "ubicacion_geo")
public class Ubicacion_geo {
   @Id
   @Column
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_ubicacion_geo;
   
   @Column
    private int Codigo_divipola;

    public void setid_ubicacion_geo(int id_ubicacion_geo) {
        this.id_ubicacion_geo = id_ubicacion_geo;
    }

    public void setCodigo_divipola(int Codigo_divipola) {
        this.Codigo_divipola = Codigo_divipola;
    }

    public int getid_ubicacion_geo() {
        return id_ubicacion_geo;
    }

    public int getCodigo_divipola() {
        return Codigo_divipola;
    }

}
