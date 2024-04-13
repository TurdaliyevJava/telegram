package src.backend.model.group;

import src.backend.enums.MessageRole;
import src.backend.model.basemodel.BaseModel;

public class Group extends BaseModel {
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
