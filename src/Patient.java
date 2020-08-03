public class Patient {
    private String name;
    private int age;
    private Eye eye_right;
    private Eye eye_left;
    private Organ heart;
    private Organ stomach;

    public Patient(String name, int age, Eye eye_right, Eye eye_left, Organ heart, Organ stomach) {
        this.name = name;
        this.age = age;
        this.eye_right = eye_right;
        this.eye_left = eye_left;
        this.heart = heart;
        this.stomach = stomach;
    }

    public Eye getEye_right() {
        return eye_right;
    }

    public void setEye_right(Eye eye_right) {
        this.eye_right = eye_right;
    }

    public Eye getEye_left() {
        return eye_left;
    }

    public void setEye_left(Eye eye_left) {
        this.eye_left = eye_left;
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

    public Organ getHeart() {
        return heart;
    }

    public void setHeart(Organ heart) {
        this.heart = heart;
    }

    public Organ getStomach() {
        return stomach;
    }

    public void setStomach(Organ stomach) {
        this.stomach = stomach;
    }
}
