package FestivosAPI.api.dominio.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Festivo {

    @Id
    private int id;
    private String nombre;
    private String fecha;
    private String pais;

    public Festivo() {
    }

    public Festivo(int id, String nombre, String fecha, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
