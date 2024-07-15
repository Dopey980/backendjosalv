package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Inmobiliaria;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.InmobiliariaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InmobiliariaServiceImp implements InmobiliariaService{
   @Autowired
    private InmobiliariaRepository repositorio;
    
    @Override
    public List<Inmobiliaria> listar() {
        return repositorio.findAll();
    }

    @Override
    public Inmobiliaria listarId(int id_inmobiliria) {
        return repositorio.findById(id_inmobiliria);
    }

    @Override
    public Inmobiliaria add(Inmobiliaria p) {
        return repositorio.save(p);
    }

    @Override
    public Inmobiliaria edit(Inmobiliaria p) {
        return repositorio.save(p);
    }

    @Override
    public Inmobiliaria delete(int id_inmobiliria) {
        Inmobiliaria p=repositorio.findById(id_inmobiliria);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    } 
}
