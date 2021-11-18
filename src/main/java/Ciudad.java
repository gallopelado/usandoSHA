import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ciudad {
    private String codigo_ciudad;
    private String nombre_ciudad;

   /* public Ciudad(String codigo_ciudad, String nombre_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
        this.nombre_ciudad = nombre_ciudad;
    }

    public Ciudad() {
    }

    public String getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(String codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "codigo_ciudad='" + codigo_ciudad + '\'' +
                ", nombre_ciudad='" + nombre_ciudad + '\'' +
                '}';
    }*/
}
