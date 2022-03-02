import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] seatingChart={{"Abby", "Don", "George", "Kim"},
                                 {"Brian","Elemor","Harry","Lenny"},
                                    {"Cathy","Fred","Jill","Matt"}};
        seatingChart[1][2]= "Paul";
        int [][] no=  {{0,1,2},{3,4,5},{8,9,6}};
        int [][] onr=  {{1,2,3},{9,2,0},{8,9,6}};
        int [][] two=  {{1,3,6},{3,4,6},{1,5,8}};
        int [][] one2=  {{1,2,3},{1,4,6}};

        for (int[] row: no){
            System.out.println( Arrays.toString(row));
        }
        System.out.println("Expected result is: false with 0 duplicates" );
        System.out.println("Actual result is "+ columnDuplicates(no));
        for (int[] row: onr){
            System.out.println( Arrays.toString(row));
        }
        System.out.println("Expected result is: true with 1 duplicates" );
        System.out.println("Actual result is "+ columnDuplicates(onr));
        for (int[] row: two){
            System.out.println( Arrays.toString(row));
        }
        System.out.println("Expected result is: true with 2 duplicates" );
        System.out.println("Actual result is "+ columnDuplicates(two));
        for (int[] row: one2){
            System.out.println( Arrays.toString(row));
        }
        System.out.println("Expected result is: true with 1 duplicates" );
        System.out.println("Actual result is "+ columnDuplicates(one2));



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


