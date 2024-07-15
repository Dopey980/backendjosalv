
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Cita;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura.CitaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaServiceImp implements CitaService{
    @Autowired
    private CitaRepository repositorio;
    
    @Override
    public List<Cita> listar() {
        return repositorio.findAll();
    }

    @Override
    public Cita listarId(int id_cita) {
        return repositorio.findById(id_cita);
    }

    @Override
    public Cita add(Cita p) {
        return repositorio.save(p);
    }

    @Override
    public Cita edit(Cita p) {
        return repositorio.save(p);
    }

    @Override
    public Cita delete(int id_cita) {
        Cita p=repositorio.findById(id_cita);
        if(p!=null){
            repositorio.delete(p);
        }
        return p;
    }
}
