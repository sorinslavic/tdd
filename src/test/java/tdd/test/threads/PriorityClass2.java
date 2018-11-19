package tdd.test.threads;

import org.testng.annotations.Test;

@Test(priority = 1)
public class PriorityClass2 {

  @Test
  public void first() throws InterruptedException {
    Thread.sleep(3200);
  }

  @Test
  public void second() throws InterruptedException {
    Thread.sleep(6200);
  }

  @Test
  public void third() throws InterruptedException {
    Thread.sleep(3200);
  }

  @Test
  public void fourth() throws InterruptedException {
    Thread.sleep(4200);
  }
}
