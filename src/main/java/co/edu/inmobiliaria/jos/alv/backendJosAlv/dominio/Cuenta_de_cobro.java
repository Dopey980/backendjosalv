
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "cuentas_de_cobro")
public class Cuenta_de_cobro {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cuenta_de_cobro;
    
    @Column
    private float Valor;
    
    @Column
    private int Inquilino;
    
    @Column
    private int Arriendo;

    public int getid_cuenta_de_cobro() {
        return id_cuenta_de_cobro;
    }

    public void setid_cuenta_de_cobro(int id_cuenta_de_cobro) {
        this.id_cuenta_de_cobro = id_cuenta_de_cobro;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public int getInquilino() {
        return Inquilino;
    }

    public void setInqulino(int Inquilino) {
        this.Inquilino = Inquilino;
    }

    public int getArriendo() {
        return Arriendo;
    }

    public void setArriendo(int Arriendo) {
        this.Arriendo = Arriendo;
    }    
    
}    
