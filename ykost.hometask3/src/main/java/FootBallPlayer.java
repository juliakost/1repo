public class FootBallPlayer {

    private String name;
    private int age;
    private String position;
    private String currentTeam;

    public FootBallPlayer(String name, int age, String position, String currentTeam) {

        this.name = name;
        this.age = age;
        this.position = position;
        this.currentTeam = currentTeam;

    }

    public void run(double spead) {
        System.out.println("The player " + name + " is running with a spead " + spead);
    }

    public void passBall(int numberOfPasses) {
        System.out.println("The player " + name + " has passed ball for " + numberOfPasses + " times.");
    }

    public void shoot(int numberOfShoots) {
        System.out.println("The player " + name + " has made " + numberOfShoots + " shoots.");
    }

    public void fakeInjury(int numberOfFakeInjuries) {
        System.out.println("The player " + name + " has played " + numberOfFakeInjuries + " fake injuries.");
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String postion) {
        this.position = postion;
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;

    }

}
