
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Venta;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.VentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImp implements VentaService{
    @Autowired
    private VentaRepository repositorio;
    
    @Override
    public List<Venta> listar() {
        return repositorio.findAll();
    }

    @Override
    public Venta listarId(int id_venta) {
        return repositorio.findById(id_venta);
    }

    @Override
    public Venta add(Venta p) {
        return repositorio.save(p);
    }

    @Override
    public Venta edit(Venta p) {
        return repositorio.save(p);
    }

    @Override
    public Venta delete(int id_venta) {
        Venta p=repositorio.findById(id_venta);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
