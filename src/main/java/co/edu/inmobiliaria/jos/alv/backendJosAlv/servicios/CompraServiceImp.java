package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Compra;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.CompraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraServiceImp implements CompraService {
    @Autowired
    private CompraRepository repositorio;
    
    @Override
    public List<Compra> listar() {
        return repositorio.findAll();
    }

    @Override
    public Compra listarId(int id_compra) {
        return repositorio.findById(id_compra);
    }

    @Override
    public Compra add(Compra p) {
        return repositorio.save(p);
    }

    @Override
    public Compra edit(Compra p) {
        return repositorio.save(p);
    }

    @Override
    public Compra delete(int id_compra) {
        Compra p=repositorio.findById(id_compra);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    } 
}
