import org.apache.commons.cli.ParseException;

public class CommandLine {

    public static void main(String[] args) {

        Parser parser = new Parser();
        BoxOperandAndOperation box = new BoxOperandAndOperation();

        try {
            parser.parse(args);
            box = parser.getBoxWithArguments();
            MethodOfCalculate method = box.getOperation();
            System.out.println(method.calculate(box.getLeftOperand(), box.getRightOperand()));

        } catch (ParseException e) {
            System.out.println(box.printDemand());
        }
    }
}
