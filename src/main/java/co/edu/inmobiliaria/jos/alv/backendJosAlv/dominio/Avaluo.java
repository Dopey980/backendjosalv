
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "avaluos")
public class Avaluo {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_avaluo;
    
    @Column
    private float Precio_del_inmueble;
    
    @Column
    private int Inmueble;

    public int getid_avaluo() {
        return id_avaluo;
    }

    public void setid_avaluo(int id_avaluo) {
        this.id_avaluo = id_avaluo;
    }

    public float getPrecio_del_inmueble() {
        return Precio_del_inmueble;
    }

    public void setPrecio_del_inmueble(float Precio_del_inmueble) {
        this.Precio_del_inmueble = Precio_del_inmueble;
    }

    public int getInmueble() {
        return Inmueble;
    }

    public void setInmueble(int Inmueble) {
        this.Inmueble = Inmueble;
    }    
    
}
