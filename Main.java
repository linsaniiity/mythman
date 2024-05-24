import java.util.Scanner;

public class Main {
  private static String[] words = {"LOKI", "MEDEA", "JASON", "DIONYSUS", "SCYLLA", "HORUS", "SET", "ISIS", "SKYRMIR", "HECTOR", "ORESTES", "AEGEUS", "ATREUS", "ELECTRA", "TYPHON", "HERMES"};
  private static String word = words[(int) (Math.random() * words.length)];
  private static String star = new String(new char[word.length()]).replace("\0", "*");
  private static int count = 0;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (count < 7 && star.contains("*")) {
      System.out.println("Guess a letter! Keep in mind, these are Myth characters! Each star represents a letter of the character's name. You got this, Ms. Foley :)");
      System.out.println(star);
      String guess = sc.next().toUpperCase();
      hang(guess);
    }
    sc.close();
  }
  public static void hang(String guess) {
    String newstar = "";
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == guess.charAt(0)) {
        newstar += guess.charAt(0);
      }
      else if (star.charAt(i) != '*') {
        newstar += word.charAt(i);
      }
      else {
        newstar += "*";
      }
    }
    if (star.equals(newstar)) {
      count++;
 
      hangmanDisplay();
    }
    else {
      star = newstar;
    }
    if (star.equals(word)) {
      System.out.println("SLAYYY, you got the word!");
    }
  }
  public static void hangmanDisplay() {

    if (count == 1) {
      System.out.println("WRONG, try another letter!");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("___|___");
      System.out.println();
      System.out.println("Tries remaining: " + (word.length() - count));
    }
  if (count == 2) {
    System.out.println("Wrong guess, try again");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("___|___");
    System.out.println("Tries remaining: " + (word.length() - count));
}
if (count == 3) {
  System.out.println("Wrong guess, try again");
  System.out.println("   ____________");
  System.out.println("   |");
  System.out.println("   |");
  System.out.println("   |");
  System.out.println("   |");
  System.out.println("   |");
  System.out.println("   |");
  System.out.println("   | ");
  System.out.println("___|___");
  System.out.println("Tries remaining: " + (word.length() - count));
}
if (count == 4) {
  System.out.println("Wrong guess, try again");
  System.out.println("   ____________");
  System.out.println("   |          _|_");
  System.out.println("   |         /   \\");
  System.out.println("   |        |     |");
  System.out.println("   |         \\_ _/");
  System.out.println("   |");
  System.out.println("   |");
  System.out.println("   |");
  System.out.println("___|___");
  System.out.println("Tries remaining: " + (word.length() - count));
}
if (count == 5) {
  System.out.println("Wrong guess, try again");
  System.out.println("   ____________");
  System.out.println("   |          _|_");
  System.out.println("   |         /   \\");
  System.out.println("   |        |     |");
  System.out.println("   |         \\_ _/");
  System.out.println("   |           |");
  System.out.println("   |           |");
  System.out.println("   |");
  System.out.println("___|___");
  System.out.println("Tries remaining: " + (word.length() - count));
}
if (count == 6) {
  System.out.println("Wrong guess, try again");
  System.out.println("   ____________");
  System.out.println("   |          _|_");
  System.out.println("   |         /   \\");
  System.out.println("   |        |     |");
  System.out.println("   |         \\_ _/");
  System.out.println("   |           |");
  System.out.println("   |           |");
  System.out.println("   |          / \\ ");
  System.out.println("___|___      /   \\");
  System.out.println("Tries remaining: " + (word.length() - count));
}
if (count == 7) {
  System.out.println("GAME OVER!");
  System.out.println("   ____________");
  System.out.println("   |          _|_");
  System.out.println("   |         /   \\");
  System.out.println("   |        |     |");
  System.out.println("   |         \\_ _/");
  System.out.println("   |          _|_");
  System.out.println("   |         / | \\");
  System.out.println("   |          / \\ ");
  System.out.println("___|___      /   \\");
  System.out.println("SORRY! YOU DIDN'T GET THE WORD. Thie word was " + word);
}
}
}
