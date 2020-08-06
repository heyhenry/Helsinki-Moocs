package Part_6;

public class Message {

    private String senderName;
    private String content;

    public Message(String senderName, String content) {

        this.senderName = senderName;
        this.content = content;

    }

    public String getSenderName() {

        return senderName;

    }

    public String getContent() {

        return content;

    }

    public String toString() {

        return "Sender: " + senderName + ", Message: " + content;

    }

}
