public class SimpleRobot implements Robot{
    private final int canon;
    private final int shield;
    private final int freq;
    private int life;
    private final String name;

    private SimpleRobot(RobotBuilder robotBuilder) {
        this.canon = robotBuilder.canon;
        this.shield = robotBuilder.shield;
        this.freq = robotBuilder.freq;
        this.life = robotBuilder.life;
        this.name = robotBuilder.name;
    }

    @Override
    public int getCanon() {
        return canon;
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public int getFreq() {
        return freq;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int diffLife(int i) {
        return life += i;
    }

    public static class RobotBuilder{
        private int canon = 1;
        private int shield = 1;
        private int freq = 100;
        private int life = 100;
        private final String name;

        public RobotBuilder(String name) {
            this.name = name;
        }

        public RobotBuilder canon(int canon) {
            this.canon = canon;
            return this;
        }

        public RobotBuilder shield(int shield) {
            this.shield = shield;
            return this;
        }

        public RobotBuilder freq(int freq) {
            this.freq = freq;
            return this;
        }

        public RobotBuilder life(int life) {
            this.life = life;
            return this;
        }

        public Robot build(){
            return new SimpleRobot(this);
        }
    }
}
