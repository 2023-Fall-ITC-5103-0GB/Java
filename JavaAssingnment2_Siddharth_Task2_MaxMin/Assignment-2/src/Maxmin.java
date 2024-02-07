
//Creating a functional interface for the class
@FunctionalInterface
interface ArrayProcessor {
    double apply(double[] array);
}

public class Maxmin {

// creating a public static final interface of type ArrayProcessor and calling it Max
    // using the lambda expression which takes array as the parameter of type double
    // in the expression we are writing the logic to find the max of a number
    public static final ArrayProcessor Max = (array) ->
    {
        double max = array[0];

        for(double i : array)
        {
              if(i > max)
              {
                  max =i;
              }
        }
         return max;
    };



    public static final ArrayProcessor Min = (array) ->
    {
        double min = array[0];

        for(double i : array)
        {
            if(i < min)
            {
                min =i;
            }
        }
        return min;
    };

    public static void main(String[] args) {

        //Creating an array
        double [] numbers =    {10, 20.5,16, 33.5};


        System.out.println("Maximum Value" +Max.apply(numbers));
        System.out.println("Minimum Value" +Min.apply(numbers));


    }










}
