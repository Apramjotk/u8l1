public class FunWith2DArrays
{
    public static void main(String[] args)
    {
        // TEST CODE FOR METHOD 1: totalElements
        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(totalElements(testArr1));
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(totalElements(testArr2));
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(totalElements(testArr3));
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(totalElements(testArr4));
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(totalElements(testArr5));
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(totalElements(testArr6));
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        System.out.println(totalElements(testArr7));
        int[][] testArr8 = {{4}};
        System.out.println(totalElements(testArr8));

        System.out.println();

        // TEST CODE FOR METHOD 2: fourCorners
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        fourCorners(words);
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        fourCorners(words2);
        System.out.println("--------------");

        String[][] words3 = {{"time"}};
        fourCorners(words3);
    }

    // Write the totalElementsmethod below to RETURN the total
    // number of elements contained in the 2D numArray,
    // i.e. the row count multiplied by the column count.
    public static int totalElements(int[][] numArray)
    {
         int rows= numArray.length;
         int col= numArray[0].length;
         return rows* col;
    }

    // Write the fourCorners below to print out the elements
    // in each of the four corners of strArray, one per line:
    // top left, then top right, then bottom left, then bottom right
    public static void fourCorners(String[][] strArray)
    {
        int rows= strArray.length;
        int colons= strArray[0].length;
        System.out.println(strArray[0][0]);
        System.out.println(strArray[0][colons-1]);
        System.out.println(strArray[rows-1][0]);
        System.out.println(strArray[rows-1][colons-1]);


    }
    public static String  columnDuplicates(int [][] arr){
        int num=0;
        boolean k =false;
        for (int f=0; f<arr[0].length; f++){
            for (int s=0; s< arr.length; s++){
                int ge=arr[s][f];
                for (int d=s+1;d< arr.length; d++) {
                    if (ge == arr[d][f]) {
                        num++;
                        k= true;
                    }
                }
            }

        }
        return  k+ ": Because, there are "+ num+ " duplicates in the 2d array";
    }


}

