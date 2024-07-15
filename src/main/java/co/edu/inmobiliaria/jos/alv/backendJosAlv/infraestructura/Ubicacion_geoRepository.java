
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Ubicacion_geo;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface Ubicacion_geoRepository extends Repository<Ubicacion_geo, Integer>  {
    List<Ubicacion_geo> findAll();
    Ubicacion_geo findById(int id_ubicacion_geo);
    Ubicacion_geo save(Ubicacion_geo p);
    void delete(Ubicacion_geo p);
}
