public class NatureCreature extends Creature{

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
            action = name + " threw sticks and stones with power " + power + "!";
            return power;
        }
        else if(choice < 75){

            float power = Rand.randomFloat(15,25);
            action = name + " launched boulder with power " + power + "!";
            return power;
        }
        else if(choice < 90){

            float power = Rand.randomFloat(20,30);
            action = name + " summoned earthquake with power " + power + "!";
            return power;
        }
        else{

            float power = Rand.randomFloat(30,40);
            action = name + " summoned landslide with power " + power + "!";
            return power;
        }
    }

    @Override
    public void defend(float incomingPower){

        if (Rand.randomInt(0, 10) < 1) {

            int choice = Rand.randomInt(0, 10);

            if(choice < 9){

                incomingPower = incomingPower * 0.8f;
                action = name + " hit behind dirt pile and reduced damage taken to " + incomingPower;
            }
            else{

                incomingPower = incomingPower * 0.3f;
                action = name + " hid behind giant sequoia and reduced damage taken to " + incomingPower;
            }

        }
        else
        {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
