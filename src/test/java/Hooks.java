import org.junit.After;
import org.junit.Before;

public class Hooks {


	BasePage bp = new BasePage();

	@Before
	public void antes() {
	bp.iniciarChrome();
	}

	@After
	public void depois() {
    bp.finalizarChrome();
	}
}
