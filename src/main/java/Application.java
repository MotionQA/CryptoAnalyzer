import controllers.MainController;
import entity.Result;
import exceptions.AppException;

import java.util.Arrays;

public class Application {

    private static MainController mainController = null;

    public Application() {
        mainController = new MainController();

    }

    public static Result run(String[] args) {
        if (args.length > 0) {
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);

            Result result = mainController.doAction(action, parameters);
        }
        throw new AppException();

    }
}

