import java.util.*;
public class Task_1 {
    //Function to find minimum value
    public int min(int grades[]) {
        int min = grades[0];
        for (int i = 0;i<grades.length;i++){
            if (min > grades[i]) {
               min=grades[i];
                System.out.println (min+" is lowest");
            }
        }
        return min;
    }
    public int max(int grades[]) {
        int max = grades[0];
        for (int i = 0;i<grades.length;i++){
            if (max < grades[i]) {
                max=grades[i];
                System.out.println (max+" is highest");
            }
        }
        return max;
    }
    public static void main(String args[]) {
      Scanner sc= new Scanner (System.in);
        System.out.print ("Enter the list size:-");
      int size=sc.nextInt ();
      int mygrades[]=new int[size];

      //Input from user
        for (int i=0;i<size;i++){
            System.out.print ("Enter the grades in list at position:-["+(i+1)+"]: ");
            mygrades[i]=sc.nextInt ();
            if (i==0){
                System.out.println ("Maths:-"+mygrades[i]);
            } else if (i==1) {
                System.out.println ("Science:-"+mygrades[i]);
            } else if (i==2) {
                System.out.println ("English:-"+mygrades[i]);
            }

        }
        int mygradeSum=0;

        //Output
        for (int i=0;i<size;i++){

            mygradeSum+=mygrades[i];
        }
        int mygradeAvg=mygradeSum/mygrades.length;
        System.out.println ("The grade average is: "+mygradeAvg);
        Task_1 mm=new Task_1 ();
        mm.max (mygrades);
        mm.min (mygrades);
    }
}
