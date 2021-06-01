import org.openqa.selenium.By;

public class NovoUsuarioPage extends BasePage {


	public void preencherCampoNome(String nome) {
		driver.findElement(By.id("user_name")).sendKeys(nome);
	}
	public void preencherCampoUltimoNome(String ultimoNome) {
		driver.findElement(By.id("user_lastname")).sendKeys(ultimoNome);
	}

	public void preencherCampoEmail(String email) {
		driver.findElement(By.id("user_email")).sendKeys(email);
	}

	public void preencherCampoEndereco(String endereco) {
		driver.findElement(By.id("user_address")).sendKeys(endereco);
	}

	public void preencherCampoUniversidade(String universidade) {
		driver.findElement(By.id("user_university")).sendKeys(universidade);
	}

	public void preencherCampoProfissao(String profissao) {
		driver.findElement(By.id("user_profile")).sendKeys(profissao);
	}

	public void preencherCampoGenero(String genero) {
		driver.findElement(By.id("user_gender")).sendKeys(genero);
	}

	public void preencherCampoIdade(String idade) {
		driver.findElement(By.id("user_age")).sendKeys(idade);
	}

	public void clickBotaoCriar() {
		driver.findElement(By.name("commit")).click();
	}

	public String verificaMensagem() {
		return driver.findElement(By.id("notice")).getText();
	}
	public void cadastrarNovoUsuario(String var1,String var2,String var3,String var4,String var5,String var6,String var7,String var8) {
    preencherCampoNome(var1);
    preencherCampoUltimoNome(var2);
    preencherCampoEmail(var3);
    preencherCampoEndereco(var4);
    preencherCampoUniversidade(var5);
    preencherCampoProfissao(var6);
    preencherCampoGenero(var7);
    preencherCampoIdade(var8);
    clickBotaoCriar();
	}
}
