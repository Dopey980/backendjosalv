
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Inmueble;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.InmuebleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InmuebleServiceImp implements InmuebleService{
     @Autowired
    private InmuebleRepository repositorio;
    
    @Override
    public List<Inmueble> listar() {
        return repositorio.findAll();
    }

    @Override
    public Inmueble listarId(int id_inmueble) {
        return repositorio.findById(id_inmueble);
    }

    @Override
    public Inmueble add(Inmueble p) {
        return repositorio.save(p);
    }

    @Override
    public Inmueble edit(Inmueble p) {
        return repositorio.save(p);
    }

    @Override
    public Inmueble delete(int id_inmueble) {
        Inmueble p=repositorio.findById(id_inmueble);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
