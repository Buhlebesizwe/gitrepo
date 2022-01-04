package multid.dimensional_string_challenge;

public class MultidDimensional_String_Challenge {

    public static void main(String[] args) {
        String line = "1,4,3,2,3,7,5,6,9\n"
                + "8,6,3,7,3,7,5,6,9\n";

        //split on this delimiter
        String lineParts[] = line.split("\n");
        for (int i = 0; i < lineParts.length; i++) {
            lineParts[i] = lineParts[i].replaceAll("\n", ",");
        }
        //get number of elements
        int lineElementNo = lineParts[0].split(",").length;
        // declare and populate string array
        String arr[][] = new String[lineParts.length][lineElementNo];
        for (int i = 0; i < lineParts.length; i++) {
            arr[i] = lineParts[i].split(",");
        }

        //declare a new array int array and populate it
        int intArr[][] = new int[lineParts.length][lineElementNo];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                intArr[i][j] = Integer.parseInt(arr[i][j]);
            }
        }

        int temp;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr[i].length; j++) {
                for (int k = 0; k < intArr.length; k++) {
                    for (int f = k; f < intArr[i].length - 1; f++) {
                        if (intArr[k][f] > intArr[k][f + 1]) {
                            temp = intArr[k][f];
                            intArr[k][f] = intArr[k][f + 1];
                            intArr[k][f + 1] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Ascending order");
        for (int[] intArr1 : intArr) {
            for (int j = 0; j < intArr1.length; j++) {
                System.out.print(intArr1[j] + ", ");
            }
            System.out.println("\n");
        }

        int temp1;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr[i].length; j++) {
                for (int k = 0; k < intArr.length; k++) {
                    for (int f = k; f < intArr[i].length - 1; f++) {
                        if (intArr[k][f] < intArr[k][f + 1]) {
                            temp1 = intArr[k][f];
                            intArr[k][f] = intArr[k][f + 1];
                            intArr[k][f + 1] = temp1;
                        }
                    }
                }
            }
        }
        System.out.println("Descending order");
        for (int[] intArr1 : intArr) {
            for (int j = 0; j < intArr1.length; j++) {
                System.out.print(intArr1[j] + ", ");
            }
            System.out.println("\n");
        }
    }
}
