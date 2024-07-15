
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Arriendo;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface ArriendoRepository extends Repository<Arriendo, Integer>{
    List<Arriendo> findAll();
    Arriendo findById(int id_arriendo);
    Arriendo save(Arriendo p);
    void delete(Arriendo p);
}
