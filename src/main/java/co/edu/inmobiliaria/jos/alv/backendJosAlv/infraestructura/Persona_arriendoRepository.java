
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_arriendo;
import java.util.List;
import org.springframework.data.repository.Repository;
 
 
public interface Persona_arriendoRepository extends Repository<Persona_arriendo, Integer>{
    List<Persona_arriendo> findAll();
    Persona_arriendo findById(int id_persona_arriendo);
    Persona_arriendo save(Persona_arriendo p);
    void delete(Persona_arriendo p);
}