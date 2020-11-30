public class Fish {
    String name;
    String color;
    int age;

    public Fish(){}

    public Fish(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setAge(int age){
        if (age <= 0){
            System.out.println("Age can't be less than 0");
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }


}

