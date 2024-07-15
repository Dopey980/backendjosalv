
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.PersonaService;
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
@RequestMapping({"/personas"})
public class PersonaControlador {
    @Autowired
    PersonaService service;
    
    @GetMapping("/submit")
    public List<Persona> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Persona listarId(@PathVariable("id") int id_persona){
        return service.listarId(id_persona);
    }
    
    @PutMapping("/submit/{id}")
    public Persona  editar(@RequestBody Persona p, @PathVariable("id") int id_persona){
        p.setid_persona(id_persona);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Persona delete(@PathVariable("id")int id_persona){
        return service.delete(id_persona);
    }
}
