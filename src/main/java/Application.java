import racingcar.controller.RaceController;

public class Application {
    public static void main(String[] args) {
        RaceController raceController = new RaceController();
        raceController.setUpCars();
        raceController.setUpTryCount();
        raceController.raceStart();
        raceController.raceEnd();
    }
}
