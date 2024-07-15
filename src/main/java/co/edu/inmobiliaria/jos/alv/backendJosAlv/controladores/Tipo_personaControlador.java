
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Tipo_persona;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.Tipo_personaService;
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
@RequestMapping({"/tipos_personas"})
public class Tipo_personaControlador{
   @Autowired
    Tipo_personaService service;
    
    @GetMapping("/submit")
    public List<Tipo_persona> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Tipo_persona agregar(@RequestBody Tipo_persona p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Tipo_persona listarId(@PathVariable("id") int id_tipo_persona){
        return service.listarId(id_tipo_persona);
    }
    
    @PutMapping("/submit/{id}")
    public Tipo_persona editar(@RequestBody Tipo_persona p, @PathVariable("id") int id_tipo_persona){
        p.setid_tipo_persona(id_tipo_persona);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Tipo_persona delete(@PathVariable("id")int id_tipo_persona){
        return service.delete(id_tipo_persona);
    } 
}
