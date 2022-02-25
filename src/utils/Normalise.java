package utils;

import java.util.Arrays;
import java.util.List;

import enums.EJobTitle;

public class Normalise {
    
    public String normalise(String jobTitle) {
        if(!Checker.isNullOrEmpty(jobTitle)){
            List<String> words = Arrays.asList(jobTitle.split(" "));
    
            for (String word : words) {
                String normalisedJobTitle = EJobTitle.valueOfLabel(word.toUpperCase());
                if (normalisedJobTitle != null){
                    return normalisedJobTitle;
                }
            }
        }
        return null;
    }
}
