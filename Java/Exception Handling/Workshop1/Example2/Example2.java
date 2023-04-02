package Example2;
import Example2.*;

 /* example2
 */
public class Example2 {

    public static void main(String[] args) {
        System.out.println(dispatcher());
    }

    public static Integer searchInArray(int[] intArray, int desired) {
        if (intArray == null) {
            return -3;
        }

        if (intArray.length < 1) {
            return -1;
        }

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == desired) {
                return i;
            }
        }
        return -2;
    }

    public static String dispatcher() {
        String message = "";
        int sizeArray = requestNumber("Enter size of Array: ");
        int diseredValue = requestNumber("Enter desired value: ");
        int[] intArray = new int [sizeArray];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = requestNumber("Enter value of " + i + " element Array: ");
        }
        int codeErr = searchInArray(intArray, diseredValue);
        switch (codeErr) {
            case -1:
                message = "Array's length is less the min";
                break;
            case -2:
                message = "Disered value not found";
                break;
            case -3:
                message = "Array is empty";
                break;
            default:
                message = "Disered value is found for [" + codeErr + "] index.";
                break;
        }
        return message;
    }
   
}