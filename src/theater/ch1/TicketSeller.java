package theater.ch1;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public void setTicketOffice(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public Ticket getTicket(Audience audience) {
        var ticket = Ticket.EMPTY;
        if (audience.getInvitation() != Invitation.EMPTY) {
            ticket = ticketOffice.getTicketWithNoFee();
            if (ticket != Ticket.EMPTY) {
                audience.removeInvitation();
            }
        } else if (audience.hasAmount(ticketOffice.getTicketPrice())) {
            ticket = ticketOffice.getTicketWithFee();
            if (ticket != Ticket.EMPTY) {
                audience.minusAmount(ticketOffice.getTicketPrice());
            }
        }
        return ticket;
    }
}
