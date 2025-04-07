package seccion9;

import java.util.Map;

public class VariableEntorno {
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        System.out.println("env = " + env);
        
        String path  = env.get("PATH");
        System.out.println("path = " + path);
    }
}
