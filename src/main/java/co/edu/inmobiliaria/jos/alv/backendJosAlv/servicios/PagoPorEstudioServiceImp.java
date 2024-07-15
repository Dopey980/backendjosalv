
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.PagoPorEstudio;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.PagoPorEstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoPorEstudioServiceImp implements PagoPorEstudioService {
    @Autowired
    private PagoPorEstudioRepository repositorio;
    
    @Override
    public List<PagoPorEstudio> listar() {
        return repositorio.findAll();
    }

    @Override
    public PagoPorEstudio listarId(int id_pago_por_estudio) {
        return repositorio.findById(id_pago_por_estudio);
    }

    @Override
    public PagoPorEstudio add(PagoPorEstudio p) {
        return repositorio.save(p);
    }

    @Override
    public PagoPorEstudio edit(PagoPorEstudio p) {
        return repositorio.save(p);
    }

    @Override
    public PagoPorEstudio delete(int id_pago_por_estudio) {
        PagoPorEstudio p=repositorio.findById(id_pago_por_estudio);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
