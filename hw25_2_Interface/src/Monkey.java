public class Monkey implements ActingAsMonkey{
    private Climbable climbable;

    public void print(){
        System.out.println("Monkey carries on back: " + climbable);
    }

    @Override
        public void climb() {
         System.out.println("Monkey climbs in hill");
}

    @Override
        public void eatFruits(){
        System.out.println("Monkey eats eatable fruits");
    }

    @Override
        public void carryOnBack(){
        System.out.println("Monkey carries on back litle monkey");
    }


    public Climbable getClimbable() {
        return climbable;
    }

    public void setClimbable(Climbable climbable) {
        this.climbable = climbable;
    }
}

