/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Patty
 */
public class Student implements Comparable<Student>{
    int age;
    int height;
    String name;
    String lastName;
    
    Student(int age, int height, String name, String lastName){
        this.age = age;
        this.height = height;
        this.name = name;
        this.lastName = lastName;
      }

    @Override
    public int compareTo(Student o) {
        System.out.println(this.name.compareTo(o.name));
        if(this.name.compareTo(o.name) != 0){
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }
 
    @Override
public String toString()
{
    //You should populate this string with the data 
    //you need inside the TextView
    return this.name + " " + this.age;
}
    }

//Sortowanie listy: Zaimplementuj klasę Student z polami: age, height, name, lastName. 
//Zaimplementuj interfejs Comparable, w taki sposób, aby głównym kryterium było 
//nazwisko, drugim wiek. Stwórz listę 5 obiektów i użyj metody sort.
