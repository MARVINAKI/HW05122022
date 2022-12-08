package Human;

public abstract class Human {
    private String name;

    public Human(String name) {
        setName(name);
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if (getName() == null) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'';
    }
}
