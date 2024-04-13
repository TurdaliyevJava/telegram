package src.backend.model.group;

import src.backend.model.basemodel.BaseModel;

public class GroupByUser extends BaseModel {
    private String userId;
    private String groupId;
    private boolean admin;

    public GroupByUser(String userId, String groupId, boolean admin) {
        this.userId = userId;
        this.groupId = groupId;
        this.admin = admin;
    }

    public String getUserId() {
        return userId;
    }


    public String getGroupId() {
        return groupId;
    }


    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
