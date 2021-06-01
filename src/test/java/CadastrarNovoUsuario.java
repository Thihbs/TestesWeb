
import org.junit.Assert;
import org.junit.Test;

public class CadastrarNovoUsuario extends Hooks{




	HomePage hp = new HomePage();
    NovoUsuarioPage nup = new NovoUsuarioPage();
    
    
    

	@Test
	public void cadastrarUsuarioComSucesso() {
    hp.clickBtnFormulario();
    hp.clickLinkCriarUsuario();
    nup.cadastrarNovoUsuario(
    		"Thiago"
    		, "Silva"
    		, "saoaskoas@gmail.com"
    		, "Rua jabaquara"
    		, "fatec", "QA"
    		, "masculino"
    		, "25");
    Assert.assertEquals("Usuário Criado com sucesso",nup.verificaMensagem());
	}
}
