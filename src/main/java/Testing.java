import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String args[]){
        String command = "C 20     4 5 6";
        String[] arr = command.split(" ");
        List<String> list = new ArrayList<String>();
        for (int i =0; i<arr.length; i++){
            String t =  arr[i].trim();
            if(t.isEmpty())
                continue;
            list.add(arr[i]);

        }
        String[] arraycommand = list.toArray(new String[0]);
        for(String a : arraycommand)
            System.out.println(a);
        char[][] array = new char[2][2];
        array[0][0] = '1';
        array[0][1] = '1';
        array[1][0] = '2';
        array[1][1] = '2';
        List<Character> lista = new ArrayList<>();
        for(int i=0; i<2; i++)
            for(int j=0;j<2;j++)
                lista.add(array[i][j]);

    }
}
