package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<String> outcomes = Arrays.asList("rock" ,"paper" , "scissor");
        Random random = new Random();
        int index = random.nextInt(outcomes.size());
        String randomoutcome = outcomes.get(index);
        //System.out.println(randomoutcome);

         Scanner playerobj = new Scanner(System.in);
        System.out.println("Rock ,Paper , Scissors ?");

        String playerans = playerobj.nextLine().toLowerCase();

        String again = "again";



        if (randomoutcome.equals(playerans)  ){
            System.out.println("draw");
        } else if (randomoutcome.equals("rock") && playerans.equals("paper") ){
            System.out.println("player wins");
        }
        else if (randomoutcome.equals("paper") && playerans.equals("rock")){
            System.out.println("bot wins");
        } else if (randomoutcome.equals("paper") && playerans.equals("scissor")) {
            System.out.println("player wins");
        } else if (randomoutcome.equals("scissor") && playerans.equals("paper")){
            System.out.println("bot wins");
        } else if (randomoutcome.equals("rock") && playerans.equals("scissor")) {
            System.out.println("player wins");
        }
        else if (randomoutcome.equals("scissor") && playerans.equals("rock")) {
            System.out.println("player wins");}







    }
}