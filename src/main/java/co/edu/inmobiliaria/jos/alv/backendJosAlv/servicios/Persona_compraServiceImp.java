
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_compra;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.Persona_compraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Persona_compraServiceImp implements Persona_compraService{
    @Autowired
    private Persona_compraRepository repositorio;
    
    @Override
    public List<Persona_compra> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona_compra listarId(int id_persona_compra) {
        return repositorio.findById(id_persona_compra);
    }

    @Override
    public Persona_compra add(Persona_compra p) {
        return repositorio.save(p);
    }

    @Override
    public Persona_compra edit(Persona_compra p) {
        return repositorio.save(p);
    }

    @Override
    public Persona_compra delete(int id_persona_compra) {
        Persona_compra p=repositorio.findById(id_persona_compra);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}