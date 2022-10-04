package pac;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private Long id;
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String sexo;
    private Set <Modulo> Modulos = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Set getModulos() {
        return Modulos;
    }

    public void setModulos(Set Modulos) {
        this.Modulos = Modulos;
    }

    public void addModulo (Modulo modulo) {
        this.Modulos.add(modulo);
    }

    @Override
    public String toString() {
        return "Insert into alumno, nombre: "+nombre+", nacionalidad: "+nacionalidad+", edad: "+edad+", sexo: "+sexo+", modulos: "+Modulos.size();
    }
}
