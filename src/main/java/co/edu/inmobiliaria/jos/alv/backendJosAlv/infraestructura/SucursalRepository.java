
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Sucursal;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface  SucursalRepository extends Repository<Sucursal, Integer> {
    List<Sucursal> findAll();
    Sucursal findById(int id_sucursal);
    Sucursal save(Sucursal p);
    void delete(Sucursal p);
}
