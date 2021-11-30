import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %1$s. Lovely to see you", name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %1$tb %1$td, %1$tY", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") >= 0){
            return "Oh yes, right away, sir. Alexis won't be able able to keep up!";
        } else if (conversation.indexOf("Alfred") > 0){
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

