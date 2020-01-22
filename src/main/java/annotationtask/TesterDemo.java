package annotationtask;

public class TesterDemo {
    public static void main(String[] args) throws Exception {
        TestRunner runner = new TestRunner();
        runner.run(MyTest.class);
    }
}
