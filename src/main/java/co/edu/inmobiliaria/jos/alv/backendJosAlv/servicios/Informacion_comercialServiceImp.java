
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Informacion_comercial;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.Informacion_comercialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Informacion_comercialServiceImp implements Informacion_comercialService{
    @Autowired
    private Informacion_comercialRepository repositorio;
    
    @Override
    public List<Informacion_comercial> listar() {
        return repositorio.findAll();
    }

    @Override
    public Informacion_comercial listarId(int id_informacion_comercial) {
        return repositorio.findById(id_informacion_comercial);
    }

    @Override
    public Informacion_comercial add(Informacion_comercial p) {
        return repositorio.save(p);
    }

    @Override
    public Informacion_comercial edit(Informacion_comercial p) {
        return repositorio.save(p);
    }

    @Override
    public Informacion_comercial delete(int id_informacion_comercial) {
        Informacion_comercial p=repositorio.findById(id_informacion_comercial);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}