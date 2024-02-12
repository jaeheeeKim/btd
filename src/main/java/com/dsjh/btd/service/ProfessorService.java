package com.dsjh.btd.service;

import com.dsjh.btd.dao.ProfessorDAO;
import com.dsjh.btd.dto.ProfessorDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService implements ProfessorDAO {
    private final SqlSessionTemplate sqlSession;

    public ProfessorService(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    // 교수 소개
    public List<ProfessorDTO> professorInfo(int prof_id) {
        return sqlSession.selectList("professorInfo", prof_id);
    }

}
