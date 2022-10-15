package org.example.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.example.mybatis.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityDao {

    @Autowired
    private SqlSession sqlSession;

    public City selectCityById(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }
}
