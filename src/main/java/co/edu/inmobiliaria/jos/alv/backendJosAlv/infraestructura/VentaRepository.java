
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Venta;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface  VentaRepository extends Repository<Venta, Integer> {
    List<Venta> findAll();
    Venta findById(int id_venta);
    Venta save(Venta p);
    void delete(Venta p);
}
