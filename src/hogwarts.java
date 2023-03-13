public class hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void compareHogwarts(hogwarts student){
        if (magicPower > student.magicPower) {
            System.out.println(name + " Обладает большей мощностью магии, чем " + student.name);
        } else {
            System.out.println(student.name + " Обладает большей мощностью магии, чем " + name);
        }
        if (transgressionDistance > student.transgressionDistance) {
            System.out.println(name + " Обладает большей мощностью трансгрессии, чем " + student.name);
        } else {
            System.out.println(student.name + " Обладает большей мощностью трансгрессии, чем " + name);
        }
    }


    @Override
    public String toString() {
        return "hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
