# Madlibs
# Made the split story and user input for Adjective1.
//split story for adjective
    int startAdjective1 = story.indexof("<");
    int endAdjective1 = story.indexOf(">");
    String part1 = story.substring(0, startAdjective1);
    String part2 = story.substring(endAdjective1 + 1);
// user input adjective1
    System.out.print("Enter an adjective: ");
    String adjective1 = scanner.nextLine();
    story = part1 + adjective1 + part2;

<img width="767" height="317" alt="image" src="https://github.com/user-attachments/assets/18a64ef7-60b8-4f1b-9753-2e0e998a6ee1" />
