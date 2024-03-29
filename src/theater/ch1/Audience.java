package theater.ch1;

public class Audience {
    private Ticket ticket = Ticket.EMPTY;
    private Invitation invitation = Invitation.EMPTY;
    private Long amount;

    public Audience(Long amount) {
        this.amount = amount;
    }

    public void buyTicket(TicketSeller seller) {
        this.ticket = seller.getTicket(this);
    }

    public boolean hasAmount(Long amount) {
        return this.amount >= amount;
    }

    public boolean minusAmount(Long amount) {
        if (amount > this.amount) {
            return false;
        }
        this.amount -= amount;
        return true;
    }

    public Invitation getInvitation() {
        return this.invitation;
    }

    public void removeInvitation() {
        invitation = Invitation.EMPTY;
    }

    public Ticket getTicket() {
        return this.ticket;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }
}
