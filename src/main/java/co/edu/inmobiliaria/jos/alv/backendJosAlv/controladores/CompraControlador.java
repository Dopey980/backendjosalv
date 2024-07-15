
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Compra;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.CompraService;
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
@RequestMapping({"/compras"})

public class CompraControlador {
    @Autowired
    CompraService service;
    
    @GetMapping("/submit")
    public List<Compra> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Compra agregar(@RequestBody Compra p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Compra listarId(@PathVariable("id") int id_compra){
        return service.listarId(id_compra);
    }
    
    @PutMapping("/submit/{id}")
    public Compra  editar(@RequestBody Compra p, @PathVariable("id") int id_compra){
        p.setid_compra(id_compra);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Compra delete(@PathVariable("id")int id_compra){
        return service.delete(id_compra);
    }
}
