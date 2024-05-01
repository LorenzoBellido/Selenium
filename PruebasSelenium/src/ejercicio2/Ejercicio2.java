package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class Ejercicio2 {
	
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new EdgeDriver();
		
	}

	@Test
	void test1() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("123");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean numero = errorNumero.isDisplayed();
        assertFalse(numero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}
	
	@Test
	void test2() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}
	
	@Test
	void test3() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("1");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}

	@Test
	void test4() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("12");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}
	
	@Test
	void test5() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("1234");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}
	
	@Test
	void test6() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("-123");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}
	
	@Test
	void test7() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("2.33");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}
	
	@Test
	void test8() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("lsc");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}
	
	@Test
	void test9() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("@#~");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}
	
	@Test
	void test10() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("000");
        directivoBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertTrue(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertFalse(textoDirectivo);
        
        
	}

	@Test
	void test11() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("123");
        directivoBox.sendKeys("");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertFalse(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertTrue(textoDirectivo);
        
        
	}
	
	@Test
	void test12() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("123");
        directivoBox.sendKeys("#");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertFalse(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertTrue(textoDirectivo);
        
        
	}
	
	@Test
	void test13() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numEmpBox = driver1.findElement(By.id("numero"));        
        WebElement directivoBox = driver1.findElement(By.id("directivo"));
        
        numEmpBox.sendKeys("123");
        directivoBox.sendKeys("++");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean textoNumero = errorNumero.isDisplayed();
        assertFalse(textoNumero);
        
        WebElement errorDirectivo = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDirectivo = errorDirectivo.isDisplayed();
        assertTrue(textoDirectivo);
        
        
	}
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}
