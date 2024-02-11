package com.dsjh.btd.dao;

import com.dsjh.btd.dto.DepartmentDTO;
import com.dsjh.btd.dto.ProfessorDTO;
import com.dsjh.btd.dto.SubjectDTO;
import com.dsjh.btd.dto.SubjectDetailDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainPageDAO {

    // 전공교과소개 목록
    public List<SubjectDTO> subjectList();

    // 전공교과소개 내용
    public SubjectDTO subjectContent(int sub_id);

    // 전공교과소개 - 키워드로 검색
    public List<SubjectDTO> findSubject(String searchString);

    // 교과과정
    public List<SubjectDetailDTO> subjectDetail();

    // 교과과정 - 키워드로 검색
    public List<SubjectDetailDTO> findSubDetail(String searchString);

    // 교수진 소개
    public List<ProfessorDTO> professorList();

}
