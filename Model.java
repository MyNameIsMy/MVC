package MVCPatternProgramm;

import java.util.ArrayList;

class Model {
    static ArrayList<String> names = new ArrayList<>();

    static ArrayList<String> ordinalWords = new ArrayList<>();

    protected static void add(String s){
        char[] c = s.toCharArray();
        char[] bigS = {'А','Б','В','Г','Д',
                'Е','Ё','Ж','З','И',
                'Й','К','Л','М','Н',
                'О','П','Р','С','Т',
                'У','ф','Х','Ц','Ч',
                'Ш','Щ','Ъ','Ы','Ь',
                'Э','Ю','Я'};
        char[] smallS = {'а','б','в','г','д',
                'е','ё','ж','з','и',
                'й','к','л','м','н',
                'о','п','р','с','т',
                'у','ф','х','ц','ч',
                'ш','щ','ъ','ы','ь',
                'э','ю','я'};
        for (char c1 : bigS){
            if (c[0] == c1){
                names.add(s);
                return;
            }
        }
        for (char c1 : smallS){
            if (c[0] == c1){
                ordinalWords.add(s);
                return;
            }
        }
    }
}
