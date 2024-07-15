
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_compra;
import java.util.List;

public interface Persona_compraService {
    List<Persona_compra> listar();
    Persona_compra listarId(int id_persona_compra);
    Persona_compra add(Persona_compra p);
    Persona_compra edit(Persona_compra p);
    Persona_compra delete(int id_persona_compra);
}
