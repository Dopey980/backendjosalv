
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;



import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_arriendo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.Persona_arriendoService;
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
@RequestMapping({"/personas_arriendos"})
public class Persona_arriendoControlador {
    @Autowired
    Persona_arriendoService service;
    
    @GetMapping("/submit")
    public List<Persona_arriendo> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Persona_arriendo agregar(@RequestBody Persona_arriendo p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Persona_arriendo listarId(@PathVariable("id") int id_persona_arriendo){
        return service.listarId(id_persona_arriendo);
    }
    
    @PutMapping("/submit/{id}")
    public Persona_arriendo  editar(@RequestBody Persona_arriendo p, @PathVariable("id") int id_persona_arriendo){
        p.setid_persona_arriendo(id_persona_arriendo);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Persona_arriendo delete(@PathVariable("id")int id_persona_arriendo){
        return service.delete(id_persona_arriendo);
    }
}