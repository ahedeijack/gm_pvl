package Model;

public class Proveedor {
    private Long id_prov;
    private String nombre_prov;
    private String direccion_prov;

    public Proveedor(Long id_prov, String nombre_prov, String direccion_prov) {
        this.id_prov = id_prov;
        this.nombre_prov = nombre_prov;
        this.direccion_prov = direccion_prov;
    }

    public Long getId_prov() {
        return id_prov;
    }

    public void setId_prov(Long id_prov) {
        this.id_prov = id_prov;
    }

    public String getNombre_prov() {
        return nombre_prov;
    }

    public void setNombre_prov(String nombre_prov) {
        this.nombre_prov = nombre_prov;
    }

    public String getDireccion_prov() {
        return direccion_prov;
    }

    public void setDireccion_prov(String direccion_prov) {
        this.direccion_prov = direccion_prov;
    }
}
