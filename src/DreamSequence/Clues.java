package DreamSequence;
import java.util.Scanner;

public class Clues
{
    private Scanner keyboard;
    private int badCounter = 0;
    private int goodCounter = 0;
    private int failCounter = 0;
    
    public Clues()
    {
        
    }
    
    /**
     * Music box.
     */
    public void musicBox()
    {
        String musicResponse;
        
        keyboard = new Scanner(System.in);
        System.out.print("You pick up the music box from the coffee table.\n"
            + "Would you like to wind it up? Enter (y/n) for yes or no \n");
        musicResponse = keyboard.nextLine();
        while (!musicResponse.toLowerCase().equals("y") && !musicResponse.toLowerCase().equals("n"))
        {
            System.out.println("Input y or n");
            musicResponse = keyboard.nextLine();
        }
        if (musicResponse.toLowerCase().equals("y"))
        {
            System.out.println("You listen to the melodic tune coming from the music box.\n"
                              + "You suddenly remember your mother as the music softly plays in the background."
                              + "That's right, your mother gave you this music box.\n"
                              + "It was a gift for when you started ballet. What a lovely memory.");
            goodCounter++;
        }
        else 
        {
            System.out.println("You're not in the mood for music at the moment. You set the box down");
            failCounter++;
        }
    }
/**
     * Postcard.
     */
    public void postcard()
    {
        String postCardResponse1; 
        String postCardResponse2;
        String correct1 = "daughter";
        String correct2 = "bahamas";
        
        keyboard = new Scanner(System.in);
        System.out.print("You decide to approach the kitchen island and look at the postcard.\n"
            + "would you like to read the postcard? Enter (y/n) for yes or no \n");
        postCardResponse1 = keyboard.nextLine();
        while (!postCardResponse1.toLowerCase().equals("y") && 
               !postCardResponse1.toLowerCase().equals("n"))
        {
            System.out.println("Input y or n");
            postCardResponse1 = keyboard.nextLine();
        }
        if (postCardResponse1.toLowerCase().equals("y"))
        {
            System.out.println("You read out what the postcard says:\n"
                            + "\n\"My Dearest Saa,\nI hope you're doing well in college. " +
                            "You have no idea how much I miss you.\nI know it's only been a couple"
                            + " of semesters, but you're my only DHTGREAU, how could I not?\"");
            System.out.println("\nIt seems the word DHATGREU is scrambled. Unscramble it to continue reading the postcard");
            postCardResponse1 = keyboard.nextLine();
            if (postCardResponse1.toLowerCase().equals(correct1))
            {
                System.out.println("\nDaughter... this postcard is from your mother. You continue to read it:");
                System.out.println("\n\"Anyways, I just wanted to send this to tell you I'm on vacation in the SMAHABA.\n"
                                   + "Do you remember when we went to this beautiful place 8 years ago?\n"
                                   + "You were so small back then.\"");
                System.out.println("\nIt seems that the word SMAHABA is scrambled. Unscramble it to continue reading the postcard");
                postCardResponse2 = keyboard.nextLine();
                
                if (postCardResponse2.toLowerCase().equals(correct2))
                {
                    System.out.println("\n\"Sorry I'm getting a little teary now.\n"
                                      + "I want you to know that I love you so much OK?\n"
                                      + "No matter what, just remember that I will always love you\"");
                    System.out.println("\nYou feel a few tears fall down your face.\n"
                                      + "You miss your mother just as much as she misses you\n"
                                      + "You wonder where she is right now");
                    goodCounter++;
                }
                else
                {
                    System.out.println("You can't seem to unscramble the word.\n"
                        + "You tear the postcard in half with frustration.");
                    failCounter++;
                }
            }
            else
            {
                System.out.println("You can't seem to unscramble the word.\n"
                                    + "You tear the postcard in half with frustration.");
                failCounter++;
            }
        }
        else
        {
            System.out.println("You aren't interested in reading the postcard. You discard it");
            failCounter++;
        }
    }
    
