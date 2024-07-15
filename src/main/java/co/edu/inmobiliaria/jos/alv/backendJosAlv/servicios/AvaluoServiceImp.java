
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Avaluo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.AvaluoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaluoServiceImp implements AvaluoService{
    @Autowired
    private AvaluoRepository repositorio;
    
    @Override
    public List<Avaluo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Avaluo listarId(int id_avaluo) {
        return repositorio.findById(id_avaluo);
    }

    @Override
    public Avaluo add(Avaluo p) {
        return repositorio.save(p);
    }

    @Override
    public Avaluo edit(Avaluo p) {
        return repositorio.save(p);
    }

    @Override
    public Avaluo delete(int id_avaluo) {
        Avaluo p=repositorio.findById(id_avaluo);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
