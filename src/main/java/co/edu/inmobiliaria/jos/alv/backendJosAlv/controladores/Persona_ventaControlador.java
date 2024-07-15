
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;



import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Persona_venta;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.Persona_ventaService;
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
@RequestMapping({"/personas_ventas"})
public class Persona_ventaControlador {
    @Autowired
    Persona_ventaService service;
    
    @GetMapping("/submit")
    public List<Persona_venta> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Persona_venta agregar(@RequestBody Persona_venta p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Persona_venta listarId(@PathVariable("id") int id_persona_venta){
        return service.listarId(id_persona_venta);
    }
    
    @PutMapping("/submit/{id}")
    public Persona_venta  editar(@RequestBody Persona_venta p, @PathVariable("id") int id_persona_venta){
        p.setid_persona_venta(id_persona_venta);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Persona_venta delete(@PathVariable("id")int id_persona_venta){
        return service.delete(id_persona_venta);
    }
}

