package what.ever.sevice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import what.ever.dao.WhatEverDao;

@Service
public class WhatEverService {
    
    @Autowired
    private WhatEverDao whatEverDao;
    
    public WhatEverService() {
	//default Constructor
    }
    
    public Map<String, Object> selectTblInfo(){
	Map<String, Object> resultMap = new HashMap<String, Object>();
	List<Object> info = whatEverDao.selectTblInfo();
	resultMap.put("info", info);
	
	return resultMap;
    }
}
