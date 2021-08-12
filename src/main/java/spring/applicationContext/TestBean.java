package spring.applicationContext;

public class TestBean {
    private String name;

    public TestBean(String name, String surname) {
        this.name = name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
