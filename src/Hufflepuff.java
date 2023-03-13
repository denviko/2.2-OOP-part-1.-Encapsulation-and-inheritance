public class Hufflepuff extends hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name,magicPower,transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    public int ability() {
        return hardworking + loyal + honest;

    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
