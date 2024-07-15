
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.PagoPorComision;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.PagoPorComisionService;
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
@RequestMapping({"/pagos_por_comisiones"})
public class PagoPorComisionControlador {
  @Autowired
   PagoPorComisionService service;
    
    @GetMapping("/submit")
    public List<PagoPorComision> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public PagoPorComision agregar(@RequestBody PagoPorComision p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public PagoPorComision listarId(@PathVariable("id") int id_pago_por_comision){
        return service.listarId(id_pago_por_comision);
    }
    
    @PutMapping("/submit/{id}")
    public PagoPorComision  editar(@RequestBody PagoPorComision p, @PathVariable("id") int id_pago_por_comision){
        p.setid_pago_por_comision(id_pago_por_comision);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public PagoPorComision delete(@PathVariable("id")int id_pago_por_comision){
        return service.delete(id_pago_por_comision);
    }  
}
