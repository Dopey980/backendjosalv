
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Ubicacion_geo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.Ubicacion_geoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ubicacion_geoServiceImp implements Ubicacion_geoService{
    @Autowired
    private Ubicacion_geoRepository repositorio;
    
    @Override
    public List<Ubicacion_geo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Ubicacion_geo listarId(int id_ubicacion_geo) {
        return repositorio.findById(id_ubicacion_geo);
    }

    @Override
    public Ubicacion_geo add(Ubicacion_geo p) {
        return repositorio.save(p);
    }

    @Override
    public Ubicacion_geo edit(Ubicacion_geo p) {
        return repositorio.save(p);
    }

    @Override
    public Ubicacion_geo delete(int id_ubicacion_geo) {
        Ubicacion_geo p=repositorio.findById(id_ubicacion_geo);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
