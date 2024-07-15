
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Tipo_persona;
import java.util.List;

public interface  Tipo_personaService {
    List<Tipo_persona> listar();
    Tipo_persona listarId(int id_tipo_persona);
    Tipo_persona add(Tipo_persona p);
    Tipo_persona edit(Tipo_persona p);
    Tipo_persona delete(int id_tipo_persona);
}