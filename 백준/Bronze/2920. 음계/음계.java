import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String[] originArr = br.readLine().split(" ");

        String[] ascArr = originArr.clone();
        Arrays.sort(ascArr);

        String[] descArr = ascArr.clone();
        Arrays.sort(descArr, Collections.reverseOrder());

        if (Arrays.equals(originArr, ascArr)) {
            System.out.println("ascending");
        } else if (Arrays.equals(originArr, descArr)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}