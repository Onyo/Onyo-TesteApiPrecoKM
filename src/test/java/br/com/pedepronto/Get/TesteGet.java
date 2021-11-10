package br.com.pedepronto.Get;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class TesteGet {

	@Test
	public void deveAcessarPedePronto() {
		given()
		.log().all()
		.header("internal-authentication","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
	
		.when()
		
		.get("https://pp-logistic-api-dev.pedepronto.com.br/v2/company-config/155/")
		
		.then()
		.log().all()
		.statusCode(200)

		;

	}
	
	@Test
	public void deveAcessarPedePronto1() {
		given()
		.log().all()
		.header("internal-authentication","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
	
		.when()
		
		.get("https://pp-logistic-api-dev.pedepronto.com.br/v2/company-config/155/")
		
		.then()
		.log().all()
		.statusCode(200)

		;

	}
	
	@Test
	public void deveAcessarPedePronto2() {
		given()
		.log().all()
		.header("internal-authentication","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
	
		.when()
		
		.get("https://pp-logistic-api-dev.pedepronto.com.br/v2/company-config/155/")
		
		.then()
		.log().all()
		.statusCode(200)

		;

	}
	
	@Test
	public void deveAcessarPedePronto3() {
		given()
		.log().all()
		.header("internal-authentication","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
	
		.when()
		
		.get("https://pp-logistic-api-dev.pedepronto.com.br/v2/company-config/155/")
		
		.then()
		.log().all()
		.statusCode(200)

		;

	}
	
	@Test
	public void deveAcessarPedePronto4() {
		given()
		.log().all()
		.header("internal-authentication","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
	
		.when()
		
		.get("https://pp-logistic-api-dev.pedepronto.com.br/v2/company-config/155/")
		
		.then()
		.log().all()
		.statusCode(201)

		;

	}
}
	