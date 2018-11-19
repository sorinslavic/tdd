package tdd.test.threads;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class PriorityMethod1 {

  @DataProvider(name = "dp", parallel = true)
  public static Object[][] repoName() {
    return new Object[][]{
        {"one"},
        {"two"},
        {"three"}
    };
  }

  @Test(dataProvider = "dp", priority = 1)
  public void first(String param) throws InterruptedException {
    Thread.sleep(1100);
  }

  @Test(dataProvider = "dp", priority = 1)
  public void second(String param) throws InterruptedException {
    Thread.sleep(2100);
  }

  @Test(priority = 1)
  public void third() throws InterruptedException {
    Thread.sleep(3100);
  }

  @Test(priority = 1)
  public void fourth() throws InterruptedException {
    Thread.sleep(4100);
  }
}
