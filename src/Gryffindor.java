public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honor + bravery;
    }

    public void compare(Gryffindor student) {
        var s1 = ability();
        var s2 = student.ability();
        if (s1 > s2) {
            System.out.println(getName() + " лучше " + student.getName());
        } else {
            System.out.println(student.getName() + " лучше " + getName());

            }
        }



    @Override
    public String toString() {
        return "Gryffindor{" +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }


    }

