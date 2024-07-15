
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Arriendo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.ArriendoService;
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
@RequestMapping({"/arriendos"})

public class ArriendoControlador {
    @Autowired
    ArriendoService service;
    
    @GetMapping("/submit")
    public List<Arriendo> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Arriendo agregar(@RequestBody Arriendo p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Arriendo listarId(@PathVariable("id") int id_arriendo){
        return service.listarId(id_arriendo);
    }
    
    @PutMapping("/submit/{id}")
    public Arriendo  editar(@RequestBody Arriendo p, @PathVariable("id") int id_arriendo){
        p.setid_arriendo(id_arriendo);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Arriendo delete(@PathVariable("id")int id_arriendo){
        return service.delete(id_arriendo);
    }
}
