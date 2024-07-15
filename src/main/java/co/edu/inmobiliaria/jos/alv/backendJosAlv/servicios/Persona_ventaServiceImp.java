
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_venta;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.Persona_ventaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Persona_ventaServiceImp implements Persona_ventaService{
    @Autowired
    private Persona_ventaRepository repositorio;
    
    @Override
    public List<Persona_venta> listar() {
        return repositorio.findAll();
    }

    @Override
    public Persona_venta listarId(int id_persona_venta) {
        return repositorio.findById(id_persona_venta);
    }

    @Override
    public Persona_venta add(Persona_venta p) {
        return repositorio.save(p);
    }

    @Override
    public Persona_venta edit(Persona_venta p) {
        return repositorio.save(p);
    }

    @Override
    public Persona_venta delete(int id_persona_venta) {
        Persona_venta p=repositorio.findById(id_persona_venta);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}