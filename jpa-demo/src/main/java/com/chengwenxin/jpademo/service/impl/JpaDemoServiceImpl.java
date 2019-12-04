package com.chengwenxin.jpademo.service.impl;

import com.chengwenxin.jpademo.model.dto.Query;
import com.chengwenxin.jpademo.model.entity.User;
import com.chengwenxin.jpademo.repository.UserRepository;
import com.chengwenxin.jpademo.service.JpaDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JpaDemoServiceImpl implements JpaDemoService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll(){
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @Override
    public Map getList(Query query){
        Integer page = query.getPage().getCurrentPage();
        Integer pageSize = query.getPage().getPageSize();
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<User> result = userRepository.findUserByPage(pageable);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("data",result.getContent());
        resultMap.put("totalElements",result.getTotalElements());
        return resultMap;
    }
}
