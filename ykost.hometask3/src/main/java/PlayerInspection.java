public class PlayerInspection {
    public static void main(String[] args) {

        FootBallPlayer sheva = new FootBallPlayer("Andrew", 25, "forward", "Milano");

        sheva.run(5.57);

        sheva.passBall(10);

        sheva.shoot(2);

        sheva.fakeInjury(0);

        System.out.println("Player " + sheva.getName() + " of age " + sheva.getAge() + " on position " + sheva.getPosition() + " is playing in " + sheva.getCurrentTeam() + " team");



    }
}
