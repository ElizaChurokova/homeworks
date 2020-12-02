public class Horse {
    int weight;
    int age;
    String color;
    char gender;
    String nickname;

    public Horse(){}

    public Horse(int weight, int age, String color, char gender, String nickname){
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.nickname = nickname;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
    public char getGender(){
        return gender;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public String getNickname(){
        return nickname;
    }
}
