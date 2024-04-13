package src.backend.service.baseservice;

import src.backend.model.basemodel.BaseModel;

import java.util.List;

public interface BaseService <T extends BaseModel>{
    boolean add(T t);

    boolean delete(T t);

    T get(String id);

    List<T> getList();
}
