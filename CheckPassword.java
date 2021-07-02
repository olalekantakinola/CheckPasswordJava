import java.util.Scanner;

/**
 * A class that validates a password based on rules.
 * <p>
 * The provided code is incomplete. Modify it so that it works properly and passes the tests in
 * <code>CheckPasswordTest.java</code>.
 *
 */
public class CheckPassword {

    /**
     *
     * @param password the password to check
     * @param minLength the minimum length for the password
     * @param minLetter the minimum number of letters the password must contain
     * @param minNumber the minimum number of letters that the password must contain
     * @param minSpecial the minimum number of special characters that the password must contain
     * @return true if the password follows the rules, false otherwise
     */
    public static boolean checkPassword(final String password, final int minLength, final int
            minLetter, final int minNumber, final int minSpecial) {

        String password1 = password.replaceAll("[^A-Za-z]", "");
        String password2 = password.replaceAll("[^0-9]", "");

        if (password.length() < minLength) {
            return false;

        } else if (password1.length() < minLetter) {

            return false;

        } else if (password2.length() < minNumber) {

            return false;

        } else if ((password.length() - password1.length() - password2.length()) < minSpecial) {
            return false;
        } else {

            return true;
        }

    }

    /**
     * Solicits two strings from the user and print if they are anagrams.
     *
     * @param unused unused input arguments
     */
    public static void main(final String[] unused) {
        Scanner lineScanner = new Scanner(System.in);
        System.out.println("The rules are the password must be 10 characters "
                        + "and contain two digits and one special character");
        System.out.println("Enter a password to check: ");
        String password = lineScanner.nextLine();
        final int minLength = 10;
        if (checkPassword(password, minLength, 0, 2, 1)) {
            System.out.println("The password is valid");
        } else {
            System.out.println("The password is invalid");
        }
    }
}
