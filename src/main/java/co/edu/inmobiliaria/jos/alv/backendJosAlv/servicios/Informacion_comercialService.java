
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Informacion_comercial;
import java.util.List;


public interface Informacion_comercialService {
    List<Informacion_comercial> listar();
    Informacion_comercial listarId(int id_informacion_comercial);
    Informacion_comercial add(Informacion_comercial p);
    Informacion_comercial edit(Informacion_comercial p);
    Informacion_comercial delete(int id_informacion_comercial);
}