package Model;

public class Marca {
    private Long id_marca;
    private String nombre_marca;
    private Long fk_prov;

    public Marca(Long id_marca, String nombre_marca, Long fk_prov) {
        this.id_marca = id_marca;
        this.nombre_marca = nombre_marca;
        this.fk_prov = fk_prov;
    }

    public Long getId_marca() {
        return id_marca;
    }

    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public Long getFk_prov() {
        return fk_prov;
    }

    public void setFk_prov(Long fk_prov) {
        this.fk_prov = fk_prov;
    }
}
