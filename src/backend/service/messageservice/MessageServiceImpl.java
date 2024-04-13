package src.backend.service.messageservice;

import src.backend.model.message.Message;

import java.util.List;

public class MessageServiceImpl implements MessageService{
    @Override
    public boolean add(Message message) {
        return false;
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
