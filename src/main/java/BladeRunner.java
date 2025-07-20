import entity.Result;

public class BladeRunner {
    public static void main(String[] args) {
        Application application = new Application(args);
        Result result = Application.run ();
    }
}
