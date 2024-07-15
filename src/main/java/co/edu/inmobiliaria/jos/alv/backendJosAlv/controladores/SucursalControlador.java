
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Sucursal;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.SucursalService;
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
@RequestMapping({"/sucursales"})
public class SucursalControlador {
   @Autowired
    SucursalService service;
    
    @GetMapping("/submit")
    public List<Sucursal> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Sucursal agregar(@RequestBody Sucursal p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Sucursal listarId(@PathVariable("id") int id_sucursal){
        return service.listarId(id_sucursal);
    }
    
    @PutMapping("/submit/{id}")
    public Sucursal editar(@RequestBody Sucursal p, @PathVariable("id") int id_sucursal){
        p.setid_sucursal(id_sucursal);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Sucursal delete(@PathVariable("id")int id_sucursal){
        return service.delete(id_sucursal);
    } 
}
