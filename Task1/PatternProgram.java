package GenTask.Task1;
//6.Write a below pattern
//55555
//54444
//54333
//54322
//54321
public class PatternProgram {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            for (int k = 1; k < i; k++) {
                System.out.print(rows);
            }
            System.out.println();


        }

}
}
