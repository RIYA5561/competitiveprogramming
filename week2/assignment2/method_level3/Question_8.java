public class Question_8 {
  public static int generateOTP() {
    return 100000 + (int) (Math.random() * 900000);
  }

  public static boolean check(int[] otp) {
    for (int i = 0; i < otp.length; i++) {
      for (int j = i + 1; j < otp.length; j++) {
        if (otp[i] == otp[j]) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] otp = new int[10];

    for (int i = 0; i < otp.length; i++) {
      otp[i] = generateOTP();
    }
    System.out.println("Generated otp:");
    for (int i : otp) {
      System.out.println(i);
    }

    if (check(otp)) {
      System.out.println("All otp are unique");
    } else {
      System.out.println("Some otp are repeated");
    }
  }
}
