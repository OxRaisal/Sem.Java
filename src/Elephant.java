public class Elephant {
    public String name;
    public String birthday;

    public Elephant(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void feed() {
        System.out.printf("Слон %s покормлен", name);
    }

    public static int getHobotCount(){
        return 1;
    }
}
