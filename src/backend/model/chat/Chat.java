package src.backend.model.chat;

import src.backend.model.basemodel.BaseModel;

public class Chat extends BaseModel {
    private final String firstUserId;
    private final String secondUserId;

    public Chat(String firstUserId, String secondUserId) {
        this.firstUserId = firstUserId;
        this.secondUserId = secondUserId;
    }

    public String getFirstUserId() {
        return firstUserId;
    }

    public String getSecondUserId() {
        return secondUserId;
    }
}
