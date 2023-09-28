
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class Module3 {
    public static void main(String[] args){
        
        int[] array = {2,5,8,12,35};
        int[] array2 = {4,8,123,45,90,12,67};
        SumArray a1 = new SumArray();
        System.out.println(a1.sumArray(array));
        System.out.println(a1.sumArray(array2));
        
        TodoList todo1 = new TodoList();
        todo1.add("I havt to cleaning my house");
        todo1.add("I have to walk for my dog");
        todo1.add("I have to study Java");
        todo1.add("I have cooking dinner");
        todo1.print();
        todo1.remove(2);
        todo1.print();
        
         
        //ZADANIE 3
       
        // Java Program to find the occurrence
// of words in a String using HashMap.

	
		// Declaring the String
		String str = "Alice is girl and Bob is boy is is";
		// Declaring a HashMap of <String, Integer>
		Map<String, Integer> hashMap = new HashMap<>();

		// Splitting the words of string
		// and storing them in the array.
		String[] words = str.split(" ");

		for (String word : words) {

			// Asking whether the HashMap contains the
			// key or not. Will return null if not.
			Integer integer = hashMap.get(word);

			if (integer == null)
				// Storing the word as key and its
				// occurrence as value in the HashMap.
				hashMap.put(word, 1);

			else {
				// Incrementing the value if the word
				// is already present in the HashMap.
				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);
                
                //Zadanie 4
                Student s1 = new Student(24, 189, "Marek", "Mickiewicz");
                Student s2 = new Student(21, 162, "Anna", "Kowalska");
                Student s3 = new Student(19, 173, "Genowefa", "Pigwa");
                Student s4 = new Student(25, 180, "Nikodem", "Dyzma");
                Student s5 = new Student(38, 193, "Adam", "Zagłoba");
                
                ArrayList studentsList = new ArrayList();
                studentsList.add(s1);
                studentsList.add(s2);
                studentsList.add(s3);
                studentsList.add(s4);
                studentsList.add(s5);
                
                Collections.sort(studentsList);
               
                for(Object s : studentsList){
                    System.out.println(s.toString());
                }
                
               
	}
}

        
       // countWordInText(str);
       
//        System.out.println(countWords("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut cursus nunc velit, vitae cursus libero tempus et. Maecenas euismod metus lorem, ut tincidunt justo placerat ut. Donec nec lacus sed eros maximus blandit ut et est. Ut hendrerit lectus tristique lobortis convallis. Proin faucibus tincidunt ante, a accumsan lacus lacinia eu. Nulla cursus nisl nec nunc accumsan, quis tincidunt nulla iaculis. Sed nulla arcu, ullamcorper vel varius vitae, vehicula sit amet augue. Duis pulvinar, dui rutrum malesuada lacinia, tortor arcu pretium dolor, in iaculis dolor mi at ipsum. Pellentesque nibh felis, pellentesque posuere fringilla ut, ornare eget metus. Sed blandit condimentum felis a suscipit. Phasellus sit amet sem laoreet, feugiat nisi nec, viverra mi. Proin ornare fringilla enim, ac tempus purus consequat eu. Nam placerat elit quis nisi pellentesque rutrum."));
    
    
//    public static String countWordInText(String str){
//       
//        for(int i =0; i < str.length() ; i++){
//        System.out.println(str.charAt(i) + " ");
//           
//            
//            
//            
//    }
//        return null;
//    }
//  
//       public static int countWords(String s){
//
//    int wordCount = 0;
//
//    boolean word = false;
//    int endOfLine = s.length() - 1;
//String str = null;
//     HashMap<String, Integer> words = new HashMap<>();
//     
//    for (int i = 0; i < s.length(); i++) {
//        // if the char is a letter, word = true.
//        if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
//            word = true;
//            // if char isn't a letter and there have been letters before,
//            // counter goes up.
//        } else if (!Character.isLetter(s.charAt(i)) && word) {
//            wordCount++;
//            word = false;
//            // last word of String; if it doesn't end with a non letter, it
//            // wouldn't count without this.
//        } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
//            wordCount++;
//            words.put(str, i);
//            for(String key : words.keySet()){
//                System.out.println(words.get(key));
//            }
//            
//        }
//    }
//  
//    return wordCount;
//}
    