package theater.ch1;

public class Ticket {
    public static final Ticket EMPTY = new Ticket(null);
    private final Theater theater;
    private boolean isEntered = false;

    public Ticket(Theater theater) {
        this.theater = theater;
    }

    public boolean isValid(Theater theater) {
        if (isEntered || theater != this.theater || this == EMPTY) {
            return false;
        }
        isEntered = true;
        return true;
    }

    public Long getFee() {
        return theater.getFee();
    }
}
