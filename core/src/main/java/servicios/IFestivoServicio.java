package FestivosAPI.api.core.servicios;

import FestivosAPI.api.dominio.entidades.Festivo;
import java.util.List;

public interface IFestivoServicio {

    public List<Festivo> listar();

    public Festivo obtener(int id);

    public List<Festivo> buscar(String nombre);

    public Festivo agregar(Festivo festivo);

    public Festivo modificar(Festivo festivo);

    public boolean eliminar(int id);
}
