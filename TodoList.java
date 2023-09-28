
import java.util.ArrayList;

public class TodoList {
    private String task;
     ArrayList<String> tasks = new ArrayList();
   
        public TodoList(){
        this.task = task;
        this. tasks = tasks;
     }
    
    public void add(String task){
        tasks.add(task);
    }
    
    public void print(){
       int i = 0;
        for(String t : tasks){
            i++;
            System.out.println(i + ": " + t + " ");
        }
        System.out.println("-------------");
    }
    
    public void remove(int number){
        number -=1;
        tasks.remove(number);
    }
    
}
