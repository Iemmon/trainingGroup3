package task1.numberConversionTask;

public class ConversionController {

    private NumConversionModel numConversionModel;
    private ConversionView conversionView;

    public ConversionController(NumConversionModel numConversionModel, ConversionView conversionView) {
        this.numConversionModel = numConversionModel;
        this.conversionView = conversionView;
    }

    public void convertNumber() {
        int number = InputUtility.inputNumberValue(conversionView);
        int system = InputUtility.inputNumericSystem(conversionView);
        numConversionModel.convertNumber(number, system);
        conversionView.printResult(conversionView.OUTPUT_RESULT, numConversionModel.getNumber());
    }

}
