package kata.kyu_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FourLetterWordsMutations {

  private static Set<String> usedWords = new HashSet<>();
  private static int winner = -1;
  private static int responses;
  private static String currentWord;
  private static String[] aliceWords;
  private static String[] bobWords;

  public static void main(String[] args) {
    String[] alice = new String[]{"plat", "rend", "bear", "soar", "mare", "pare", "flap", "neat",
        "clan", "pore"};
    String[] bob = new String[]{"boar", "clap", "mere", "lend", "near", "peat", "pure", "more",
        "plan", "soap"};

    System.out.println(mutations(alice, bob, "maze", 0));
    System.out.println(mutations(alice, bob, "send", 0));
    System.out.println(mutations(alice, bob, "boat", 0));
    System.out.println(mutations(alice, bob, "apse", 0));
    System.out.println(mutations(alice, bob, "flap", 1));
    System.out.println(mutations(alice, bob, "soar", 1));
    System.out.println(mutations(alice, bob, "more", 1));
    System.out.println(mutations(alice, bob, "calm", 1));
  }

  public static int mutations(String[] alice, String[] bob, String word, int first) {
    setUp(alice, bob, word);

    if (first == 0) {
      do {
        responses = 0;
        aliceTurn();
        bobTurn();
      } while (responses == 2);
    } else {
      do {
        responses = 0;
        bobTurn();
        aliceTurn();
      } while (responses == 2);
    }
    return winner;
  }

  private static void setUp(String[] alice, String[] bob, String word) {
    usedWords = new HashSet<>();
    winner = -1;
    usedWords.add(word);
    currentWord = word;
    aliceWords = alice.clone();
    bobWords = bob.clone();
  }

  private static void aliceTurn() {
    for (int i = 0; i < aliceWords.length; i++) {
      if (usedWords.contains(aliceWords[i])) {
        aliceWords[i] = "-";
      } else if (!aliceWords[i].equals("-") && wordIsValid(aliceWords[i], currentWord)) {
        usedWords.add(aliceWords[i]);
        currentWord = aliceWords[i];
        aliceWords[i] = "-";
        winner = 0;
        responses++;
        break;
      }
    }
  }

  private static void bobTurn() {
    for (int i = 0; i < bobWords.length; i++) {
      if (usedWords.contains(bobWords[i])) {
        bobWords[i] = "-";
      } else if (!bobWords[i].equals("-") && wordIsValid(bobWords[i], currentWord)) {
        usedWords.add(bobWords[i]);
        currentWord = bobWords[i];
        bobWords[i] = "-";
        winner = 1;
        responses++;
        break;
      }
    }
  }

  private static boolean wordIsValid(String providedWord, String word) {
    int count = 0;
    if (allLettersAreUnique(providedWord)) {
      for (int i = 0; i < 4; i++) {
        if (providedWord.charAt(i) == word.charAt(i)) {
          ++count;
        }
      }
    }

    return count == 3;
  }

  private static boolean allLettersAreUnique(String word) {
    return word.length() == Arrays.stream(word.split(""))
        .distinct()
        .collect(Collectors.joining(""))
        .length();
  }

}
