public class Main {
    public static void main(String[] args) {

        // set up the creatures
        MysticCreature a = new MysticCreature(100, "Galdour", false);
        WaterCreature b = new WaterCreature(100, "Hydrion", false);
        NatureCreature c = new NatureCreature(100, "Foliare", false);

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
                    uc = new WaterCreature(100, name, true);
                    break;

                case 2:
                    uc = new NatureCreature(100, name, true);
                    break;

                case 3:
                    uc = new MysticCreature(100, name, true);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        while(userChoice < 1 || userChoice > 3);

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
