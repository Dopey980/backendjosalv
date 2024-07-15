
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Inmobiliaria;
import java.util.List;

public interface InmobiliariaService {
    List<Inmobiliaria> listar();
    Inmobiliaria listarId(int id_inmobiliria);
    Inmobiliaria add(Inmobiliaria p);
    Inmobiliaria edit(Inmobiliaria p);
    Inmobiliaria delete(int id_inmobiliria);
}

