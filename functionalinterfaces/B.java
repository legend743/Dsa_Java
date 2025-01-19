package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class B {
    public static void main(String[] args) {
        Function<Integer,Integer> demoFunction=x->x+4;
        System.out.println(demoFunction.apply(7));
        Function<String,Integer>lengthOfString=str->str.length();
        System.out.println(lengthOfString.apply("Engineer faisal"));

        Function<String,String>startLeeters=str1->str1.substring(0,3);
        System.out.println(startLeeters.apply("Fai"));
        Function<List<Student>,List<Student>>filterdStudent=li->{
            List<Student>result=new ArrayList<>();
            for (Student s:li){
               if(startLeeters.apply(s.getName()).equalsIgnoreCase("Fai")){
                    result.add(s);
               }
            }
            return result;
        };

        Student s1=new Student(1,"Faisal");
       Student s2=new Student(2,"Faizan");
       Student s3=new Student(3,"Faiz");
       Student s4=new Student(4,"Fayyaz");
       List<Student>li=new ArrayList<>();
       li.add(s1);
       li.add(s2);
        li.add(s3);
        li.add(s4);
List<Student>filterstudent=filterdStudent.apply(li);
        System.out.println(filterstudent);

    }

    public static class Student{
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
