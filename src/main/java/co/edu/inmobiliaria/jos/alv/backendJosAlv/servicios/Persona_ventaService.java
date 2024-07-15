
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_venta;
import java.util.List;

public interface Persona_ventaService {
    List<Persona_venta> listar();
    Persona_venta listarId(int id_persona_venta);
    Persona_venta add(Persona_venta p);
    Persona_venta edit(Persona_venta p);
    Persona_venta delete(int id_persona_venta);
}