package entities;

public class Room {
    //I decided to put final here because my program never sets a holder or email without a constructor.
    private final String holder;
    private final String email;

    public Room(String holder, String email) {
        this.holder = holder;
        this.email = email;
    }

    public String getHolder() {
        return holder;
    }
    public String getEmail() {
        return email;
    }
}
