package Exam1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class Phone {
    public Phone() {
        mapp.put("A","2");
        mapp.put("B","22");
        mapp.put("C","222");
        mapp.put("D","3");
        mapp.put("E","33");
        mapp.put("F","333");
        mapp.put("G","4");
        mapp.put("H","44");
        mapp.put("I","444");
        mapp.put("J","5");
        mapp.put("K","55");
        mapp.put("L","555");
        mapp.put("M","6");
        mapp.put("N","66");
        mapp.put("O","666");
        mapp.put("P","7");
        mapp.put("Q","77");
        mapp.put("R","777");
        mapp.put("S","7777");
        mapp.put("T","8");
        mapp.put("U","88");
        mapp.put("V","888");
        mapp.put("W","9");
        mapp.put("X","99");
        mapp.put("Y","999");
        mapp.put("Z","9999");
    }

    private static  Map<String, String> mapp = new HashMap<>();
    private static String fromMapp (String letter){
        return mapp.getOrDefault(letter,"");
    }
    public static String translate(String word){
        String lowerCaseWord = word.toUpperCase(Locale.ROOT);

        StringBuilder result = new StringBuilder();
        if(Objects.nonNull(word)){
            for(int i = 0;i< lowerCaseWord.length();i++){
                String letter = String.valueOf(lowerCaseWord.charAt(i));
                result.append(fromMapp(letter));
            }
        }
        return result.toString();
    }

}
