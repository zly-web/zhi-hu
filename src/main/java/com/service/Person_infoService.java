package com.service;

import com.dao.Person_infoDao;
import com.entity.Person_info;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Person_infoService {
    @Resource
    Person_infoDao person_infoDao;
    public List<Person_info> findAll(){
        return person_infoDao.findAll();
    }
    public Person_info findById(Integer person_id){
        return person_infoDao.findById(person_id);
    }
    public int insert(Person_info person_info){
        return person_infoDao.insert(person_info);
    }
    public int update(Person_info person_info){
        return person_infoDao.updateByPrimaryKey(person_info);
    }
}
