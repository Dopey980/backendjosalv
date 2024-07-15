
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Visita;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.VisitaService;
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
@RequestMapping({"/visitas"})
public class VisitaControlador {
   @Autowired
    VisitaService service;
    
    @GetMapping("/submit")
    public List<Visita> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Visita agregar(@RequestBody Visita p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Visita listarId(@PathVariable("id") int id_visita){
        return service.listarId(id_visita);
    }
    
    @PutMapping("/submit/{id}")
    public Visita editar(@RequestBody Visita p, @PathVariable("id") int id_visita){
        p.setid_visita(id_visita);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Visita delete(@PathVariable("id")int id_visita){
        return service.delete(id_visita);
    }   
}