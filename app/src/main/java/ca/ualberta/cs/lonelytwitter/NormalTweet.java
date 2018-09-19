package ca.ualberta.cs.lonelytwitter;

/**
 * Created by mingyue2 on 9/18/18.
 */

public class NormalTweet extends Tweet{
    NormalTweet() {
        super();
    }
    NormalTweet(String message) { super(message);}

    @Override
    public Boolean isImportant() { return false;}
}
