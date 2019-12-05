package task1.perfectNumsTask;

public class PerfectController {

    private PerfectNumsModel perfectNumsModel;
    private PerfectView perfectView;

    public PerfectController(PerfectNumsModel perfectNumsModel, PerfectView perfectView) {
        this.perfectNumsModel = perfectNumsModel;
        this.perfectView = perfectView;
    }

    public void getPerfectNumbers() {
        perfectNumsModel.generatePerfectNums(InputUtility.inputSizeValue(perfectView));
        perfectView.printResult(perfectView.OUTPUT_RESULT, perfectNumsModel.getPerfectNumbers());
    }

}
