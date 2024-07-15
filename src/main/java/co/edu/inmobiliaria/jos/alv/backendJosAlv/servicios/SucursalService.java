
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Sucursal;
import java.util.List;

public interface  SucursalService {
    List<Sucursal> listar();
    Sucursal listarId(int id_sucursal);
    Sucursal add(Sucursal p);
    Sucursal edit(Sucursal p);
    Sucursal delete(int id_sucursal);
}
