
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_arriendo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.Persona_arriendoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Persona_arriendoServiceImp implements Persona_arriendoService{
    @Autowired
    private Persona_arriendoRepository repositorio;
    
    @Override
    public List<Persona_arriendo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona_arriendo listarId(int id_persona_arriendo) {
        return repositorio.findById(id_persona_arriendo);
    }

    @Override
    public Persona_arriendo add(Persona_arriendo p) {
        return repositorio.save(p);
    }

    @Override
    public Persona_arriendo edit(Persona_arriendo p) {
        return repositorio.save(p);
    }

    @Override
    public Persona_arriendo delete(int id_persona_arriendo) {
        Persona_arriendo p=repositorio.findById(id_persona_arriendo);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}