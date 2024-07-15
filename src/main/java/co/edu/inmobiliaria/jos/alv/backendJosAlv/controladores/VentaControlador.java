
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Venta;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.VentaService;
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
@RequestMapping({"/ventas"})
public class VentaControlador {
   @Autowired
    VentaService service;
    
    @GetMapping("/submit")
    public List<Venta> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Venta agregar(@RequestBody Venta p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Venta listarId(@PathVariable("id") int id_venta){
        return service.listarId(id_venta);
    }
    
    @PutMapping("/submit/{id}")
    public Venta editar(@RequestBody Venta p, @PathVariable("id") int id_venta){
        p.setid_venta(id_venta);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Venta delete(@PathVariable("id")int id_venta){
        return service.delete(id_venta);
    }   
}
