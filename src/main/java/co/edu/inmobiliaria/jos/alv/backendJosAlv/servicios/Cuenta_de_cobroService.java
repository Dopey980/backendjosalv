
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Cuenta_de_cobro;
import java.util.List;


public interface Cuenta_de_cobroService {
    List<Cuenta_de_cobro> listar();
    Cuenta_de_cobro listarId(int id_cuenta_de_cobro);
    Cuenta_de_cobro add(Cuenta_de_cobro p);
    Cuenta_de_cobro edit(Cuenta_de_cobro p);
    Cuenta_de_cobro delete(int id_cuenta_de_cobro);
}