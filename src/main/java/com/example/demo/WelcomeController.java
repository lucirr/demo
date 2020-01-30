package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String welcome(){
        return "index";
    }

    @RequestMapping("/search")
    @ResponseBody
    public List<Map> search(){
        List<Map> listTest = new ArrayList<Map>();

        Map<String, String> map = new HashMap<String, String>();
        map.put("id", "1");
        map.put("name", "Lorem");
        map.put("job", "ipsum");
        map.put("addr", "dolor");
        map.put("zip", "sit");

        listTest.add(map);

        map = new HashMap<String, String>();
        map.put("id", "2");
        map.put("name", "amet");
        map.put("job", "consectetur");
        map.put("addr", "adipiscing");
        map.put("zip", "elit");

        listTest.add(map);

        map = new HashMap<String, String>();
        map.put("id", "3");
        map.put("name", "Integer");
        map.put("job", "nec");
        map.put("addr", "odio");
        map.put("zip", "Praesent");

        listTest.add(map);

        return listTest;
    }
}
