//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // add six to a number
    public static int addSix(int a){
        return a + 6;
    }
    public static int addSeventeen(int b) { return b + 17; }

    /*
    input: "encrypted" string
    output: string
    purpose: take a normal string and remove an asterik from the end and beginning of the string
     */
    public static String decryptorA(String encrypted) {
        return encrypted.substring(1, (encrypted.length()-1));
//        String decrypted = "";
//        int e_len = encrypted.length();
//        for (int i=1; i<(e_len-1); i++) {
//            decrypted += encrypted.charAt(i);
//        }
//        return decrypted;
    };

    public static String decryptorB(String encrypted) {
        return encrypted.substring(encrypted.length()-1) +
                encrypted.substring(1, (encrypted.length()-1)) +
                encrypted.substring(0, 1);
    }

    public static String decryptorC(String encrypted){
        return encrypted.substring(encrypted.length()-3, encrypted.length()-2)+
                encrypted.substring(0, encrypted.length()-3);
    }

    public static String decryptorD(String encrypted){
        return encrypted.substring(0, encrypted.length()/2) +
                encrypted.substring(encrypted.length()-1) +
                encrypted.substring((encrypted.length()/2), encrypted.length()-1);
    }

    public static String decryptorLA(String encrypted){
        String decrypted = "";
        int reverse = encrypted.length()/2;
        for (int i=0; i<encrypted.length(); i++){
            if (i < (encrypted.length()/2)) {
                decrypted += encrypted.charAt(reverse);
                reverse++;
                continue;
            }
            if (reverse == encrypted.length()) {
                reverse = (encrypted.length()/2) - 1;
            }
            decrypted += encrypted.charAt(reverse);
            reverse--;

        }
        return decrypted;
    }

    public static String decryptorLB(String encrypted){
        String decrypted = "";
        for (int i=0; i<encrypted.length(); i++) {
            switch (encrypted.charAt(i)){
                case 'a':
                    decrypted += "u";
                    break;
                case 'e':
                    decrypted += "a";
                    break;
                case 'i':
                    decrypted += "e";
                    break;
                case 'o':
                    decrypted += "i";
                    break;
                case 'u':
                    decrypted += "o";
                    break;
                default:
                    decrypted += encrypted.charAt(i);
            }
        }
        return decrypted;
    }

    static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + Main.addSix(i));
        }
    }
}
