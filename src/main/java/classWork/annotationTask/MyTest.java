package classWork.annotationTask;

import classWork.annotationTask.annotations.*;

public class MyTest {

    @BeforeAll
    public void beforeAllTest(){
        System.out.println("before all");
    }
    @AfterAll
    public void afterAllTest(){
        System.out.println("after all");
    }

    @Before
    public void beforeTest(){
        System.out.println("before");
    }

    @After
    public void afterTest(){
        System.out.println("after");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

}
