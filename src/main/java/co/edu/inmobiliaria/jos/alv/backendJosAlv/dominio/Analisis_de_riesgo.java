
package co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "analisis_de_riesgo")
public class Analisis_de_riesgo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_analisis_de_riesgo;
    
    @Column
    private boolean Lista_clinton;
    
    @Column
    private boolean Certificado_de_libertad;
    
    @Column
    private boolean Centrales_de_riesgo;
    
    @Column
    private int Inmueble;

    public int getid_analisis_de_riesgo() {
        return id_analisis_de_riesgo;
    }

    public void setid_analisis_de_riesgo(int id_analisis_de_riesgo) {
        this.id_analisis_de_riesgo = id_analisis_de_riesgo;
    }

    public boolean isLista_clinton() {
        return Lista_clinton;
    }

    public void setLista_clinton(boolean Lista_clinton) {
        this.Lista_clinton = Lista_clinton;
    }

    public boolean isCertificado_de_libertad() {
        return Certificado_de_libertad;
    }

    public void setCertificado_de_libertad(boolean Certificado_de_libertad) {
        this.Certificado_de_libertad = Certificado_de_libertad;
    }

    public boolean isCentrales_de_riesgo() {
        return Centrales_de_riesgo;
    }

    public void setCentrales_de_riesgo(boolean Centrales_de_riesgo) {
        this.Centrales_de_riesgo = Centrales_de_riesgo;
    }

    public int getInmueble() {
        return Inmueble;
    }

    public void setInmueble(int Inmueble) {
        this.Inmueble = Inmueble;
    }   
    
}
