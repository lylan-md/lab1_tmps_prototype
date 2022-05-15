public class Main {
    public static void main(String[] args) {
        User user = new User("l.breahna", "testpassword");
        System.out.println(user);
        User clonedLinuxUser = (User) user.clone();
        System.out.println(clonedLinuxUser);
    }
}
