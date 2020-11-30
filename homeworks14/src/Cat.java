public class Cat {
    String name;
    int age;
    String owner;

    public Cat(){}

    public Cat (String name, int age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void setAge(int age){
        if(age <= 0){
            System.out.println("Age can't be less than 0");
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }




}

