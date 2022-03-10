package com.github.mars05.crud.intellij.plugin.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class ProjectTemplateRespDTO {
    private Long id;
    private String name;
    private String description;
    private Integer projectType;
    public List<FileTemplateDTO> fileTemplateList;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Long createId;
    private String createName;
    private Long updateId;
    private String updateName;
    private Long organizationId;
    private String organizationName;
    private String accessToken;
    private Integer publicFlag;
}
