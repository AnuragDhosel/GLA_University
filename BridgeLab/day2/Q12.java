package Class_work;

// 12. Write a class User with a final instance variable userId. Initialize it using a constructor.
class User {
    final int userId;
    User(int id) {
        this.userId = id;
    }

    void display() {
        System.out.println("User ID: " + userId);
    }
}

public class Q12 {
    public static void main(String[] args) {
        User u1 = new User(101);
        User u2 = new User(202);

        u1.display();
        u2.display();
    }
}
