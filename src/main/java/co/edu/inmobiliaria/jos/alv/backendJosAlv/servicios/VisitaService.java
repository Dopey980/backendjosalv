
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Visita;
import java.util.List;

public interface  VisitaService {
    List<Visita> listar();
    Visita listarId(int id_visita);
    Visita add(Visita p);
    Visita edit(Visita p);
    Visita delete(int id_visita);
}