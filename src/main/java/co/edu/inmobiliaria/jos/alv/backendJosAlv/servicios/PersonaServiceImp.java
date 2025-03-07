
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService{
    @Autowired
    private PersonaRepository repositorio;
    
    @Override
    public List<Persona> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona listarId(int id_persona) {
        return repositorio.findById(id_persona);
    }

    @Override
    public Persona add(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona edit(Persona p) {
        return repositorio.save(p);
    }

    @Override
    public Persona delete(int id_persona) {
        Persona p=repositorio.findById(id_persona);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
