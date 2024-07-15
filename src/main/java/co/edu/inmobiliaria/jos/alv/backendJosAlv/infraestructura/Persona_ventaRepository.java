
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_venta;
import java.util.List;
import org.springframework.data.repository.Repository;
 
 
public interface Persona_ventaRepository extends Repository<Persona_venta, Integer>{
    List<Persona_venta> findAll();
    Persona_venta findById(int id_persona_venta);
    Persona_venta save(Persona_venta p);
    void delete(Persona_venta p);
}
