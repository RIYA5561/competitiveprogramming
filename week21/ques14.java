public class student{
int num; // Class variable
        void setNum(int num) {
            this.num = num; // Using 'this' to differentiate between class variable and parameter

        }
        void displayNum() {
            System.out.println("Value of num: " + num); // Print the value of class variable
        }
        public static void main(String[] args) {
            user obj = new user();
            obj.setNum(25); // Setting the value of class variable using method
            obj.displayNum(); // Displaying the value of class variable
        }
        }
