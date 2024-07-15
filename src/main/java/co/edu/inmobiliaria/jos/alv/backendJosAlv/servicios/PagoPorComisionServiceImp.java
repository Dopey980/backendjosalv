package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.PagoPorComision;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.PagoPorComisionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoPorComisionServiceImp implements PagoPorComisionService {
    @Autowired
    private PagoPorComisionRepository repositorio;
    
    @Override
    public List<PagoPorComision> listar() {
        return repositorio.findAll();
    }

    @Override
    public PagoPorComision listarId(int id_pago_por_comision) {
        return repositorio.findById(id_pago_por_comision);
    }

    @Override
    public PagoPorComision add(PagoPorComision p) {
        return repositorio.save(p);
    }

    @Override
    public PagoPorComision edit(PagoPorComision p) {
        return repositorio.save(p);
    }

    @Override
    public PagoPorComision delete(int id_pago_por_comision) {
        PagoPorComision p=repositorio.findById(id_pago_por_comision);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
