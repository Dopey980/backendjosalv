
package co.edu.inmobiliaria.jos.alv.backendJosAlv.servicios;

import co.edu.inmobiliaria.jos.alv.backendJosAlv.dominio.Analisis_de_riesgo;
import java.util.List;


public interface Analisis_de_riesgoService {
    List<Analisis_de_riesgo> listar();
    Analisis_de_riesgo listarId(int id_analisis_de_riesgo);
    Analisis_de_riesgo add(Analisis_de_riesgo p);
    Analisis_de_riesgo edit(Analisis_de_riesgo p);
    Analisis_de_riesgo delete(int id_analisis_de_riesgo);
}
