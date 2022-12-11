package junit_with_selenium;

import org.junit.*;

public class LearnJUnit {

    @Before
    public void beforeTest(){

        System.out.println("before test");

    }

    @After
    public void afterTest(){

        System.out.println("after test");

    }

    @Test
    public void testWD(){

        int x = 10;
        int y = 10;

        int z = x+y;

        System.out.println(z);

        //Assert.assertEquals(21, z);

        Assert.assertEquals("numbers doesn't match", 21, z);


    }

    @BeforeClass
    public static void beforeClass(){

        System.out.println("before class");

    }

    @AfterClass
    public static void afterClass(){

        System.out.println("After Class");

    }

}
