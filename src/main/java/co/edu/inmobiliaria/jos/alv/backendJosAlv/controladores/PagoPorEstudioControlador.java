
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.PagoPorEstudio;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.PagoPorEstudioService;
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
@RequestMapping({"/pagos_por_estudio"})
public class PagoPorEstudioControlador {
    @Autowired
    PagoPorEstudioService service;
    
    @GetMapping("/submit")
    public List<PagoPorEstudio> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public PagoPorEstudio agregar(@RequestBody PagoPorEstudio p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public PagoPorEstudio listarId(@PathVariable("id") int id_pago_por_estudio){
        return service.listarId(id_pago_por_estudio);
    }
    
    @PutMapping("/submit/{id}")
    public PagoPorEstudio  editar(@RequestBody PagoPorEstudio p, @PathVariable("id") int id_pago_por_estudio){
        p.setid_pago_por_estudio(id_pago_por_estudio);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public PagoPorEstudio delete(@PathVariable("id")int id_pago_por_estudio){
        return service.delete(id_pago_por_estudio);
    }
}
