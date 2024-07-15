
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Ubicacion_geo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.Ubicacion_geoService;
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
@RequestMapping({"/ubicacion_geo"})
public class Ubicacion_geoControlador {
    @Autowired
    Ubicacion_geoService service;
    
    @GetMapping("/submit")
    public List<Ubicacion_geo> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Ubicacion_geo agregar(@RequestBody Ubicacion_geo p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Ubicacion_geo listarId(@PathVariable("id") int id_ubicacion_geo){
        return service.listarId(id_ubicacion_geo);
    }
    
    @PutMapping("/submit/{id}")
    public Ubicacion_geo editar(@RequestBody Ubicacion_geo p, @PathVariable("id") int id_ubicacion_geo){
        p.setid_ubicacion_geo(id_ubicacion_geo);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Ubicacion_geo delete(@PathVariable("id")int id_ubicacion_geo){
        return service.delete(id_ubicacion_geo);
    } 
}
