
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Analisis_de_riesgo;
import java.util.List;
import org.springframework.data.repository.Repository;
 
 
public interface Analisis_de_riesgoRepository extends Repository<Analisis_de_riesgo, Integer>{
    List<Analisis_de_riesgo> findAll();
    Analisis_de_riesgo findById(int id_analisis_de_riesgo);
    Analisis_de_riesgo save(Analisis_de_riesgo p);
    void delete(Analisis_de_riesgo p);
}
