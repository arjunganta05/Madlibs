import java.util.Scanner;
public class Madlibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String story = "Without warning, a wild <noun> burst into the <adjective1> computer lab and started to <verb> directly toward the server. The manager dropped a tray of <pluralNoun> into the <place> causing <adjective2> laughter!";
        
        System.out.println("Welcome to Mad Libs!");
        System.out.println("Please provide words to complete the story.\n");
        System.out.println(story);
        // Split the story around noun
        int startNoun = story.indexOf("<");
        int endNoun = story.indexOf(">");
        String part1 = story.substring(0, startNoun);
        String part2 = story.substring(endNoun + 1);
        // Enter the noun
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();
        story = part1 + noun + part2;

        //split story for adjective
        int startAdjective1 = story.indexOf("<");
        int endAdjective1 = story.indexOf(">");
        String part3= story.substring(0, startAdjective1);
        String part4= story.substring(endAdjective1 + 1);
        // user input adjective1
        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();
        story = part3+ adjective1 + part4;

        //split story for verb
        int startVerb = story.indexOf("<");
        int endVerb = story.indexOf(">");
        String part5=story.substring(0, startVerb);
         String part6= story.substring(endVerb + 1);
        // user input verb1
        System.out.print("Enter a verb: ");
        String Verb = scanner.nextLine();
        story = part5 + Verb + part6;

         //split story for plural noun
        int startPluralNoun = story.indexOf("<");
        int endPluralNoun = story.indexOf(">");
        String part7 = story.substring(0, startPluralNoun);
        String part8 = story.substring(endPluralNoun + 1);

        // user input plural noun
        System.out.print("Enter a plural noun: ");
        String pluralNoun = scanner.nextLine();
        story = part7 + pluralNoun + part8;

        //split story for place
        int startPlace = story.indexOf("<");
        int endPlace = story.indexOf(">");
        String part9 = story.substring(0, startPlace);
        String part10= story.substring(endPlace + 1);

        // user input of place
        System.out.print("Enter a place: ");
        String place = scanner.nextLine();
        story = part9 + place + part10;

        //split story for second adjective
        int startAdjective2 = story.indexOf("<");
        int endAdjective2 = story.indexOf(">");
        String part11 = story.substring(0, startAdjective2);
        String part12 = story.substring(endAdjective2 + 1);

        // user input of second adjective
        System.out.print("Enter a second adjective: ");
        String adjective2 = scanner.nextLine();
        story = part11 + adjective2 + part12;
        //print final story
        System.out.println("Heres your story: ");
        System.out.print(story);
    }
}
