
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "sucursales")
public class Sucursal {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sucursal;
    
    @Column
    private String Nombre;
    
    @Column
    private int Telefono;
    
    @Column
    private int Inmobiliaria;
    
    @Column
    private int Ubicacion;

    public void setid_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setInmobiliaria(int Inmobiliaria) {
        this.Inmobiliaria = Inmobiliaria;
    }

    public void setUbicacion(int Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public int getid_sucursal() {
        return id_sucursal;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public int getInmobiliaria() {
        return Inmobiliaria;
    }

    public int getUbicacion() {
        return Ubicacion;
    }

   
}
