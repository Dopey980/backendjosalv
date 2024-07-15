
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.PagoPorComision;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface PagoPorComisionRepository extends Repository<PagoPorComision, Integer>{
    List<PagoPorComision> findAll();
    PagoPorComision findById(int id_pago_por_comision);
    PagoPorComision save(PagoPorComision p);
    void delete( PagoPorComision p);
}
