
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Inmobiliaria;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface InmobiliariaRepository extends Repository<Inmobiliaria, Integer>{
    List<Inmobiliaria> findAll();
    Inmobiliaria findById(int id_inmobiliaria);
    Inmobiliaria save(Inmobiliaria p);
    void delete(Inmobiliaria p);
}
