import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key? y/n");
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("y")){
            System.out.println("Are the battery terminals corroded? y/n");
            choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("y")) {
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
        }
        else{
            System.out.println("Does the car make a slicking noise? y/n");
                choice = scanner.nextLine();
                if(choice.equalsIgnoreCase("y")){
                    System.out.println("Replace the battery.");
                }
                else {
                    System.out.println("Does the car crank up but fail to start? y/n");
                    choice = scanner.nextLine();
                    if(choice.equalsIgnoreCase("y")){
                        System.out.println("Check spark plug connections.");
                    }
                    else{
                        System.out.println("Does the engine start and then die? y/n");
                        choice = scanner.nextLine();
                        if(choice.equalsIgnoreCase("y")){
                            System.out.println("Does you car have fuel injection? y/n");
                            choice = scanner.nextLine();
                            if(choice.equalsIgnoreCase("y")){
                                System.out.println("Get it in for service.");
                            }
                            else{
                                System.out.println("Check to ensure the choke is opening and closing");
                            }
                        }
                        else{
                            System.out.println("This should not be possible.");
                        }
                    }
                }
            }
        }

    }
