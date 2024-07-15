
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Inmueble;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface InmuebleRepository extends Repository<Inmueble, Integer>{
    List<Inmueble> findAll();
    Inmueble findById(int id_inmueble);
    Inmueble save(Inmueble p);
    void delete(Inmueble p);
}
