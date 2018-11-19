/*
 *
 *    ADOBE CONFIDENTIAL
 *    ___________________
 *
 *    Copyright 2018 Adobe Systems Incorporated
 *    All Rights Reserved.
 *
 *    NOTICE:  All information contained herein is, and remains
 *    the property of Adobe Systems Incorporated and its suppliers,
 *    if any.  The intellectual and technical concepts contained
 *    herein are proprietary to Adobe Systems Incorporated and its
 *    suppliers and are protected by all applicable intellectual property
 *    laws, including trade secret and copyright laws.
 *    Dissemination of this information or reproduction of this material
 *    is strictly forbidden unless prior written permission is obtained
 *    from Adobe Systems Incorporated.
 *
 */

package tdd.test.testng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class TestCaseListener implements ITestListener, IInvokedMethodListener {

  private static final Logger log = LoggerFactory.getLogger(TestCaseListener.class);

  @Override
  public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    log.info("\tStarting method: {}#{}({})", method.getTestMethod().getConstructorOrMethod().getDeclaringClass().getSimpleName(),
             method.getTestMethod().getMethodName(), Arrays.asList(testResult.getParameters()));
  }

  @Override
  public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
    log.info("\tFinished method: {}#{}", method.getTestMethod().getConstructorOrMethod().getDeclaringClass().getSimpleName(),
             method.getTestMethod().getMethodName());
  }

  @Override
  public void onTestStart(ITestResult result) {
    log.info("Starting test: {}#{}", result.getInstance().getClass().getSimpleName(), result.getName());
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    log.info("Finished test: {}#{}", result.getInstance().getClass().getSimpleName(), result.getName());
  }

  @Override
  public void onTestFailure(ITestResult result) {

  }

  @Override
  public void onTestSkipped(ITestResult result) {

  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

  }

  @Override
  public void onStart(ITestContext context) {

  }

  @Override
  public void onFinish(ITestContext context) {
    log.info("Finished context: {}", context.getName());
  }
}
