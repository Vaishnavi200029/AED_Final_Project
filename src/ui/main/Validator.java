package ui.main;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private Validator() {

    }

    public static boolean validateName(JPanel obj, String name) {
        if (name != null && name.matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(obj, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public static boolean validatePassword(JPanel obj, String password) {
        if (password != null && password.length() > 2) {
            return true;
        } else {
            JOptionPane.showMessageDialog(obj, "Invalid input : password should contain 3 or more characters.");
            return false;
        }
    }

    public static boolean validateUserName(JPanel obj, String username) {
        if (username != null && username.length() > 1) {
            return true;
        }
        JOptionPane.showMessageDialog(obj, "Invalid input : username should contain 2 or more charactewrs");
        return false;
    }

    public boolean ValidatePhoneNumber(String value) {
        String PATTERN = "^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{4}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidatePassword(String value) {
        String PATTERN = "^[a-zA-Z0-9]{5,12}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateUsername(String value) {
        String PATTERN = "^(?=.{3,20}$)(?![.])[a-zA-Z0-9._]+(?<![.])$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateEmail(String value) {
        String PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)+$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateAge(String value) {
        String PATTERN = "^(0?[1-9]|[1-9][0-9]|[1][1-9][1-9]|200)$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateName(String value) {
        String PATTERN = "^[A-Za-z]+([\\ A-Za-z]+)*";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateZip(String value) {
        String PATTERN = "^[0-9]{5,7}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateLevel(String value) {
        String PATTERN = "^[0-9]{1,2}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateInt(String value) {
        String PATTERN = "^[0-9]{1,3}$";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateFloat(String value) {
        String PATTERN = "[+-]?([0-9]*[.])?[0-9]+";
        return MatchPattern(PATTERN, value);
    }
    
    public boolean ValidateEmpty(String value) {
        return !value.isEmpty();
    }
    
    public boolean ValidateBloodPressure(String value) {
        String PATTERN = "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))";
        return MatchPattern(PATTERN, value);
    }
    
    private boolean MatchPattern(String pattern, String value) {
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(value);
        return match.matches();
    }

}
