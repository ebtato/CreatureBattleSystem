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

        Creature uc = null;

        String name = Input.getUserString("Enter your name: ");

        int userChoice;
        do{

            System.out.println("1. Water Type\n2. Nature Type\n3. Mystic Type\n");
            userChoice = Input.getUserInt("Which creature would you like to be? ");
            //clear buffer
            Input.scn.nextLine();

            switch(userChoice){

                case 1:
                    uc = new WaterCreature();
                    break;

                case 2:
                    uc = new NatureCreature();
                    break;

                case 3:
                    uc = new MysticCreature();
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        while(userChoice < 1 || userChoice > 3);

        uc.name = name;
        uc.health = 100;
        uc.isUser = true;

        int choice = Rand.randomInt(0,3);
        switch(choice){

            case 0:
                battleSystem.battle(a, uc);
            break;

            case 1:
                battleSystem.battle(b, uc);
            break;

            case 2:
                battleSystem.battle(c, uc);
            break;
        }
    }
}
