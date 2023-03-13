public class Practicum17 {


        public static void main(String[] args) {

            int doubleOfDigit;
            doubleOfDigit = doubleIt(7);
            System.out.println("Double of given number is :" + doubleOfDigit);

        }

        public static int doubleIt(int parameter){

            int result;
            result = parameter + parameter;
            return result;
        }
    }

