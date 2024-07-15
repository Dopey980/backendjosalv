
package co.edu.inmobiliaria.jos.alv.backendJosAlv.infraestructura;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Cuenta_de_cobro;
import java.util.List;
import org.springframework.data.repository.Repository;
 
 
public interface Cuenta_de_cobroRepository extends Repository<Cuenta_de_cobro, Integer>{
    List<Cuenta_de_cobro> findAll();
    Cuenta_de_cobro findById(int id_cuenta_de_cobro);
    Cuenta_de_cobro save(Cuenta_de_cobro p);
    void delete(Cuenta_de_cobro p);
}