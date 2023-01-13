package DreamSequence;
import java.util.Scanner;

public class FullGame
{
    private static int GameBadCounter;
    private static int GameGoodCounter;
    private static int GameFailCounter;
    
    public static void main(String[]args)
    {
        Rooms livRoom = new Rooms();
        Rooms kitch = new Rooms();
        Rooms bdRoom = new Rooms();
        
        System.out.println("You wake up with a pounding headache.\n"
                           + "Slowly, you sit up and open your eyes, observing the room you are in.\n"
                           + "It's your old bedroom. You vaguely remember visiting your parents on break from college.\n");
        
        livRoom.livingRoom();
        
        GameBadCounter += livRoom.getRoomBadCounter();
        GameGoodCounter += livRoom.getRoomGoodCounter();
        GameFailCounter += livRoom.getRoomFailCounter();
        
        kitch.kitchen();
        
        GameBadCounter += kitch.getRoomBadCounter();
        GameGoodCounter += kitch.getRoomGoodCounter();
        GameFailCounter += kitch.getRoomFailCounter();
        
        bdRoom.bedroom();
        
        GameBadCounter += bdRoom.getRoomBadCounter();
        GameGoodCounter += bdRoom.getRoomGoodCounter();
        GameFailCounter += bdRoom.getRoomFailCounter();
        
        if (GameFailCounter > 0)
        {
            System.out.println("\nAfter laying down in bed, your body begins to feel heavier and heavier.\n"
                               + "Finally your headache begins to subside.\n"
                               + "The rhythmic thumping is replaced by the sound of one long continuous beep as you lose consciousness.\n"
                               + "The sound of your mother crying and begging for you to come back is the last thing you hear\n"
                               + "before you are taken by an eternal sleep.");
        }
        else
        {
            if (GameBadCounter > GameGoodCounter)
            {
                System.out.println("\nA steady rhythmic beeping is all you can hear as you finally come to.\n"
                                   + "Cracking open your eyes you are immediately blinded by the bright lights that surround you.\n"
                                   + "You snap your eyes shut. Suddenly a voice exclaims \"Saa! Can you do that again, can you open your eyes?\""
                                   + "\nThe voice is unfamiliar!\n"
                                   + "Quickly you open your eyes again and turn your head, coming face to face with a man in a lab coat, a doctor.\n"
                                   + "\n\"I'm glad to see you awake, you were fading in and out for a while there\"\n"
                                   + "Fading in and out? What happened? Where's your mom? Suddenly it all comes back to you.\n"
                                   + "\nYou had come out to your mother while you were home on break.\n"
                                   + "\n\"Mom, calm down please. I'm still the same person, I'm still your daughter!\"\n"
                                   + "\n\"Don't, just stop, I don't know how to process this... I don't...\"\n"
                                   + "\nYou couldn't handle your mother at the moment, so you ran out to your childhood treehouse.\n"
                                   + "It was old and decrepit and the boards creaked as you climbed up.\n"
                                   + "A few minutes later you heard the sound of boards creaking and you looked outside.\n"
                                   + "Your mother had begun to climb up the old ladder to talk about what had happened.\n"
                                   + "You told her to go away, that the treehouse couldn�t hold the weight of two adults.\n"
                                   + "She moves underneath the treehouse, trying to talk to you.\n"
                                   + "Suddenly with a loud crack the treehouse came crashing down and you went with it, smacking your head on the way down.\n"
                                   + "You... you were in a coma. So what happened to your mother?\n"
                                   + "\n\"Wait doctor, what happened to my mother?\" You watch with worry as his face paled.\n"
                                   + "\n\"When the treehouse fell it landed on top of her. We did everything we could but we couldn�t save her, I�m sorry.\"\n"
                                   + "\nNo NO! You never got to make up with her for the fight, you never got to say goodbye!\n"
                                   + "Your screams of anguish could be heard from across the hospital.\n"
                                   + "A deep sadness sinks in knowing you will never get to repair things with your mother.");
            }
            else
            {
                System.out.println("\nA steady rhythmic beeping is all you can hear as you finally come to.\n"
                                   + "Cracking open your eyes you are immediately blinded by the bright lights that surround you.\n"
                                   + "You snap your eyes shut. Suddenly a voice exclaims \"Saa! Can you do that again, can you open your eyes?\""
                                   + "\nIt's your mother!\n"
                                   + "Quickly you open your eyes again and turn your head, coming face to face with your mother.\n"
                                   + "Tears streaming down her face, she exclaims\n"
                                   + "\n\"I thought I lost you! You were fading in and out for a while there.\"\n"
                                   + "Fading in and out? What happened? Suddenly it all comes back to you.\n"
                                   + "\nYou had come out to your mother while you were home on break.\n"
                                   + "\n\"Mom, calm down please. I'm still the same person, I'm still your daughter!\"\n"
                                   + "\n\"Don't, just stop, I don't know how to process this... I don't...\"\n"
                                   + "\nYou couldn't handle your mother at the moment, so you ran out to your childhood treehouse.\n"
                                   + "It was old and decrepit and the boards creaked as you climbed up.\n"
                                   + "A few minutes later you heard the sound of boards creaking and you looked outside.\n"
                                   + "Your mother had begun to climb up the old ladder to talk about what had happened.\n"
                                   + "You told her to go away, that the treehouse couldn�t hold the weight of two adults.\n"
                                   + "She moves underneath the treehouse, trying to talk to you.\n"
                                   + "Suddenly with a loud crack the treehouse came crashing down and you went with it, smacking your head on the way down.\n"
                                   + "You... you were in a coma.\n"
                                   + "Your mom grabbed your hand, squeezing it tightly.\n"
                                   + "\n\"i don't care if you're gay, you're my baby and it took nearly losing you to make me realize that. I'm so sorry.\"\n"
                                   + "\nYou smiled, knowing things would take time, but they would only get better from here.");
            }
        }
    }
}
