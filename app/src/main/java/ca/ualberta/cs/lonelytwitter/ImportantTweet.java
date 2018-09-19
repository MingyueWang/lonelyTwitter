package ca.ualberta.cs.lonelytwitter;

/**
 * Created by mingyue2 on 9/18/18.
 */

public class ImportantTweet  extends Tweet{
    ImportantTweet() {
        super();

    }
    ImportantTweet(String message) {
        super(message);
    }
    public Boolean isImportant() {
        return true;
    }
}
