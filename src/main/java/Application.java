import controllers.MainController;
import entity.Result;
import exceptions.AppException;
import java.util.Arrays;

public class Application {
    private static final MainController mainController = new MainController();

    public static Result run(String[] args) throws AppException {
        if (args.length == 0) {
            throw new AppException("Не переданы аргументы");
        }

        String action = args[0];
        String[] parameters = Arrays.copyOfRange(args, 1, args.length);
        return mainController.doAction(action, parameters);
    }
}
