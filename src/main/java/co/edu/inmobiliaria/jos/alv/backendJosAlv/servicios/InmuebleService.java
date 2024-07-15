
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Inmueble;
import java.util.List;

public interface InmuebleService {
    List<Inmueble> listar();
    Inmueble listarId(int id_inmueble);
    Inmueble add(Inmueble p);
    Inmueble edit(Inmueble p);
    Inmueble delete(int id_inmueble);
}
