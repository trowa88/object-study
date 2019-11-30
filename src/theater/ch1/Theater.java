package theater.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Theater {
    private final List<TicketOffice> ticketOffices = new ArrayList<>();
    private final Long fee;

    public Theater(Long fee) {
        this.fee = fee;
    }

    Long getFee() {
        return this.fee;
    }

    public void setTicketOffices(TicketOffice... ticketOffices) {
        this.ticketOffices.addAll(Arrays.asList(ticketOffices));
    }

    public void setTicket(TicketOffice ticketOffice, Long num) {
        if (!ticketOffices.contains(ticketOffice)) {
            return;
        }
        while (num-- > 0) {
            ticketOffice.addTicket(new Ticket(this));
        }
    }

    public void setInvitation(Audience audience) {
        audience.setInvitation(new Invitation(this));
    }

    public boolean enter(Audience audience) {
        return audience.getTicket().isValid(this);
    }
}
