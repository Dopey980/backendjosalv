
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Compra;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface CompraRepository extends Repository<Compra, Integer> {
    List<Compra> findAll();
    Compra findById(int id_compra);
    Compra save(Compra p);
    void delete(Compra p);
}
