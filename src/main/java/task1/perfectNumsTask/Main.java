package task1.perfectNumsTask;

public class Main {
    public static void main(String[] args) {
        PerfectNumsModel perfectNumsModel = new PerfectNumsModel();
        PerfectView perfectView = new PerfectView();
        PerfectController perfectController = new PerfectController(perfectNumsModel, perfectView);
        perfectController.getPerfectNumbers();
    }
}
