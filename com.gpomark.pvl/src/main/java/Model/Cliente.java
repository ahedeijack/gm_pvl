package Model;

import java.math.BigInteger;

public class Cliente {
    private Long id_cte;
    private String nombre_cte;
    private String app_cte;
    private String apm_cte;
    private BigInteger compras_cte;
    private String correo_cte;

    public Cliente(Long id_cte, String nombre_cte, String app_cte, String apm_cte, BigInteger compras_cte, String correo_cte) {
        this.id_cte = id_cte;
        this.nombre_cte = nombre_cte;
        this.app_cte = app_cte;
        this.apm_cte = apm_cte;
        this.compras_cte = compras_cte;
        this.correo_cte = correo_cte;
    }

    public Long getId_cte() {
        return id_cte;
    }

    public void setId_cte(Long id_cte) {
        this.id_cte = id_cte;
    }

    public String getNombre_cte() {
        return nombre_cte;
    }

    public void setNombre_cte(String nombre_cte) {
        this.nombre_cte = nombre_cte;
    }

    public String getApp_cte() {
        return app_cte;
    }

    public void setApp_cte(String app_cte) {
        this.app_cte = app_cte;
    }

    public String getApm_cte() {
        return apm_cte;
    }

    public void setApm_cte(String apm_cte) {
        this.apm_cte = apm_cte;
    }

    public BigInteger getCompras_cte() {
        return compras_cte;
    }

    public void setCompras_cte(BigInteger compras_cte) {
        this.compras_cte = compras_cte;
    }

    public String getCorreo_cte() {
        return correo_cte;
    }

    public void setCorreo_cte(String correo_cte) {
        this.correo_cte = correo_cte;
    }
}
