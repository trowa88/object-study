package theater.ch1;

public class Invitation {
    public static final Invitation EMPTY = new Invitation(null);
    private final Theater theater;

    public Invitation(Theater theater) {
        this.theater = theater;
    }
}
