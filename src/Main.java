public class Main {
    public static void main(String[] args) {

        // set up the creatures
        MysticCreature a = new MysticCreature();
        WaterCreature b = new WaterCreature();
        NatureCreature c = new NatureCreature();
        a.name = "Galdour";
        a.health = 100;
        b.name = "Hydrion";
        b.health = 100;
        c.name = "Foliare";
        c.health = 100;

        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // run the battle
        battleSystem.battle(a, b);
    }
}
