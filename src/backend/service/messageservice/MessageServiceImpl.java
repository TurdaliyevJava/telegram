package src.backend.service.messageservice;

import src.backend.model.message.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageServiceImpl implements MessageService{
    private static List<Message> messages;
    public MessageServiceImpl() {
        messages = new ArrayList<>();
    }

    @Override
    public boolean add(Message message) {
        messages.add(message);
        return true;
    }

    @Override
    public boolean delete(Message message) {
        return false;
    }

    @Override
    public Message get(String id) {
        return null;
    }

    @Override
    public List<Message> getList() {
        return List.of();
    }
}
