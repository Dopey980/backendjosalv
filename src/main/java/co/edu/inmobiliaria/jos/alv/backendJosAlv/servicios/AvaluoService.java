
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Avaluo;
import java.util.List;


public interface AvaluoService {
    List<Avaluo> listar();
    Avaluo listarId(int id_avaluo);
    Avaluo add(Avaluo p);
    Avaluo edit(Avaluo p);
    Avaluo delete(int id_avaluo);
}
