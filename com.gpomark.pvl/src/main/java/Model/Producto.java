package Model;

public class Producto {
    private Long id_prod;
    private String nombre_prod;
    private Long fk_marca;
    private Long fk_categoria;
    private int existencias_prod;
    private String codigo_prod;
    private Double precio_prod;

    public Producto(Long idProducto, String nombre, Long fk_marca, Long fk_categoria, int stock, String codigo_prod, Double precio) {
        this.id_prod = idProducto;
        this.nombre_prod = nombre;
        this.fk_marca = fk_marca;
        this.fk_categoria = fk_categoria;
        this.existencias_prod = stock;
        this.codigo_prod = codigo_prod;
        this.precio_prod = precio;
    }

    public Long getId_prod() {
        return id_prod;
    }

    public void setId_prod(Long id_prod) {
        this.id_prod = id_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public Long getFk_marca() {
        return fk_marca;
    }

    public void setFk_marca(Long fk_marca) {
        this.fk_marca = fk_marca;
    }

    public Long getFk_categoria() {
        return fk_categoria;
    }

    public void setFk_categoria(Long fk_categoria) {
        this.fk_categoria = fk_categoria;
    }

    public String getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(String codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public Double getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(Double precio_prod) {
        this.precio_prod = precio_prod;
    }

}
