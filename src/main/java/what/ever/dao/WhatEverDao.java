package what.ever.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WhatEverDao {
    
    @Autowired
    private SqlSession sqlSession;
    
    public WhatEverDao() {
	//default Constructor
    }
    
    public List<Object> selectTblInfo(){
	List<Object> result = sqlSession.selectList("main.selectTblInfo");
	
	return result;
    }
}
