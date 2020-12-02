public class Sheep {
    int weight;
    int age;
    char gender;
    String nickname;

    public Sheep(){}

    public Sheep(int weight, int age, char gender, String nickname){
        this.weight = weight;
        this.age = age;
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
