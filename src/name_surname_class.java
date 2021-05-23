import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class name_surname_class {

  public static String fandsname(String s, boolean isname) {

    if (StringUtils.isNumericSpace(s)) {
      System.exit(-1);
    }

    s = s.toUpperCase();                                    // All letters to upper case
    s = s.replaceAll("\\s+", "");         // Remove spaces from name

    List<Character> result = new ArrayList<>();             // Final three-letters string
    List<Character> vowels = new ArrayList<>();             // List of vocals
    List<Character> consonants = new ArrayList<>();         // List of consonants

    for (int i = 0; i < s.length(); i++) {                  // Store the consonants and vowels

      if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' ||
          s.charAt(i) == 'U') {
        vowels.add(s.charAt(i));
      } else {
        consonants.add(s.charAt(i));
      }
    }

    if (isname && consonants.size() >
        3) {                  // If name has more than 3 consonants, skip the 2nd one

      for (int i = 0; i < consonants.size(); i++) {

        if (i != 1) {
          result.add(consonants.get(i));
        }

        if (result.size() == 3) {
          break;
        }
      }
    } else {                                                  // else, simply orderly place the consonants first

      for (Character c : consonants) {

        result.add(c);
        if (result.size() == 3) {
          break;
        }
      }
    }

    if (result.size() <
        3) {                                // If not enough consonants, place the vowels

      for (Character c : vowels) {

        result.add(c);
        if (result.size() == 3) {
          break;
        }
      }

      if (result.size() < 3) {                            // If not enough characters, fill with Xs

        while (result.size() < 3) {
          result.add('X');
        }
      }
    }

    StringBuilder str = new StringBuilder();                // Return the string
    for (Character character : result) {
      str.append(character);
    }

    return str.toString();
  }

}
