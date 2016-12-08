public class BoxOperandAndOperation {

    public BoxOperandAndOperation() {
    }

    private int leftOperand;
    private int rightOperand;
    private MethodOfCalculate operation;

    public BoxOperandAndOperation(int leftOperand, int rightOperand,  MethodOfCalculate operation) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operation = operation;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public MethodOfCalculate getOperation() {
        return  operation;
    }

    public String printDemand() {
        return "Enter: -l value -r value -o value\nOperands can be only integer\nOperation: +, -, *, /\n";
    }
}
