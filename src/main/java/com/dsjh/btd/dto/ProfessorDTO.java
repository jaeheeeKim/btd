package com.dsjh.btd.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProfessorDTO {
    private int prof_id;
    private String prof_name;
    private String prof_img;
    private String prof_email;
    private String prof_tel;
    private String prof_education;
    private String prof_career;
    private int local_id;
    private int depart_id;
    private int subject_id;
    private String depart_name;  // 담당 학과
}
