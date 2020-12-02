public class Farm {
    String address;
    Cow[] cowList;
    Sheep[] sheepList;
    Horse[] horseList;
    String owner;

    public Farm(){}
    public Farm(String address, Cow[] cowList, Sheep[] sheepList, Horse[] horseList, String owner){
     this.address = address;
     this.cowList = cowList;
     this.sheepList = sheepList;
     this.horseList = horseList;
     this.owner = owner;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setCowList(Cow[] cowList){
        this.cowList = cowList;
    }
    public Cow[] getCowList(){
        return cowList;
    }

    public void setSheepList(Sheep[] sheepList){
        this.sheepList = sheepList;
    }
    public Sheep[] getSheepList(){
        return sheepList;
    }

    public void setHorseList(Horse[] horseList){
        this.horseList = horseList;
    }
    public Horse[] getHorseList(){
        return horseList;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }

}
