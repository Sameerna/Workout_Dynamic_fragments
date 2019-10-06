package com.example.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts ={
            new Workout("The Limb loosener","5  Handstand push up\n10 1-legged squats\n15 pull-ups"),
            new Workout("Core agony","100 pull-ups\n100 push-ups\n 100 sit-ups\n 100 squats"),
            new Workout("Stength and length","500meters run\nswim 10 kms\n 52-pullups")
    };
    private Workout(String name, String description){
        this.name=name;
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public String toString(){
         return this.name;
    }
}
