import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName, password, newPassword, newUserName, messages;
        userName = "ayxan";
        password = "ayxan";


        Scanner input = new Scanner(System.in);
        System.out.print("user name: ");
        newUserName = input.next();
        System.out.print("password: ");
        newPassword = input.next();

        if (!(userName.equals(newUserName))){
            System.out.println("wrong userName");
        } else if ( !(password.equals(newPassword))) {
            System.out.println("wrong password");
            System.out.print("do you change password: ");
            messages = input.next();
            if (messages.equals("yes")){
                System.out.print("please enter  new password: ");
                newPassword = input.next();
                password = newPassword;
                System.out.print("new pasword"+ " " + password );
            } else {
                return;
            }

        } else{
            System.out.println("welcome");
        }








    }
}
