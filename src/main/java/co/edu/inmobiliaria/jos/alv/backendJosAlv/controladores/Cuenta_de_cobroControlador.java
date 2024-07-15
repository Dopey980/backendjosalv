
package co.edu.inmobiliaria.jos.alv.backendJosAlv.controladores;



import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Cuenta_de_cobro;
import co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios.Cuenta_de_cobroService;
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
@RequestMapping({"/cuentas_de_cobro"})
public class Cuenta_de_cobroControlador {
    @Autowired
    Cuenta_de_cobroService service;
    
    @GetMapping("/submit")
    public List<Cuenta_de_cobro> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Cuenta_de_cobro agregar(@RequestBody Cuenta_de_cobro p){
        return service.add(p);
    }
    
    @GetMapping("/submit/{id}")
    public Cuenta_de_cobro listarId(@PathVariable("id") int id_cuenta_de_cobro){
        return service.listarId(id_cuenta_de_cobro);
    }
    
    @PutMapping("/submit/{id}")
    public Cuenta_de_cobro  editar(@RequestBody Cuenta_de_cobro p, @PathVariable("id") int id_cuenta_de_cobro){
        p.setid_cuenta_de_cobro(id_cuenta_de_cobro);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public Cuenta_de_cobro delete(@PathVariable("id")int id_cuenta_de_cobro){
        return service.delete(id_cuenta_de_cobro);
    }
}