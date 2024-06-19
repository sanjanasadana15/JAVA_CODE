import java.util.Arrays;  //For the Array package 
public class arrays 
{
    public static void main(String[] args) 
    {
        int age = 30;
        int[] marks = new int[4];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        

        /*Length of the array */
        System.out.println(marks.length);

        /*Sort the array */
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        


        int[] marks2 = {68, 86, 67};

        /* Two dimensional array */

        int[][] finalMarks={{97,98,96},{95,98,98}};

        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[1][1]);


    

    }
    
}
