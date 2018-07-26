public class Me {
    private String name;

    public Me() {
    }

    public Me(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void greetModified(String parameter) {
        System.out.println("Greetings for the " + parameter);}

    public void greet(String name, String otherName) {
        System.out.println(name + " " + otherName);
    }
}
