
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.PagoPorComision;
import java.util.List;

public interface PagoPorComisionService {
    List<PagoPorComision> listar();
    PagoPorComision listarId(int id_pago_por_comision);
    PagoPorComision add(PagoPorComision p);
    PagoPorComision edit(PagoPorComision p);
    PagoPorComision delete(int id_pago_por_comision);
}
