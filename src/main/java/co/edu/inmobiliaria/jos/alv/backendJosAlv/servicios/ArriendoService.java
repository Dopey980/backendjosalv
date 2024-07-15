
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Arriendo;
import java.util.List;


public interface ArriendoService {
    List<Arriendo> listar();
    Arriendo listarId(int id_arriendo);
    Arriendo add(Arriendo p);
    Arriendo edit(Arriendo p);
    Arriendo delete(int id_arriendo);
}
