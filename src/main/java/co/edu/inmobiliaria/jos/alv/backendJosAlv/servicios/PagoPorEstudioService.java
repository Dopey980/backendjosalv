
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.PagoPorEstudio;
import java.util.List;

public interface PagoPorEstudioService {
    List<PagoPorEstudio> listar();
    PagoPorEstudio listarId(int id_pago_por_estudio);
    PagoPorEstudio add(PagoPorEstudio p);
    PagoPorEstudio edit(PagoPorEstudio p);
    PagoPorEstudio delete(int id_pago_por_estudio); 
}
