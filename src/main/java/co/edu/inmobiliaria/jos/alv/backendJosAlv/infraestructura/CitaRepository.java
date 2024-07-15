
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Cita;
import java.util.List;
import org.springframework.data.repository.Repository;
 
 
public interface CitaRepository extends Repository<Cita, Integer>{
    List<Cita> findAll();
    Cita findById(int id_cita);
    Cita save(Cita p);
    void delete(Cita p);
}