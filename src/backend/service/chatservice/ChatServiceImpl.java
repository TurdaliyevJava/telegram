package src.backend.service.chatservice;

import src.backend.model.chat.Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatServiceImpl implements ChatService{
    private static List<Chat> chats;
    public ChatServiceImpl() {
        chats = new ArrayList<>();
    }

    @Override
    public boolean add(Chat chat) {
        chats.add(chat);
        return true;
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

    @Override
    public List<Chat> getChaTList() {
        return chats;
    }
}
