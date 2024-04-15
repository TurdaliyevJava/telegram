package src.backend.service.chatservice;

import src.backend.model.chat.Chat;
import src.backend.service.baseservice.BaseService;

import java.util.List;

public interface ChatService extends BaseService<Chat> {
    List<Chat> getChaTList();
}
