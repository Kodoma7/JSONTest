import java.util.List;

/*

 */
public class User {
    private int ID;
    private String name;
    private int age;
    private List<String> messages;

    public User() {
    }

    public User(int ID, String name, int age, List<String> messages) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.messages = messages;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", messages=" + messages +
                '}';
    }
}
