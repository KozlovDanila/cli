import org.apache.commons.cli.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommandLineTest {

    @Test
    public void testForParserOperands() {
        String[] args = {"-l", "23", "-r", "12", "-o", "-"};
        Parser parser = new Parser();
        BoxOperandAndOperation box = null;
        try {
            parser.parse(args);
            box = parser.getBoxWithArguments();
        } catch (ParseException e) {

        }

        Assert.assertTrue(box.getLeftOperand() == 23);
        Assert.assertTrue(box.getRightOperand() == 12);
        MethodOfCalculate method = new Substruction();
        Assert.assertTrue(method.calculate(box.getLeftOperand(), box.getRightOperand()) == 11);
    }


}