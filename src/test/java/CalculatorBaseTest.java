import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

/**
 * Created by Katsiaryna_Skarzhyns on 12/11/2017.
 */
public class CalculatorBaseTest {

	Calculator calculator;

	@BeforeClass(alwaysRun = true)
	public void setUp(){
		calculator = new Calculator();
	}
}