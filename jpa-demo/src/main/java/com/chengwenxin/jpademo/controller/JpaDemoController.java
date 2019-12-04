package com.chengwenxin.jpademo.controller;

import com.chengwenxin.jpademo.model.dto.Query;
import com.chengwenxin.jpademo.model.entity.User;
import com.chengwenxin.jpademo.repository.UserRepository;
import com.chengwenxin.jpademo.service.JpaDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class JpaDemoController {
    @Autowired
    private JpaDemoService jpaDemoService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<User> findAll() {
        return jpaDemoService.findAll();
    }

    @GetMapping("/user")
    public User findUser(@RequestParam(name = "id") Long id) {
        return userRepository.findUserById(id);
    }

    @PostMapping("/getlist")
    public Map<String, Object> getList(@RequestBody Query query) {
        Map resultMap = jpaDemoService.getList(query);
        return resultMap;
    }

}
