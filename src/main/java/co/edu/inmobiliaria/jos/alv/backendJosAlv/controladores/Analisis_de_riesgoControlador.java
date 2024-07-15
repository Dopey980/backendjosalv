
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;



import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Analisis_de_riesgo;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.Analisis_de_riesgoService;
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
@RequestMapping({"/analisis_de_riesgo"})
public class Analisis_de_riesgoControlador {
    @Autowired
    Analisis_de_riesgoService service;
    
    @GetMapping("/submit")
    public List<Analisis_de_riesgo> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Analisis_de_riesgo agregar(@RequestBody Analisis_de_riesgo p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Analisis_de_riesgo listarId(@PathVariable("id") int id_analisis_de_riesgo){
        return service.listarId(id_analisis_de_riesgo);
    }
    
    @PutMapping("/submit/{id}")
    public Analisis_de_riesgo  editar(@RequestBody Analisis_de_riesgo p, @PathVariable("id") int id_analisis_de_riesgo){
        p.setid_analisis_de_riesgo(id_analisis_de_riesgo);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Analisis_de_riesgo delete(@PathVariable("id")int id_analisis_de_riesgo){
        return service.delete(id_analisis_de_riesgo);
    }
}
