package sirius.database.serialize;

import java.io.Serializable;

public class Person implements Serializable {
    private transient int id;
    private volatile String name;

    public Person(int a) {

    }

    public Person() {
        this(1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
