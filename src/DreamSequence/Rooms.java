package DreamSequence;
import java.util.Scanner;
public class Rooms
{
    private Scanner keyboard;
    private int roomBadCounter;
    private int roomGoodCounter;
    private int roomFailCounter;
    
    public Rooms()
    {
        
    }
    
    public void livingRoom()
    {
        String boxOrPlant;
        Clues livRoom = new Clues();
        
        System.out.println("You get up and make your way into the living room. Nobody is home but you it seems.\n"
                           + "The room seems a little off, some things in the room feel out of place.\n"
                           + "On the coffee table sits an old and familiar music box, by the window sits a drooping plant.\n"
                           + "You don't remember either of these things belonging where they are.\n"
                           + "Which do you choose to investigate? (Enter music box or plant)");
        
        keyboard = new Scanner(System.in);
        boxOrPlant = keyboard.nextLine();
        
        while (!boxOrPlant.toLowerCase().equals("music box") &&
               !boxOrPlant.toLowerCase().equals("plant"))
        {
            System.out.println("Please input (music box / plant)");
            boxOrPlant = keyboard.nextLine();
        }
        
        if (boxOrPlant.toLowerCase().equals("music box"))
        {
            livRoom.musicBox();
        }
        else
        {
            livRoom.plant();
        }
        
        roomBadCounter += livRoom.getBadCounter();
        roomGoodCounter += livRoom.getGoodCounter();
        roomFailCounter += livRoom.getFailCounter();
    }
    
    public void kitchen()
    {
        String diaryOrPostCard;
        Clues kitch = new Clues();
        
        System.out.println("\nConfused and a little nervous, you move further into the house.\n"
                           + "You enter the kitchen, nobody�s here either. Strange.\n"
                           + "You notice there�s two things out of place again, just like in the living room.\n"
                           + "They both call out to you to investigate. On the kitchen island sits a postcard, on the window sits a diary.\n"
                           + "Which item do you choose to investigate? (Enter diary or postcard)");
        
        keyboard = new Scanner(System.in);
        diaryOrPostCard = keyboard.nextLine();
        
        while (!diaryOrPostCard.toLowerCase().equals("diary") &&
               !diaryOrPostCard.toLowerCase().equals("postcard"))
        {
            System.out.println("Please input (diary / postcard)");
            diaryOrPostCard = keyboard.nextLine();
        }
        
        if (diaryOrPostCard.toLowerCase().equals("diary"))
        {
            kitch.diary();
        }
        else
        {
            kitch.postcard();
        } 
        
        roomBadCounter += kitch.getBadCounter();
        roomGoodCounter += kitch.getGoodCounter();
        roomFailCounter += kitch.getFailCounter();
    }
    
    public void bedroom()
    {
        String animalOrFlag;
        Clues bed = new Clues();
        
        System.out.println("\nFeeling tired you move back into the bedroom, ready to sleep off your pounding headache.\n"
                           + "Before you can make your way to the bed two more items stand out to you, unlike before these\n"
                           + "belong here but the sight of them causes unexplained emotions to bubble within you.\n"
                           + "On the desk sits a pride flag, on the bed sits an old stuffed animal.\n"
                           + "Which do you choose to investigate? (Enter stuffed animal or pride flag)");
        
        keyboard = new Scanner(System.in);
        animalOrFlag = keyboard.nextLine();
        
        while (!animalOrFlag.toLowerCase().equals("stuffed animal") &&
               !animalOrFlag.toLowerCase().equals("pride flag"))
        {
            System.out.println("Please input (stuffed animal / pride flag)");
            animalOrFlag = keyboard.nextLine();
        }
        
        if (animalOrFlag.toLowerCase().equals("stuffed animal"))
        {
            bed.stuffedAnimal();
        }
        else
        {
            bed.prideFlag();
        } 
        
        roomBadCounter += bed.getBadCounter();
        roomGoodCounter += bed.getGoodCounter();
        roomFailCounter += bed.getFailCounter();
    }
    
    public int getRoomBadCounter()
    {
        return roomBadCounter;
    }
    
    public int getRoomGoodCounter()
    {
        return roomGoodCounter;
    }
    
    public int getRoomFailCounter()
    {
        return roomFailCounter;
    }
    
}

