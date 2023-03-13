public class Ravenclaw extends hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int  creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name,magicPower,transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public int ability(){
        return smart + wise + witty + creativity;

    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}
