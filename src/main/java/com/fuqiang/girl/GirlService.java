package com.fuqiang.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository repository;

    @Transactional
    public void insertTwo(){
        Girl girl1 = new Girl();
        girl1.setAge(22);
        girl1.setCupSize("A");
        repository.save(girl1);

        Girl girl2 = new Girl();
        girl2.setAge(26);
        girl2.setCupSize("BBB");
        repository.save(girl2);

    }
}
