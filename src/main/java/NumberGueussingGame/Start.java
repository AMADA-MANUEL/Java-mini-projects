package NumberGueussingGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args ){

        //This means every try has a different secret number 🤯
        //That makes the game impossible.
        for(int  i = 1 ; i <= 10; i ++ ){
            int random = (int)( Math.random()*100) + 1;
            //System.out.println(random);
            Scanner playerobj = new Scanner(System.in);
//You should create it once, not 10 times.
            System.out.println("Pick a number ");
            System.out.println("You have 10 tries to play this game");
            int playerans = Integer.parseInt(playerobj.nextLine());
            //ArrayList<Integer> attempt = new ArrayList<Integer>();

            if(playerans > random){
                System.out.println("Number too big");
            } else if (playerans < random) {
                System.out.println("Number too small");

            }
//wrong code ,



        }

    }



}
