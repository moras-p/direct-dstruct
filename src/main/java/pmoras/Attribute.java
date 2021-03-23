package pmoras;

public class Attribute implements AttributeInterface {
    private String name, value;

    Attribute(String name) {
        this.name = name;
    }

    Attribute(String name, String value) {
        this(name);
        this.value = value;
    }

    public Attribute setValue(String value) {
        this.value = value;

        return this;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.value;
    }
}
