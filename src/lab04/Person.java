package lab04;

public class Person {
    private String name;
    private  int age;
    private char gender;
    public String getNAme()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public char getGender()
    {
        return gender;
    }
    public void setName(String n)
    { name = n;}
    public void setAge(int a)
    { age = a;}
    public void setName(char g)
    { gender = g;
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("hello , my name is "+ getNAme() + ".");
        if(getGender() == 'm'){
            result.append("I am a man and I am " + getAge() + " years old. ");
        }else{
            result.append("I am a woman and I am " + getAge() + " years old. ");
        }
        return result.toString();
    }
}
