public class Test {

    public static void main(String[] args) {
        double [] arr = {1, 3, 2.4, 8, 12, 15,5};

        double average = ArrayProcessors.AVERAGE.apply(arr);

        System.out.println(average);
    }
}
