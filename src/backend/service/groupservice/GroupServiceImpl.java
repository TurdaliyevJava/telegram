package src.backend.service.groupservice;

import src.backend.model.group.Group;

import java.util.List;

public class GroupServiceImpl implements GroupService{
    @Override
    public boolean add(Group group) {
        return false;
    }

    @Override
    public boolean delete(Group group) {
        return false;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public List<Group> getList() {
        return List.of();
    }
}
