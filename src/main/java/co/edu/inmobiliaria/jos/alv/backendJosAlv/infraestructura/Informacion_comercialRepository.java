
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Informacion_comercial;
import java.util.List;
import org.springframework.data.repository.Repository;
 
 
public interface Informacion_comercialRepository extends Repository<Informacion_comercial, Integer>{
    List<Informacion_comercial> findAll();
    Informacion_comercial findById(int id_informacion_comercial);
    Informacion_comercial save(Informacion_comercial p);
    void delete(Informacion_comercial p);
}
