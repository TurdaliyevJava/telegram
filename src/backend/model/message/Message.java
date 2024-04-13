package src.backend.model.message;

import src.backend.enums.MessageRole;
import src.backend.model.basemodel.BaseModel;

public class Message extends BaseModel {
    private String message;
    private MessageRole messageRole;
    private String userId;
    private String toId;

    public Message(String message, MessageRole messageRole, String userId, String toId) {
        this.message = message;
        this.messageRole = messageRole;
        this.userId = userId;
        this.toId = toId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageRole getMessageRole() {
        return messageRole;
    }

    public void setMessageRole(MessageRole messageRole) {
        this.messageRole = messageRole;
    }

    public String getUserId() {
        return userId;
    }



    public String getToId() {
        return toId;
    }

    @Override
    public String toString() {
        return message;
    }
}
