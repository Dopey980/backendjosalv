
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Cita;
import java.util.List;


public interface CitaService {
    List<Cita> listar();
    Cita listarId(int id_cita);
    Cita add(Cita p);
    Cita edit(Cita p);
    Cita delete(int id_cita);
}