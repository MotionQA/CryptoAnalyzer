import entity.Result;

public class BladeRunner {
    public static void main(String[] args) {
        Application application = new Application();
        Result result = Application.run(args);
        System.out.println(result);
    }
}
