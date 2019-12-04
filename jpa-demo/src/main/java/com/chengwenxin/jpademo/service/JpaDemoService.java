package com.chengwenxin.jpademo.service;

import com.chengwenxin.jpademo.model.dto.Query;
import com.chengwenxin.jpademo.model.entity.User;

import java.util.List;
import java.util.Map;

public interface JpaDemoService {
    List<User> findAll();

    Map<String,Object> getList(Query query);
}
