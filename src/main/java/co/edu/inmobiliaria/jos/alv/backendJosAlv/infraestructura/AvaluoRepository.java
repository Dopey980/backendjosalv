package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Avaluo;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface AvaluoRepository extends Repository<Avaluo, Integer>{
    List<Avaluo> findAll();
    Avaluo findById(int id_avaluo);
    Avaluo save(Avaluo p);
    void delete(Avaluo p);
}
