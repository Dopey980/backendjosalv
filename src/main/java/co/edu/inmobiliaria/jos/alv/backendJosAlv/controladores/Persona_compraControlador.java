
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;



import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_compra;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.Persona_compraService;
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
@RequestMapping({"/personas_compras"})
public class Persona_compraControlador {
    @Autowired
    Persona_compraService service;
    
    @GetMapping("/submit")
    public List<Persona_compra> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Persona_compra agregar(@RequestBody Persona_compra p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Persona_compra listarId(@PathVariable("id") int id_persona_compra){
        return service.listarId(id_persona_compra);
    }
    
    @PutMapping("/submit/{id}")
    public Persona_compra  editar(@RequestBody Persona_compra p, @PathVariable("id") int id_persona_compra){
        p.setid_persona_compra(id_persona_compra);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Persona_compra delete(@PathVariable("id")int id_persona_compra){
        return service.delete(id_persona_compra);
    }
}
