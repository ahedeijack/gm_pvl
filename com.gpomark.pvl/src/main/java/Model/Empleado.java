package Model;

public class Empleado {
    private Long id_emp;
    private String nombre_emp;
    private String app_emp;
    private String apm_emp;
    private String correo_emp;
    private String contrasena_emp;
    private int tel_emp;

    public Empleado(Long id_emp, String nombre_emp, String app_emp, String apm_emp, String correo_emp, String contrasena_emp, int tel_emp) {
        this.id_emp = id_emp;
        this.nombre_emp = nombre_emp;
        this.app_emp = app_emp;
        this.apm_emp = apm_emp;
        this.correo_emp = correo_emp;
        this.contrasena_emp = contrasena_emp;
        this.tel_emp = tel_emp;
    }

    public Long getId_emp() {
        return id_emp;
    }

    public void setId_emp(Long id_emp) {
        this.id_emp = id_emp;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getApp_emp() {
        return app_emp;
    }

    public void setApp_emp(String app_emp) {
        this.app_emp = app_emp;
    }

    public String getApm_emp() {
        return apm_emp;
    }

    public void setApm_emp(String apm_emp) {
        this.apm_emp = apm_emp;
    }

    public String getCorreo_emp() {
        return correo_emp;
    }

    public void setCorreo_emp(String correo_emp) {
        this.correo_emp = correo_emp;
    }

    public String getContrasena_emp() {
        return contrasena_emp;
    }

    public void setContrasena_emp(String contrasena_emp) {
        this.contrasena_emp = contrasena_emp;
    }

    public int getTel_emp() {
        return tel_emp;
    }

    public void setTel_emp(int tel_emp) {
        this.tel_emp = tel_emp;
    }
}
