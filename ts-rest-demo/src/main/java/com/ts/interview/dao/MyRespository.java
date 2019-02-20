package com.ts.interview.dao;

import com.ts.interview.model.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyRespository extends JpaRepository<MyEntity, Integer> {

    List<MyEntity> finMyEntities(String name);
    MyEntity save(MyEntity entity);

}
