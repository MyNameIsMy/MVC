package MVCPatternProgramm;
import java.util.ArrayList;

class View {
    protected static void respond(ArrayList<String> array1, ArrayList<String> array2){
        for(String s : array1){
            System.out.print(s + ", ");
        }
        System.out.println();
        for(String s : array2){
            System.out.print(s + ", ");
        }
        System.out.println();
    }
}
