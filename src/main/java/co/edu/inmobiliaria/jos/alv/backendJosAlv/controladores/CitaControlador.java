
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;



import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Cita;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.CitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/citas"})
public class CitaControlador {
    @Autowired
    CitaService service;
    
    @GetMapping("/submit")
    public List<Cita> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Cita agregar(@RequestBody Cita p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Cita listarId(@PathVariable("id") int id_cita){
        return service.listarId(id_cita);
    }
    
    @PutMapping("/submit/{id}")
    public Cita  editar(@RequestBody Cita p, @PathVariable("id") int id_cita){
        p.setid_cita(id_cita);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Cita delete(@PathVariable("id")int id_cita){
        return service.delete(id_cita);
    }
}
