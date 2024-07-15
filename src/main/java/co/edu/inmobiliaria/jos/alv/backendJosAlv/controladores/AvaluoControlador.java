
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Avaluo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.AvaluoService;
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
@RequestMapping({"/avaluos"})
public class AvaluoControlador {
    @Autowired
    AvaluoService service;
    
    @GetMapping("/submit")
    public List<Avaluo> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Avaluo agregar(@RequestBody Avaluo p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Avaluo listarId(@PathVariable("id") int id_avaluo){
        return service.listarId(id_avaluo);
    }
    
    @PutMapping("/submit/{id}")
    public Avaluo  editar(@RequestBody Avaluo p, @PathVariable("id") int id_avaluo){
        p.setid_avaluo(id_avaluo);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Avaluo delete(@PathVariable("id")int id_avaluo){
        return service.delete(id_avaluo);
    }
}
