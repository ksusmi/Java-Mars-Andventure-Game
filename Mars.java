import java.util.Scanner;

public class Mars {
    public static void main(String[] args) {
    System.out.println("The game is about to start...");
    System.out.println("Booting up...");
    System.out.println("...");
    System.out.println("...");
    System.out.println("...");
    System.out.println("Ready");

    Scanner input = new Scanner(System.in);
    System.out.println("Hi there. What's your name?");

    String name = input.nextLine();
    System.out.println("Hi, " + name + " --- Welcome to The Mars Adventure Game.");
    System.out.println("Yesterday, you received a call from your good friend at NASA.");
    System.out.println("They need someone to go to Mars this weekend, and you've been chosen.");
    
    System.out.println("Are you excited? Type Y or N");
    String response = input.nextLine();
    if (response.equals("Y") || response.equals("y")){
    System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
    System.out.println("It's time to pack for your trip to Mars.");
    System.out.println("How many suitcases do you plan to bring?");
    int suitcases = input.nextInt(); // only process whereever you are grab just next integer but not new line
    input.nextLine(); // because of the above nextInt we need this line

    if (suitcases > 2 ){
        System.out.println("That's way too many. You'll have to pack more lightly");
        System.out.println("Please try to fit your stuff into 2 suitcases and come back.");
        //break;

    } else if (suitcases < 2){
        System.out.println("You're great at packing! Please teach me how to do the same.Though You are allowed to get 2 suitcases ");
    }
    else if (suitcases == 2)
    {
        System.out.println("That's perfect!");
       
    System.out.println("You're allowed to bring one companion animal with you.");
    System.out.println("What kind of companion animal would you like to bring?");
    String companion = input.nextLine();
    
    System.out.println("What is your companion's name?");
    String companionName = input.nextLine();

    System.out.println("Cool, so you're bringing Buster the frog");
    System.out.println("NASA has a interior design team offering to outfit your space ship.");
    System.out.println("You have a couple of options for the interior decor of your ship.");

    System.out.println("Your options are:");
    System.out.println("  A  Sleek, modern minimalism");
    System.out.println("  B  Retro/vintage space age");
    System.out.println(" C  SF Hippie chic");
    System.out.println(" Which decor would you like? Choose A, B, or C.");
    String decor = input.nextLine();

    //OR this below 6 lines of code replacing the above statement
//     char decor = input.next().charAt(0); //next() string of length 1 and charAt(0) - grabs the first character
//     input.nextLine(); // since char takes the character in line and does not go to the next line so we need this line to go to nextline
//     if(decor == 'A'){
//         System.out.println("############### Selected Char A #################");
//     }
//     System.out.println("Enter name?");
//     String componionName = input.nextLine();
// }}


    if (decor.equals("A") || decor.equals("a")){
        System.out.println("I can see it now:");
        System.out.println(name + " and " + companionName + " surfing the celestial abyss...");
        System.out.println("in a modern minimalism."); 
       }

       if (decor.equals("B") || decor.equals("b")){
        System.out.println("I can see it now:");
        System.out.println(name + " and " + companionName + " surfing the celestial abyss...");
        System.out.println("in a Retro/vintage space age."); 
       }

       if (decor.equals("C") || decor.equals("c")){
        System.out.println("I can see it now:");
        System.out.println(name + " and " + companionName + " surfing the celestial abyss...");
        System.out.println("in a SF Hippie chic."); 
       } 
    System.out.println(name + " -- the day is here!");
    System.out.println("You can crawl into the spaceship with " + companionName);
    System.out.println("Brace for take off!");
    System.out.println("5...");
    System.out.println("4...");
    System.out.println("3...");
    System.out.println("2...");
    System.out.println("1...");
    System.out.println("*LIFTOFF*");
    System.out.println("GAME OVER");
}
    }

 else{
    System.out.println("Sorry You'll continue next time. Hope you change your response and join the trip");
}
}
}
