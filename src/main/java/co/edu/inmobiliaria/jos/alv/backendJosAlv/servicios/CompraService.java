
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Compra;
import java.util.List;

public interface CompraService {
    List<Compra> listar();
    Compra listarId(int id_compra);
    Compra add(Compra p);
    Compra edit(Compra p);
    Compra delete(int id_compra);
}
