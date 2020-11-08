package com.ipear.web.training.controller;

import com.ipear.web.training.entity.User;
import com.ipear.web.training.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AjaxController {

    @Autowired
    UserRepository userRepository;

    static Map<String, String> chapter_name = new HashMap<>() {
        {
            put("1-1", "1.1 函数");
            put("1-2", "1.2 数列的极限");
            put("1-3", "1.3 函数的极限");
            put("1-4", "1.4 极限的存在法则");

            put("2-1", "导数的概念");
            put("2-2", "导数的求导法则");
            put("2-3", "高阶导数");
            put("2-4", "微分");
        }
    };

    @RequestMapping("/getChapterInfo/{chapter}")
    public Map<String, Object> getChapterInfo(@PathVariable String chapter) {
        Map<String,Object> map=new HashMap<>();
        map.put("chapter_name","123");
        map.put("problem_count",3);
        return map;
    }

    @RequestMapping("/testing")
    public String testing(){
        User user=new User();
        user.alias="123";
        user.password="456";
        user.sex=true;
        userRepository.save(user);

        return "123";
    }

}
