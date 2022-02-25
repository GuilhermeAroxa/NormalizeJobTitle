package utils;

public class Checker {
    
    public static Boolean isNullOrEmpty(String text) {
        if (text == null || text.length() == 0){
            return true;
        }
        return false;
    }
}
