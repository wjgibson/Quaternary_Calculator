package model;

public class Calculator {
    private char operator;
    /*
    * possible operators include: +, -, *, /, as well as:
    * 'r' for square root
    * 's' for square
     */
    private String[] operands;

    public Calculator(char operator, String operand1, String operand2) {
        this.operator = operator;
        this.operands = new String[] { operand1, operand2 };
    }

    public int add(String operand1, String operand2) {
        return Integer.parseInt(operand1,4) + Integer.parseInt(operand2,4);
    }

    public int subtract(String operand1, String operand2) {
        return Integer.parseInt(operand1,4) - Integer.parseInt(operand2,4);
    }

    public int multiply(String operand1, String operand2) {
        return Integer.parseInt(operand1,4) * Integer.parseInt(operand2,4);
    }

    public int divide(String operand1, String operand2) {
        return Integer.parseInt(operand1,4) / Integer.parseInt(operand2,4);
    }

    public int square(String operand) {
        return multiply(operand, operand);
    }

    public int squareRoot(String operand) {
        return Integer.parseInt(String.format("%d", (int) Math.sqrt(Integer.parseInt(operand, 4))), 4);
    }

    public String convertBase(String number, int source) {
        int destination;
        if (source == 10) {
            destination = 4;
        } else {
            destination = 10;
        }
        return Integer.toString ( Integer.parseInt ( number, source ) , destination );
    }

    public int calculate() {
        return switch (this.operator) {
            case '+' -> add(operands[0], operands[1]);
            case '-' -> subtract(operands[0], operands[1]);
            case '*' -> multiply(operands[0], operands[1]);
            case '/' -> divide(operands[0], operands[1]);
            case 's' -> square(operands[0]);
            case 'r' -> squareRoot(operands[0]);
            default -> throw new IllegalStateException("Invalid operator!");
        };
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setOperands(String operand1, String operand2) {
        this.operands = new String[] { operand1, operand2 };
    }
}
