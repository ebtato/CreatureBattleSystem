public class WaterCreature extends Creature{

    @Override
    public float attack(){

        int choice;

        if(!isUser) {

            choice = Rand.randomInt(0, 100);
        }
        else{

            Input.getUserString("Press enter to attack.");
            choice = Rand.randomInt(0,100);
        }

        if(Rand.randomInt(0,10)<2){

            action = name + " missed!";
            return 0;
        }

        if(choice < 50){

            float power = Rand.randomFloat(10,20);
            action = name + " used soak with power " + power + "!";
            return power;
        }
        else if(choice < 75){

            float power = Rand.randomFloat(15,25);
            action = name + " used flash flood with power " + power + "!";
            return power;
        }
        else if(choice < 90){

            float power = Rand.randomFloat(20,30);
            action = name + " summoned monsoon with power " + power + "!";
            return power;
        }
        else{

            float power = Rand.randomFloat(30,40);
            action = name + " summoned tsunami with power " + power + "!";
            return power;
        }
    }

    @Override
    public void defend(float incomingPower){

        if (Rand.randomInt(0, 10) < 1) {

            int choice = Rand.randomInt(0, 10);

            if(choice < 9){

                incomingPower = incomingPower * 0.8f;
                action = name + " used ice sheet and reduced damage taken to " + incomingPower;
            }
            else{

                incomingPower = incomingPower * 0.3f;
                action = name + " used iceberg and reduced damage taken to " + incomingPower;
            }

        }
        else
        {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
