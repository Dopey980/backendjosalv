
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Inmobiliaria;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.InmobiliariaService;
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
@RequestMapping({"/inmobiliarias"})
public class InmobiliariaControlador {
    @Autowired
    InmobiliariaService service;
    
    @GetMapping("/submit")
    public List<Inmobiliaria> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Inmobiliaria agregar(@RequestBody Inmobiliaria p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Inmobiliaria listarId(@PathVariable("id") int id_inmobiliaria){
        return service.listarId(id_inmobiliaria);
    }
    
    @PutMapping("/submit/{id}")
    public Inmobiliaria  editar(@RequestBody Inmobiliaria p, @PathVariable("id") int id_inmobiliaria){
        p.setid_inmobiliaria(id_inmobiliaria);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Inmobiliaria delete(@PathVariable("id")int id_inmobiliaria){
        return service.delete(id_inmobiliaria);
    }
}
