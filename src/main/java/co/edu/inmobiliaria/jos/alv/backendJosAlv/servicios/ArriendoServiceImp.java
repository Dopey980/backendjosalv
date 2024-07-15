
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Arriendo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.ArriendoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArriendoServiceImp implements ArriendoService{
    @Autowired
    private ArriendoRepository repositorio;
    
    @Override
    public List<Arriendo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Arriendo listarId(int id_arriendo) {
        return repositorio.findById(id_arriendo);
    }

    @Override
    public Arriendo add(Arriendo p) {
        return repositorio.save(p);
    }

    @Override
    public Arriendo edit(Arriendo p) {
        return repositorio.save(p);
    }

    @Override
    public Arriendo delete(int id_arriendo) {
        Arriendo p=repositorio.findById(id_arriendo);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}

