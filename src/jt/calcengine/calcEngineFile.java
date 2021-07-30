package jt.calcengine;

public class calcEngineFile {
    public static void main(String[] args) {
        double[] leftVals = {10.0d, 25.0d, 300.0d, 50.0d};
        double[] rightVals = {50.0d, 90.0d, 10.0d, 10.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];
        int checkVal = 1;
        int[] theVals = new int[10];


        if (args.length == 0) {
            for (int i = 0; i < opCodes.length; i++)
            {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
        }else if(args.length ==3)
            handleCommandLine(args);
        else
            System.out.println("Please provide an operation code and 2 numeric values");


    }

    private static void handleCommandLine(String[] args) { // command line method for handling CL Arguments

        char opCode = args[0].charAt(0); // assign opCode to arg index 0
        double leftVal = Double.parseDouble(args[1]); // convert left val to string arg for CL
        double rightVal = Double.parseDouble(args[2]); // convert right val to string arg for CL
        double result = execute(opCode, leftVal, rightVal); // calculate result from execute method to CL
        System.out.println(result); // print result

    }

    static double execute(char opCode,double leftVal,double rightVal)
        {
            double result;
            switch (opCode) {
                case 'a':
                    result = leftVal + rightVal;
                    break;
                case 's':
                    result = leftVal - rightVal;;
                    break;
                case 'm':
                    result = leftVal * rightVal;
                    break;
                case 'd':
                    result = leftVal != 0 ? leftVal / rightVal : 0.0d;
                    break;
                default:
                    System.out.println("The opCode is invalid: " + opCode);
                    result = 0.0d;
                    break;
            }
            return result;
        }
}


