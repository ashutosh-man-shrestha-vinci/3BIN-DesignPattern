public final class RobotFactory {
    private RobotFactory() {}

    public static Robot picVert(String name) {
        // peu d'attaque/défense, mais tire très souvent (freq petite)
        return new SimpleRobot.RobotBuilder(name)
                .canon(2)
                .shield(2)
                .freq(40)
                .life(80)
                .build();
    }

    public static Robot grosseBerta(String name) {
        // très lent, mais fait très mal
        Robot r = new SimpleRobot.RobotBuilder(name)
                .canon(12)
                .shield(2)
                .freq(160)
                .life(100)
                .build();
        return new NewCanonX2(r); // optionnel: gros dégâts
    }

    public static Robot tank(String name) {
        // lent, peu de dégâts, mais très résistant
        Robot r = new SimpleRobot.RobotBuilder(name)
                .canon(3)
                .shield(6)
                .freq(140)
                .life(180)
                .build();
        r = new NewBouclierX2(r);     // encore plus de défense
        r = new PointsDeVie(r);      // reçoit moitié des dégâts
        return r;
    }
}
