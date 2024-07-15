
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Visita;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface  VisitaRepository extends Repository<Visita, Integer> {
    List<Visita> findAll();
    Visita findById(int id_visita);
    Visita save(Visita p);
    void delete(Visita p);
}