    public void diary()
    {
        String diaryResponse;
        keyboard = new Scanner(System.in);
        System.out.println("You pick up the diary and stare at the cover. Would you like to read it. Enter (y/n) for yes or no. ");
        diaryResponse = keyboard.nextLine();
        
        while (!diaryResponse.toLowerCase().equals("y") && !diaryResponse.toLowerCase().equals("n"))
        {
            System.out.println("Input y or n");
            diaryResponse = keyboard.nextLine();
        }
        
        if (diaryResponse.toLowerCase().equals("y"))
        {
            System.out.println("You open the diary and read an entry:\n"
                              + "\n 1/12/2020\n"
                              + "\n\"I went out with someone today. Her name is Korra, and she's absolutely gorgeous.\n"
                              + "She smiles as bright as the sun and is the kindest person I've ever met.\n"
                              + "She's a bit of dummy sometimes, but she more than makes up for it with her personality.\n"
                              + "I want to tell mom about her, but I haven't told her about me yet. I should do that soon."
                              + "I would love from mom to meet ______ she's such a wonderful person.\"\n");
            System.out.println("One of the words is smeared from the diary entry. You need to fill in the blank to comprehend the entry.\n"
                               + "Which one of these words fit the blank?");
            System.out.println("A. Kassandra \nB. Korra \nC. Kennedy \nD. Karen");
            diaryResponse = keyboard.nextLine();
            while (!diaryResponse.toLowerCase().equals("a") && !diaryResponse.toLowerCase().equals("b") && 
                   !diaryResponse.toLowerCase().equals("c") && !diaryResponse.toLowerCase().equals("d"))
            {
                System.out.println("Input a, b, c, or d");
                diaryResponse = keyboard.nextLine();
            }
            if (diaryResponse.toLowerCase().equals("a"))
            {
                System.out.println("That doesn't seem to be quite right. You toss the diary aside.");
                failCounter++;
            }
            else if (diaryResponse.toLowerCase().equals("b"))
            {
                System.out.println("Korra... you're girlfriend. You remember going back home for break, and you wanted to tell your mom about Korra.\n"
                                   + "However, you feel this sense of sadness and anger. You wonder why you feel this way.");
                badCounter++;
            }
            else if (diaryResponse.toLowerCase().equals("c"))
            {
                System.out.println("That doesn't seem to be quite right. You toss the diary aside.");
                failCounter++;
            }
            else if (diaryResponse.toLowerCase().equals("d"))
            {
                System.out.println("That doesn't seem to be quite right. You toss the diary aside.");
                failCounter++;
            }
        }
        else 
        {
          System.out.println("You're not interested in reading right now. You toss the diary aside.");
            failCounter++;
        }
    }

    
    public void prideFlag()
    {
        String prideResponse;
        System.out.println("You pick up the pride flag. It's so colorful and beautiful\n"
                           + "The edges appear torn, as though it was ripped off the wall.");
        
        System.out.println("Would you like to hang the flag up? " +
                           "Enter (y/n) for yes or no");
        keyboard = new Scanner(System.in);
        prideResponse = keyboard.nextLine();
        
        while (!prideResponse.toLowerCase().equals("y") && 
               !prideResponse.toLowerCase().equals("n"))
        {
            System.out.println("Please enter y or n");
            prideResponse = keyboard.nextLine();
        }
        
        if (prideResponse.toLowerCase().equals("y"))
        {
            System.out.println("You hang up the pride flag. You feel a sense of pride seeing it there.\n"
                               + "You suddenly remember a memory. A girl with long hair and a smile as bright as the sun.\n"
                               + "She's the one who made you realize your attraction to women. There's no shame in that.\n"
                               + "You're proud to have come this far. But then, why do you feel this sense of sadness and rejection?");
            badCounter++;
        }
        else if (prideResponse.toLowerCase().equals("n"))
        {
            System.out.println("The pride flag is worn out. You leave it alone. You'll buy a newer flag.");
            failCounter++;
        }
    }
    
