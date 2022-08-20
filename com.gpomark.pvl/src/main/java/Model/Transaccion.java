package Model;

public class Transaccion {
    private Long id_trans;
    private Double total_trans;
    private Long fk_cte;
    private Long fk_emp;

    public Transaccion(Long id_trans, Double total_trans, Long fk_cte, Long fk_emp) {
        this.id_trans = id_trans;
        this.total_trans = total_trans;
        this.fk_cte = fk_cte;
        this.fk_emp = fk_emp;
    }

    public Long getId_trans() {
        return id_trans;
    }

    public void setId_trans(Long id_trans) {
        this.id_trans = id_trans;
    }

    public Double getTotal_trans() {
        return total_trans;
    }

    public void setTotal_trans(Double total_trans) {
        this.total_trans = total_trans;
    }

    public Long getFk_cte() {
        return fk_cte;
    }

    public void setFk_cte(Long fk_cte) {
        this.fk_cte = fk_cte;
    }

    public Long getFk_emp() {
        return fk_emp;
    }

    public void setFk_emp(Long fk_emp) {
        this.fk_emp = fk_emp;
    }
}
