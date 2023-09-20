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
    }
}
