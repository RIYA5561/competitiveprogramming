public class user {
   // Write a class User with a final instance variable userId. Initialize it using a constructor.
    final int userId;
    public user(int userId) {
        this.userId = userId;
    }
    public void displayUserId() {
        System.out.println("User ID: " + userId);
    }
    public static void main(String[] args) {
        user user1 = new user(101);
        user1.displayUserId();
          }}
