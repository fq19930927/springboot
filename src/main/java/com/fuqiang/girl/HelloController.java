package com.fuqiang.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

  /*  @Value("${cupSize}")
    private String size;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return age + ":" + size + content;
    }*/

    @RequestMapping(value = "/girl", method = RequestMethod.GET)
    public String girl(@RequestParam(value = "id", defaultValue = "100") Integer myId) {
//        return girlProperties.getCupSize() + ":" + girlProperties.getAge();
        return "myId: " + myId;
    }
}