    public void stuffedAnimal()
    {
        String animalResponse;
        String animalChoice;
        
        System.out.println("You approach the stuffed animal on the bed.");
        System.out.println("Would you like to hold the stuffed animal? " +
                           "Enter (y/n) for yes or no");
        Scanner keyboard = new Scanner(System.in);
        animalResponse = keyboard.nextLine();
        
        while (!animalResponse.toLowerCase().equals("y") && 
               !animalResponse.toLowerCase().equals("n"))
        {
            System.out.println("You did not answer the question, please answer y or n");
            animalResponse = keyboard.nextLine();
        }
        
        if (animalResponse.toLowerCase().equals("y"))
        {
            System.out.println("You pick up the stuffed animal. It is worn out but still recognizable\n"
                               + "It has four stubby legs and a big jaw full of dull teeth.\n"
                               + "A natural water predator local to Africa \n"
                               + "You also vaguely remember a movie with the lines:\n"
                               + "\n\"Motto Motto likes you!\" followed by the song lyrics:\n"
                               + "\n\"I like em big! I like em chunky.\"");
            System.out.println("What kind of animal was it again?");
            System.out.println("Please select a letter:\nA. Lion\nB. Dog\nC. Eagle\nD. Hippo\n"
                               + "E. Giraffe\nF. Panda\nG. Alligator\nH. Bunny\nI. Iguana\nJ. Zebra");
            
            keyboard = new Scanner(System.in);
            animalChoice = keyboard.nextLine();
            
            while (!animalChoice.toLowerCase().equals("a") && 
                   !animalChoice.toLowerCase().equals("b") &&
                   !animalChoice.toLowerCase().equals("c") &&
                   !animalChoice.toLowerCase().equals("d") &&
                   !animalChoice.toLowerCase().equals("e") &&
                   !animalChoice.toLowerCase().equals("f") &&
                   !animalChoice.toLowerCase().equals("g") &&
                   !animalChoice.toLowerCase().equals("h") &&
                   !animalChoice.toLowerCase().equals("i") &&
                   !animalChoice.toLowerCase().equals("j"))
            {
                System.out.println("Please enter (a, b, c, d, e, f, g, h, i, or j): what kind of animal is this?");
                System.out.println("Please select a letter:\nA. Lion\nB. Dog\nC. Eagle\nD. Hippo\n"
                                   + "E. Giraffe\nF. Panda\nG. Alligator\nH. Bunny\nI. Iguana\nJ. Zebra");
                animalChoice = keyboard.nextLine();
            }
            switch (animalChoice.toLowerCase())
            {
                case "a":
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
                    break;
                case "b":
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
                    break;
                case "c":
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
                    break;
                case "d":
                    System.out.println("That's right. Gloria the Hippo. Your mother gave you Gloria because you had trouble sleeping alone at nights.\n"
                                       + "You miss your mother a lot. She's done so much for you and you want to see her again.");
                    break;
                case "e":
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
                    break;
                case "f":
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
                    break;
                case "g":
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
                    break;
                case "h":
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
                    break;
                case "i":
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
                    break;
                case "j":
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
                    break;
                default: 
                    System.out.println("That doesn't seem to be quite right. You put the stuffed animal down in confusion");
            }
            
            goodCounter++;
        }
        else if (animalResponse.toLowerCase().equals("n"))
        {
            System.out.println("you said no");
            failCounter++;
        }
    }
    
    public void plant()
    {
        String plantResponse;
        String water;
        String shade;
        
        System.out.println("You approach the droopy looking plant, it might need some water. "
            + "The name tag reads <Ghost Fern>");
        System.out.println("The plant looks thirsty, would you like to water it? Enter (y/n) for yes or no");
        keyboard = new Scanner(System.in);
        plantResponse = keyboard.nextLine();
        
        while (!plantResponse.toLowerCase().equals("y") && 
               !plantResponse.toLowerCase().equals("n"))
        {
            System.out.println("You did not answer the question, please answer y or n");
            plantResponse = keyboard.nextLine();
        }
        
        if (plantResponse.toLowerCase().equals("y"))
        {
            System.out.println("Would you like to water it a lot or a little?\nA. a lot\nB. a little");
            water = keyboard.nextLine();
            
            while(!water.toLowerCase().equals("a") &&
                  !water.toLowerCase().equals("b"))
            {
                System.out.println("Please enter (a/b) to choose a course of action");
                water = keyboard.nextLine();
            }
            
            if (water.toLowerCase().equals("a"))
            {
                System.out.println("You watered the plant a lot. It looks much happier.");
                System.out.println("You notice the plant lies in the shade.\nDo you move it closer to the "
                                   + "sunlight or leave it in the shade?");
                System.out.println("A. Move it towards the sunlight\nB. Leave it in the shade");
                shade = keyboard.nextLine();
                
                while(!shade.toLowerCase().equals("a") &&
                      !shade.toLowerCase().equals("b"))
                {
                    System.out.println("Please enter (a/b) to choose a course of action");
                    shade = keyboard.nextLine();
                }
                
                if (shade.toLowerCase().equals("a"))
                {
                    System.out.println("You move the plant closer to the sunlight.\n"
                                       + "You witness the plant shrivel ever so slightly.\n"
                                       + "Maybe that wasn't a good idea");
                    failCounter++;
                }
                else if (shade.toLowerCase().equals("b"))
                {
                    System.out.print("You leave the plant in the shade.\nIt "
                                    + "is looking much better than when you first saw it\n"
                                    + "Looking at the plant brings a fuzzy memory into your head.\n"
                                    + "You were arguing with your mother about something. It was a really bad fight\n"
                                    + "So you climbed the big tree and into an old treehouse in your backyard to escape her.\n"
                                    + "The memory angers you as you have the sudden urge to smash the plant.");
                    badCounter++;
                }
            }
            else if (water.toLowerCase().equals("b"))
            {
                System.out.println("You watered the plant a little. You notice it wilt ever so slighly.");
                failCounter++;
            }
        }
        else if (plantResponse.toLowerCase().equals("n"))
        {
            System.out.println("Gardening isn't your thing.\n"
                               + "You leave it alone and watch it shrivel ever so slightly.");
            failCounter++;
        }
    }
    
    public int getFailCounter()
    {
        return failCounter;
    }
    
    public int getGoodCounter()
    {
        return goodCounter;
    }
    
    public int getBadCounter()
    {
        return badCounter;
    }
    
}
