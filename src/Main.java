public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Viktar", "Tromza", 37);
        User cloneUser = (User) user.clone();
        System.out.println(user.toString());
        System.out.println(cloneUser.toString());
        System.out.println("Are users equivalent?" + " - " + user.equals(cloneUser));
        System.out.println(user.hashCode() + " " + cloneUser.hashCode());
    }
}
