import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String sonnet = "Shall I compare thee to a summer's day?\n" +
                "Thou art more lovely and more temperate:\n" +
                "Rough winds do shake the darling buds of May,\n" +
                "And summer's lease hath all too short a date;\n" +
                "Sometime too hot the eye of heaven shines,\n" +
                "And often is his gold complexion dimm'd;\n" +
                "And every fair from fair sometime declines,\n" +
                "By chance or nature's changing course untrimm'd;\n" +
                "But thy eternal summer shall not fade,\n" +
                "Nor lose possession of that fair thou ow'st;\n" +
                "Nor shall death brag thou wander'st in his shade,\n" +
                "When in eternal lines to time thou grow'st:\n" +
                "So long as men can breathe or eyes can see,\n" +
                "So long lives this, and this gives life to thee.";
        String[] sonnetSplit = sonnet.split("\\s+");
        String[] lines = sonnet.split("\n");

        int correct = 0;
        int incorrect = 0;

        Scanner scanner = new Scanner(System.in);

        while(correct < 3 && incorrect < 3){
            int randomIndex = (int)(Math.random() * sonnetSplit.length);
            int wordCount = 0;
            boolean foundBlank = false;

            for (String line : lines) {
                String[] words = line.split("\\s+");

                for (String word : words) {

                    if (wordCount == randomIndex) {
                        System.out.print("_____");
                        foundBlank = true;
                        break;
                    }

                    System.out.print(word + " ");
                    wordCount++;
                }

                System.out.println();

                if (foundBlank) {
                    break;
                }
            }
            System.out.println("Please fill in the blank with the next word.");
            String guess = scanner.nextLine();

            if(guess.equals(sonnetSplit[randomIndex])){
                System.out.println("Correct!");
                correct += 1;
            }else{
                System.out.println("Incorrect! the correct answer was " + sonnetSplit[randomIndex]);
                incorrect += 1;
            }
            System.out.println();

            }
        if(correct > 2) {
            System.out.println("You got three correct! Good Job!");
        }else{
            System.out.println("You got three incorrect. Please try again.");
        }
        }
    }

