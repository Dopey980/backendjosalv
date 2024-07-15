
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_arriendo;
import java.util.List;

public interface Persona_arriendoService {
    List<Persona_arriendo> listar();
    Persona_arriendo listarId(int id_persona_arriendo);
    Persona_arriendo add(Persona_arriendo p);
    Persona_arriendo edit(Persona_arriendo p);
    Persona_arriendo delete(int id_persona_arriendo);
}
