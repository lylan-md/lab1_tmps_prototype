public class User implements Cloneable {
    protected final String name;
    protected final String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public Object clone() {
        return new User(this.name, this.password);
    }

    @Override
    public String toString() {
        return super.toString() + " | name: " + this.name;
    }
}
