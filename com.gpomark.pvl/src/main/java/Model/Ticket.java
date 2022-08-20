package Model;

public class Ticket {
    private Long id_ticket;
    private Long fk_trans;

    public Ticket(Long id_ticket, Long fk_trans) {
        this.id_ticket = id_ticket;
        this.fk_trans = fk_trans;
    }

    public Long getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(Long id_ticket) {
        this.id_ticket = id_ticket;
    }

    public Long getFk_trans() {
        return fk_trans;
    }

    public void setFk_trans(Long fk_trans) {
        this.fk_trans = fk_trans;
    }
}
