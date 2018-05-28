package main.java.interview.designpatterns;

public class SingletonPatternBasic {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private static SingletonPatternBasic INSTANCE;

    public static SingletonPatternBasic getInstance() {
        if (INSTANCE == null)
            return new SingletonPatternBasic();
        else
            return INSTANCE;
    }

    private SingletonPatternBasic() {
    }

    public void displayMessage() {
        System.out.println("Basic message is " + message);
    }


}
