
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_compra;
import java.util.List;
import org.springframework.data.repository.Repository;
 
 
public interface Persona_compraRepository extends Repository<Persona_compra, Integer>{
    List<Persona_compra> findAll();
    Persona_compra findById(int id_persona_compra);
    Persona_compra save(Persona_compra p);
    void delete(Persona_compra p);
}
