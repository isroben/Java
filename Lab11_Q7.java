// Generic Superclass
class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// Generic Subclass inheriting from Box<T>
class NamedBox<T, U> extends Box<T> {
    private U label;

    public NamedBox(T item, U label) {
        super(item);
        this.label = label;
    }

    public void display() {
        System.out.println("Item: " + getItem() + " | Label: " + label);
    }
}

public class Lab11_Q7 {
    public static void main(String[] args) {
        NamedBox<Integer, String> box = new NamedBox<>(1001, "Product Code");
        box.display();
    }
}