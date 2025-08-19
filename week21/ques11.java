static int staticVar; 
    // Static variable without initialization
    public static void main(String[] args) {
        System.out.println("Default value of static variable: " + staticVar); // Prints default value (0)
        
        staticVar = 100; // Assigning a value to the static variable
        System.out.println("Assigned value of static variable: " + staticVar); // Prints assigned value
    }
    
