import javax.xml.crypto.Data;

public class ArrayProcessors {
    public static final ArrayProcessor AVERAGE = array -> {
        if (array.length == 0){
            return 0;
        }
        else{
            double ave = 0;
            for (double v : array) {
                ave += v;
            }
            return ave / array.length;
        }
    };
}
