import org.openqa.selenium.By;

public class HomePage extends BasePage{


	public void clickBtnFormulario() {
		driver.findElement(By.className("collapsible-header")).click();
	}

	public void clickLinkCriarUsuario() {
		driver.findElement(By.linkText("Criar Usuários")).click();
	}
}
