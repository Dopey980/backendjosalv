
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Visita;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.VisitaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitaServiceImp implements VisitaService{
    
    @Autowired
    private VisitaRepository repositorio;
    
    @Override
    public List<Visita> listar() {
        return repositorio.findAll();
    }

    @Override
    public Visita listarId(int id_visita) {
        return repositorio.findById(id_visita);
    }

    @Override
    public Visita add(Visita p) {
        return repositorio.save(p);
    }

    @Override
    public Visita edit(Visita p) {
        return repositorio.save(p);
    }

    @Override
    public Visita delete(int id_visita){
        Visita p=repositorio.findById(id_visita);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
