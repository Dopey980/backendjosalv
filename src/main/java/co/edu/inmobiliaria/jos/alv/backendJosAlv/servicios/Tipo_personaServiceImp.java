
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Tipo_persona;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.Tipo_personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Tipo_personaServiceImp implements Tipo_personaService{
    @Autowired
    private Tipo_personaRepository repositorio;
    
    @Override
    public List<Tipo_persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Tipo_persona listarId(int id_tipo_persona) {
        return repositorio.findById(id_tipo_persona);
    }

    @Override
    public Tipo_persona add(Tipo_persona p) {
        return repositorio.save(p);
    }

    @Override
    public Tipo_persona edit(Tipo_persona p) {
        return repositorio.save(p);
    }

    @Override
    public Tipo_persona delete(int id_tipo_persona) {
        Tipo_persona p=repositorio.findById(id_tipo_persona);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
