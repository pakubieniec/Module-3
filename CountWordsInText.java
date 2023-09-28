
import java.util.HashMap;

//Liczenie słów w tekście: Napisz metodę, która przyjmując String, zwróci HashMapę, 
//w której kluczem jest słowo, a wartością ilość wystąpień w tekście:
//public HashMap<String, Integer> countWords(String text)
//Jako tekst wykorzystaj wygenerowany tekst z https://www.lipsum.com/ 
public class CountWordsInText {
   
    public static String countWordInText(String str){
        for(int i =0; i < str.length() ; i++){
        System.out.println(str.charAt(i) + " ");
               
    }
        HashMap<String, Integer> words = new HashMap<>();
            words.put("Helllo", 23);
        
                
        return "";
    }
}
