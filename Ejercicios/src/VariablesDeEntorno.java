import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println(varEnv);
        System.out.println(System.getenv("USERNAME"));
    }
}
