package firstLessonExersise;

import java.util.Scanner;

public class loggin_05 {
    public static void main (String [] arg){

        Scanner scanner=new Scanner(System.in);

        String username= scanner.nextLine();
        String password= "";

        for (int position =username.length()-1 ; position >=0 ; position--){
            char currentSybol= username.charAt(position);
            password +=currentSybol;
        }

        String currentPassword=scanner.nextLine();
        int countFailedPassword=0;
        while (!currentPassword.equals("password")){
            countFailedPassword++;
            if(countFailedPassword==4){
                System.out.printf("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            currentPassword= scanner.nextLine();
        }
        if (currentPassword.equals("password")) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
