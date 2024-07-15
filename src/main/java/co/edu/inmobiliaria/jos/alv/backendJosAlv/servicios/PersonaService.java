
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona;
import java.util.List;

public interface PersonaService {
    List<Persona> listar();
    Persona listarId(int id_persona);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id_persona);
}
