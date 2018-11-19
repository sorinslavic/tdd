package tdd.test.threads;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(priority = 1)
public class PriorityClassDp1 {

  @DataProvider(name = "dp", parallel = true)
  public static Object[][] repoName() {
    return new Object[][]{
        {"one"},
        {"two"},
        {"three"}
    };
  }

  @Test(dataProvider = "dp")
  public void first(String param) throws InterruptedException {
    Thread.sleep(1100);
  }

  @Test(dataProvider = "dp")
  public void second(String param) throws InterruptedException {
    Thread.sleep(2100);
  }

  @Test
  public void third() throws InterruptedException {
    Thread.sleep(3100);
  }

  @Test
  public void fourth() throws InterruptedException {
    Thread.sleep(4100);
  }
}
