package src.backend.service.chatservice;

import src.backend.model.chat.Chat;

import java.util.List;

public class ChatServiceImpl implements ChatService{
    @Override
    public boolean add(Chat chat) {
        return false;
    }

    @Override
    public boolean delete(Chat chat) {
        return false;
    }

    @Override
    public Chat get(String id) {
        return null;
    }

    @Override
    public List<Chat> getList() {
        return List.of();
    }
}
