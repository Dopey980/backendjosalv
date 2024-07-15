
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;



import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Informacion_comercial;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.Informacion_comercialService;
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
@RequestMapping({"/informacion_comercial"})
public class Informacion_comercialControlador {
    @Autowired
    Informacion_comercialService service;
    
    @GetMapping("/submit")
    public List<Informacion_comercial> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Informacion_comercial agregar(@RequestBody Informacion_comercial p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Informacion_comercial listarId(@PathVariable("id") int id_informacion_comercial){
        return service.listarId(id_informacion_comercial);
    }
    
    @PutMapping("/submit/{id}")
    public Informacion_comercial  editar(@RequestBody Informacion_comercial p, @PathVariable("id") int id_informacion_comercial){
        p.setid_informacion_comercial(id_informacion_comercial);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Informacion_comercial delete(@PathVariable("id")int id_informacion_comercial){
        return service.delete(id_informacion_comercial);
    }
}