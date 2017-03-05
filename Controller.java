package MVCPatternProgramm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Controller {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = reader.readLine();
            Model.add(str);
            View.respond(Model.names, Model.ordinalWords);
        }
    }
}
