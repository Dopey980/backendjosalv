
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonaRepository extends Repository<Persona, Integer>{
    List<Persona> findAll();
    Persona findById(int id_persona);
    Persona save(Persona p);
    void delete(Persona p);
}
