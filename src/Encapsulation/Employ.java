package Encapsulation;

public class Employ {
    // 'age' is an instance variable (stored in HEAP inside the object)
    private int age;

    // Setter method to assign age
    public void setAge(int age)
    {
        // 'age' here is a LOCAL variable → stored in STACK
        if(age >= 18 && age <= 65)
        {
            System.out.println("Valid Age");
            this.age = age;   // 'this.age' refers to object's heap variable
        }
    }

    // Getter method to display age
    public void getAge(){
        System.out.println("Age is: " + age);
    }
}



/*
Real Code Written by me:

package Encapsulation;

public class Employ
{
    private int age;
        public void setAge(int age)
        {
            if(age >= 18 && age <= 65)
            {
                System.out.println("Valid Age");
                this.age = age;
                System.out.println("Employ age Set Successfully");
            }
        }

        public void getAge(){
            System.out.println("Age is:" + age);
        }
}

 */