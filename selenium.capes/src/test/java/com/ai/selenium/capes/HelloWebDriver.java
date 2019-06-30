package com.ai.selenium.capes;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebDriverConfig.class)
public class HelloWebDriver {

	@Inject
	private WebDriver driver;

	@Inject
	private URI baseUrl;

	@Test
	public void loadIndexPage() throws Exception {
		driver.get(baseUrl + "/index.html");
	}

	@Ignore
	@Test
	public void helloWebDriver() throws Exception {

		driver.get(baseUrl + "/hello-webdriver.html");

		WebElement pageHeading = driver.findElement(By.tagName("h1"));

		assertEquals("Hello WebDriver!", pageHeading.getText());
	}
}
