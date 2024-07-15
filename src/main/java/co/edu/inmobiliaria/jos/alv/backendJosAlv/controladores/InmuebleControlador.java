
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Inmueble;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.InmuebleService;
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
@RequestMapping({"/inmuebles"})
public class InmuebleControlador {
    @Autowired
    InmuebleService service;
    
    @GetMapping("/submit")
    public List<Inmueble> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Inmueble agregar(@RequestBody Inmueble p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Inmueble listarId(@PathVariable("id") int id_inmueble){
        return service.listarId(id_inmueble);
    }
    
    @PutMapping("/submit/{id}")
    public Inmueble  editar(@RequestBody Inmueble p, @PathVariable("id") int id_inmueble){
        p.setid_inmueble(id_inmueble);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Inmueble delete(@PathVariable("id")int id_inmueble){
        return service.delete(id_inmueble);
    }
}
