public class NewCanonX2 implements Robot{
    private final Robot  robot;
    public NewCanonX2(Robot robot) {
       this.robot = robot;
    }

    @Override
    public int getCanon() {
        return  robot.getCanon()*2;
    }

    @Override
    public int getShield() {
        return robot.getShield();
    }

    @Override
    public int getFreq() {
        return robot.getFreq();
    }

    @Override
    public String getName() {
        return robot.getName();
    }

    @Override
    public int diffLife(int i) {
        return robot.diffLife(i);
    }
}
