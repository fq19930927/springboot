package com.fuqiang.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlService service;

    @Autowired
    private GirlRepository repository;

    @RequestMapping(value = "/getGirl", method = RequestMethod.GET)
    public List<Girl> getGirls() {
        return repository.findAll();
    }

    /**
     * 添加一个女生信息
     *
     * @param age
     * @param cupSize
     * @return
     */
    @RequestMapping(value = "/girls", method = RequestMethod.POST)
    public Girl addGirl(@RequestParam(value = "age") Integer age, @RequestParam(value = "cupSize") String cupSize) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return repository.save(girl);
    }

    /**
     * 根据id修改女生信息
     *
     * @param id
     * @param age
     * @param cupSize
     * @return
     */
    @PutMapping(value = "/update/{id}")
    public Girl update(@PathVariable(value = "id") Integer id,
                       @RequestParam(value = "age") Integer age,
                       @RequestParam(value = "cupSize") String cupSize
    ) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return repository.save(girl);
    }

    /**
     * 删除一个女生信息
     *
     * @param id
     */
    @DeleteMapping(value = "/delete/{id}")
    public void deleteGirl(@PathVariable(value = "id") Integer id) {
        repository.delete(id);
    }

    /**
     * 根据年龄查询女生信息
     *
     * @param age
     * @return
     */
    @GetMapping(value = "/age/{age}")
    public List<Girl> findByAge(@PathVariable(value = "age") Integer age) {
        return repository.findByAge(age);
    }

    /**
     * 插入2个女生信息
     */
    @PostMapping(value = "insertTwo")
    public void insertTwo(){
        service.insertTwo();
    }
}
