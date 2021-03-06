/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltwitterfeed;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author CCannon
 */
public class PersonalTwitterFeed {

    private static int MAX_NUMBER_TWEETS = 200;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tweets = new String[MAX_NUMBER_TWEETS];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your personal Twitter!");
        System.out.println("What's your name, tweeter?");
        String[] tweetTimes=new String[MAX_NUMBER_TWEETS];
        int n=0;
        
        String tweeterName = keyboard.nextLine();
        
        System.out.println("Nice to meet you " + tweeterName + "!");
        System.out.println("Enter your tweets and I will add them to your timeline!");
        
        int numTweets = 0;
        
        while(numTweets < (MAX_NUMBER_TWEETS - 1)) {
            newTweet(tweets, tweetTimes,numTweets,n, tweeterName);
            n++;
            numTweets++;
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            if(numTweets < (MAX_NUMBER_TWEETS - 1))
                System.out.println("Enter your next tweet:");
        }
        
        System.out.println("Your twitter feed is full");
    }
    public static String getCurrentTimeStamp(){
        String pattern = "yyyy-MM-dd HH:mm:ss";
SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

String date = simpleDateFormat.format(new Date());
return date;
    }
public static void newTweet(String[] timeline, String[] times, int nT, int n, String name){
    Scanner keyboard = new Scanner(System.in);
    timeline[nT] = keyboard.nextLine();
            times[n]=getCurrentTimeStamp();
             System.out.println(name + "'s Personal Twitter Feed:");
            for(int i = 0; i < nT; i++) {
                
                System.out.println("- " + timeline[i+1]+" "+times[i]);
            }
}
    
}
