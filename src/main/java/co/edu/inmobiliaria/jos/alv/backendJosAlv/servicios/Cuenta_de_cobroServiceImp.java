
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Cuenta_de_cobro;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.Cuenta_de_cobroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Cuenta_de_cobroServiceImp implements Cuenta_de_cobroService{
    @Autowired
    private Cuenta_de_cobroRepository repositorio;
    
    @Override
    public List<Cuenta_de_cobro> listar() {
        return repositorio.findAll();
    }

    @Override
    public Cuenta_de_cobro listarId(int id_cuenta_de_cobro) {
        return repositorio.findById(id_cuenta_de_cobro);
    }

    @Override
    public Cuenta_de_cobro add(Cuenta_de_cobro p) {
        return repositorio.save(p);
    }

    @Override
    public Cuenta_de_cobro edit(Cuenta_de_cobro p) {
        return repositorio.save(p);
    }

    @Override
    public Cuenta_de_cobro delete(int id_cuenta_de_cobro) {
        Cuenta_de_cobro p=repositorio.findById(id_cuenta_de_cobro);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}