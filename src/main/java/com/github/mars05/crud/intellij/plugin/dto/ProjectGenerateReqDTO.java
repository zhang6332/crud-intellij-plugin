package com.github.mars05.crud.intellij.plugin.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ProjectGenerateReqDTO {

    private Long ptId;

    private String projectName;

    private String basePackage;

    private String groupId;
    private String artifactId;
    private String version;

    private String ddl;

    private Long dsId;
    private String database;
    private String schema;
    private List<String> tables;

}
