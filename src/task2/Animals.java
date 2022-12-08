package task2;

public enum Animals { CAT(5), DOG(3), TIGER(2);
    public int age;
    Animals(int age){
        this.age = age;
    }

    public String toString(){
        return "Животное: " + super.toString() + " " + "возраст: " + age;
    }

}

