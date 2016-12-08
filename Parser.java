import org.apache.commons.cli.*;
import org.apache.commons.cli.CommandLine;

public class Parser {

    CommandLine commandLine;

    Parser() {
        commandLine = null;
    }

    public void parse(String[] args) throws ParseException {
        Options options = new Options();

        Option leftOperand = Option.builder("l").
                required(true).
                longOpt("left").
                hasArg().
                desc("").
                build();

        Option rightOperand = Option.builder("r").
                required(true).
                longOpt("right").
                hasArg().
                desc("").
                build();

        Option operation = Option.builder("o").
                required(true).
                longOpt("operation").
                hasArg().
                desc("").
                build();

        options.addOption(leftOperand);
        options.addOption(rightOperand);
        options.addOption(operation);

        CommandLineParser parser = new DefaultParser();
        commandLine = parser.parse(options, args);
    }

    public BoxOperandAndOperation getBoxWithArguments() {
        int leftOperand = Integer.parseInt(commandLine.getOptionValue("left"));
        int rightOperand = Integer.parseInt(commandLine.getOptionValue("right"));

        MethodOfCalculate operation = null;
        switch (commandLine.getOptionValue("operation")) {
            case "+":
                operation = new Addition();
                break;

            case "-":
                operation = new Substruction();
                break;

            case "*":
                operation = new Multiplication();
                break;

            case "/":
                operation = new Division();
                break;
        }

        return new BoxOperandAndOperation(leftOperand, rightOperand, operation);
    }


}
