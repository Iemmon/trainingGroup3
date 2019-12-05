package task1.numberConversionTask;

public class Main {

    public static void main(String[] args) {
        NumConversionModel numConversionModel = new NumConversionModel();
        ConversionView conversionView = new ConversionView();
        ConversionController conversionController = new ConversionController(numConversionModel, conversionView);
        conversionController.convertNumber();
    }
}
