
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Analisis_de_riesgo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.Analisis_de_riesgoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Analisis_de_riesgoServiceImp implements Analisis_de_riesgoService{
    @Autowired
    private Analisis_de_riesgoRepository repositorio;
    
    @Override
    public List<Analisis_de_riesgo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Analisis_de_riesgo listarId(int id_analisis_de_riesgo) {
        return repositorio.findById(id_analisis_de_riesgo);
    }

    @Override
    public Analisis_de_riesgo add(Analisis_de_riesgo p) {
        return repositorio.save(p);
    }

    @Override
    public Analisis_de_riesgo edit(Analisis_de_riesgo p) {
        return repositorio.save(p);
    }

    @Override
    public Analisis_de_riesgo delete(int id_analisis_de_riesgo) {
        Analisis_de_riesgo p=repositorio.findById(id_analisis_de_riesgo);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
