package com.example.eureka.eurekadiscovery.model;

import com.example.eureka.eurekadiscovery.constant.PostType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_post")
public class Post {

    private Long id;
    private Long postID;
    private Long userID;
    private List<String> commentIDs;
    private String postDescription;
    private PostType postType;

}
