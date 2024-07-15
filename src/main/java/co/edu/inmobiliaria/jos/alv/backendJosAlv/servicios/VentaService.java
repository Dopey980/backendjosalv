
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Venta;
import java.util.List;

public interface  VentaService {
    List<Venta> listar();
    Venta listarId(int id_venta);
    Venta add(Venta p);
    Venta edit(Venta p);
    Venta delete(int id_venta);
}
