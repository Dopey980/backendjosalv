
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Ubicacion_geo;
import java.util.List;

public interface Ubicacion_geoService {
    List<Ubicacion_geo> listar();
    Ubicacion_geo listarId(int id_ubicacion_geo);
    Ubicacion_geo add(Ubicacion_geo p);
    Ubicacion_geo edit(Ubicacion_geo p);
    Ubicacion_geo delete(int id_ubicacion_geo);
}
