public class CIN {

  public static String cin(String s) {

    char[] chars = s.toCharArray();

    int sum = 0;

    for (int i = 0; i < chars.length; i++) {

        if (i % 2 == 0) {
            sum += evenConverter(chars[i]);
        } else {
            sum += oddConverted(chars[i]);
        }
    }

    return remainderConverter(sum % 26);
  }


  private static int evenConverter(char c) {

    switch (c) {

      case '0':
      case 'A':
        return 1;

      case '1':
      case 'B':
        return 0;

      case '2':
      case 'C':
        return 5;

      case '3':
      case 'D':
        return 7;

      case '4':
      case 'E':
        return 9;

      case '5':
      case 'F':
        return 13;

      case '6':
      case 'G':
        return 15;

      case '7':
      case 'H':
        return 17;

      case '8':
      case 'I':
        return 19;

      case '9':
      case 'J':
        return 21;

      case 'K':
        return 2;

      case 'L':
        return 4;

      case 'M':
        return 18;

      case 'N':
        return 20;

      case 'O':
        return 11;

      case 'P':
        return 3;

      case 'Q':
        return 6;

      case 'R':
        return 8;

      case 'S':
        return 12;

      case 'T':
        return 14;

      case 'U':
        return 16;

      case 'V':
        return 10;

      case 'W':
        return 22;

      case 'X':
        return 25;

      case 'Y':
        return 24;

      case 'Z':
        return 23;

      default:
        return -1;
    }
  }


  private static int oddConverted(char c) {

    switch (c) {

      case '0':
      case 'A':
        return 0;

      case '1':
      case 'B':
        return 1;

      case '2':
      case 'C':
        return 2;

      case '3':
      case 'D':
        return 3;

      case '4':
      case 'E':
        return 4;

      case '5':
      case 'F':
        return 5;

      case '6':
      case 'G':
        return 6;

      case '7':
      case 'H':
        return 7;

      case '8':
      case 'I':
        return 8;

      case '9':
      case 'J':
        return 9;

      case 'K':
        return 10;

      case 'L':
        return 11;

      case 'M':
        return 12;

      case 'N':
        return 13;

      case 'O':
        return 14;

      case 'P':
        return 15;

      case 'Q':
        return 16;

      case 'R':
        return 17;

      case 'S':
        return 18;

      case 'T':
        return 19;

      case 'U':
        return 20;

      case 'V':
        return 21;

      case 'W':
        return 22;

      case 'X':
        return 23;

      case 'Y':
        return 24;

      case 'Z':
        return 25;

      default:
        return -1;
    }
  }


  private static String remainderConverter(int remainder) {

    String[] remainders = {
        "A",
        "B",
        "C",
        "D",
        "E",
        "F",
        "G",
        "H",
        "I",
        "J",
        "K",
        "L",
        "M",
        "N",
        "O",
        "P",
        "Q",
        "R",
        "S",
        "T",
        "U",
        "V",
        "W",
        "X",
        "Y",
        "Z"
    };

    return remainders[remainder];
  }

}
