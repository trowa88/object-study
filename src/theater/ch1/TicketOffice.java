package theater.ch1;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount) {
        this.amount = amount;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public Ticket getTicketWithFee() {
        if (tickets.size() == 0) {
            return Ticket.EMPTY;
        }
        var ticket = tickets.remove(0);
        amount += ticket.getFee();
        return ticket;
    }

    public Ticket getTicketWithNoFee() {
        if (tickets.size() == 0) {
            return Ticket.EMPTY;
        }
        return tickets.remove(0);
    }

    public Long getTicketPrice() {
        if (tickets.size() == 0) {
            return 0L;
        }
        return tickets.get(0).getFee();
    }
}
