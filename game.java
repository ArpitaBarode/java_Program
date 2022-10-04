import java.util.Scanner;
import java.util.Random;
public class game {
        public static void main(String[] args) {
            System.out.println("Welcome to my rock,papper,scissorgame\n");
            Scanner sc=new Scanner(System.in);
            Random rand=new Random();
            System.out.println("\n1 means rock\n 2 means papper\n 3 means scissor\n");
            System.out.println("please enter how many times you want to play this game:");
            int num=sc.nextInt();
            System.out.println("ohh so you want to play this game "+num+ "times okay ...best of luck:) ");
            for(int i=1;i<=num;i++){
                int computer_choice=rand.nextInt(3)+1;
                // int person_choice=sc.nextInt();
                System.out.println("please enter your choice:");
                int person_choice=sc.nextInt();
                System.out.println("computer's choice:"+computer_choice);
                if(computer_choice==1){
                    if(person_choice==1){
                        System.out.println("game is tie!");
                    }
                    else if(person_choice==2){
                        System.out.println("you won");
                    }
                    else if(person_choice==3){
                        System.out.println("you lost");
                    }
                }
                else if(computer_choice==2){
                    if(person_choice==1){
                        System.out.println("you lost");
                    }
                    else if(person_choice==2){
                        System.out.println("game is tie");
                    }
                    else if(person_choice==3){
                        System.out.println("you won");
                    }
                }
                else if(computer_choice==3) {
                    if(person_choice==1){
                        System.out.println("you won");
                    }
                    else if(person_choice==2){
                        System.out.println("you lost");
                    }
                    else if(person_choice==3){
                        System.out.println("game is tie");
                    }
                }

            }
        }
    }

