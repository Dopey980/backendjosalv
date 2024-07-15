package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.PagoPorEstudio;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface  PagoPorEstudioRepository extends Repository<PagoPorEstudio, Integer> {
    List<PagoPorEstudio> findAll();
    PagoPorEstudio findById(int id_pago_por_estudio);
    PagoPorEstudio save(PagoPorEstudio p);
    void delete(PagoPorEstudio p);
}
