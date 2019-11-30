package theater.ch1;

public class Main {
    public static void main(String[] args) {
        var theater = new Theater(100L);
        var audience1 = new Audience(0L);
        var audience2 = new Audience(50L);
        var ticketOffice = new TicketOffice(0L);
        var seller = new TicketSeller();

        theater.setTicketOffices(ticketOffice);
        theater.setTicket(ticketOffice, 10L);
        theater.setInvitation(audience1);

        seller.setTicketOffice(ticketOffice);

        audience1.buyTicket(seller);
        audience2.buyTicket(seller);

        var isOk1 = theater.enter(audience1);
        var isOk2 = theater.enter(audience2);

        System.out.println(isOk1);
        System.out.println(isOk2);
    }
}
