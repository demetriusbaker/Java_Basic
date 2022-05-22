public final class SimpleImmutableClass {
    private final int id;
    private final String firstName;

    public SimpleImmutableClass(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}
