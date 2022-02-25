import java.io.BufferedReader;
import java.io.InputStreamReader;

import utils.Checker;
import utils.Normalise;

public class App {
    public static void main(String[] args) throws Exception {        
        System.out.println("Input the Job Title:");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        
        Normalise n = new Normalise();
        String jobTitleNormalised = n.normalise(name);
        
        if(!Checker.isNullOrEmpty(jobTitleNormalised)){
            System.out.println(jobTitleNormalised);
        } else {
            System.out.println("Can't normalise job title " + name);
        }
    }
}
