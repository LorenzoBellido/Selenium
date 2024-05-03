package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class Ejercicio3 {
	
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new EdgeDriver();
		
	}
	
	@Test
	void test1() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/02/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement datoCorrecto = driver1.findElement(By.tagName("h3"));
        String textoDato = datoCorrecto.getText();
        assertEquals("Datos correctos", textoDato);
        
	}

	@Test
	void test2() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("32/12/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	
	@Test
	void test3() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/13/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}

	@Test
	void test4() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/02/20054");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	@Test
	void test5() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("1/02/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	
	@Test
	void test6() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/2/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	
	@Test
	void test7() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/**/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	@Test
	void test8() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("00/02/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	
	@Test
	void test9() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	
	@Test
	void test10() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("01/02/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement datoCorrecto = driver1.findElement(By.tagName("h3"));
        String textoDato = datoCorrecto.getText();
        assertEquals("Datos correctos", textoDato);
        
	}
	
	@Test
	void test11() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("02/02/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement datoCorrecto = driver1.findElement(By.tagName("h3"));
        String textoDato = datoCorrecto.getText();
        assertEquals("Datos correctos", textoDato);
        
	}
	
	@Test
	void test12() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("30/02/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement datoCorrecto = driver1.findElement(By.tagName("h3"));
        String textoDato = datoCorrecto.getText();
        assertEquals("Datos correctos", textoDato);
        
	}
	
	@Test
	void test13() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("31/02/2005");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement datoCorrecto = driver1.findElement(By.tagName("h3"));
        String textoDato = datoCorrecto.getText();
        assertEquals("Datos correctos", textoDato);
        
	}
	
	
	
	@Test
	void test15() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/0/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	@Test
	void test16() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/1/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	
	@Test
	void test17() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/2/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	
	@Test
	void test18() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/11/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement datoCorrecto = driver1.findElement(By.tagName("h3"));
        String textoDato = datoCorrecto.getText();
        assertEquals("Datos correctos", textoDato);
        
	}
	
	@Test
	void test19() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/12/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement datoCorrecto = driver1.findElement(By.tagName("h3"));
        String textoDato = datoCorrecto.getText();
        assertEquals("Datos correctos", textoDato);
        
	}
	
	@Test
	void test20() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lorenzo Bellido Barrena");
        fecha.sendKeys("13/13/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertFalse(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertTrue(textoFecha);
        
	}
	
	@Test
	void test21() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("");
        fecha.sendKeys("13/02/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertTrue(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertFalse(textoFecha);
        
	}
	
	@Test
	void test22() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("L");
        fecha.sendKeys("13/02/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement datoCorrecto = driver1.findElement(By.tagName("h3"));
        String textoDato = datoCorrecto.getText();
        assertEquals("Datos correctos", textoDato);
        
	}
	
	@Test
	void test23() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("Lo");
        fecha.sendKeys("13/02/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement datoCorrecto = driver1.findElement(By.tagName("h3"));
        String textoDato = datoCorrecto.getText();
        assertEquals("Datos correctos", textoDato);
        
	}
	
	@Test
	void test24() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("1Lorenzo Bellido Barrena");
        fecha.sendKeys("13/02/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertTrue(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertFalse(textoFecha);
        
	}
	
	@Test
	void test25() {
		driver1.get("https://elenarivero.github.io/ejercicio3/index.html");
		WebElement nombreApellido = driver1.findElement(By.id("nomap"));        
        WebElement fecha = driver1.findElement(By.id("fecha"));
        
        nombreApellido.sendKeys("*Lorenzo Bellido Barrena");
        fecha.sendKeys("13/02/2006");
        
        
        WebElement submitButton = driver1.findElement(By.xpath("//p/input[@type='submit']"));
        submitButton.click();
        
        WebElement errorNombre = driver1.findElement(By.id("errorNomap"));
        boolean textoNombre = errorNombre.isDisplayed();
        assertTrue(textoNombre);
        
        WebElement errorFecha = driver1.findElement(By.id("errorFecha"));
        boolean textoFecha = errorFecha.isDisplayed();
        assertFalse(textoFecha);
        
	}
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}
