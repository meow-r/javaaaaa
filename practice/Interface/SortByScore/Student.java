package SortByScore;

public class Student implements Comparable<Student>{
    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other){
        return -this.score+other.score;
    }

    @Override
    public String toString(){
        return "Score: " + this.score + " Name: " + this.name;
    }
}
