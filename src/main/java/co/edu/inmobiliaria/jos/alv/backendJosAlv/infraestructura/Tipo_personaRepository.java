
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Tipo_persona;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface  Tipo_personaRepository extends Repository<Tipo_persona, Integer> {
    List<Tipo_persona> findAll();
    Tipo_persona findById(int id_tipo_persona);
    Tipo_persona save(Tipo_persona p);
    void delete(Tipo_persona p);
}
