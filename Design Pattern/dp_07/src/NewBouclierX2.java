public class NewBouclierX2 implements Robot{
    private final Robot robot;

    public NewBouclierX2(Robot robot){
        this.robot = robot;
    }
    @Override
    public int getCanon() {
        return robot.getCanon();
    }

    @Override
    public int getShield() {
        return robot.getShield()*2;
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
