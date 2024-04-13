package src.backend.model.basemodel;

import java.util.UUID;

public abstract class BaseModel {
    private final String id;

    public BaseModel() {
        this.id = String.valueOf(UUID.randomUUID());
    }

    public String getId() {
        return id;
    }
}
