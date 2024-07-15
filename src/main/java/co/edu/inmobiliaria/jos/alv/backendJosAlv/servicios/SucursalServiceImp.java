
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Sucursal;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.SucursalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalServiceImp implements SucursalService{
    @Autowired
    private SucursalRepository repositorio;
    
    @Override
    public List<Sucursal> listar() {
        return repositorio.findAll();
    }

    @Override
    public Sucursal listarId(int id_sucursal) {
        return repositorio.findById(id_sucursal);
    }

    @Override
    public Sucursal add(Sucursal p) {
        return repositorio.save(p);
    }

    @Override
    public Sucursal edit(Sucursal p) {
        return repositorio.save(p);
    }

    @Override
    public Sucursal delete(int id_sucursal) {
        Sucursal p=repositorio.findById(id_sucursal);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
