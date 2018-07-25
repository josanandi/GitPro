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

    public void greet(String name) {
        System.out.println(name);
    }
}
