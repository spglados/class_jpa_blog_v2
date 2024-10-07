package com.tenco.blog_v1.board;

import com.tenco.blog_v1.user.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Entity
@Table(name = "board_tb")
@Data
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 전략 db 위임
    private Integer id;
    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user; // 게시글 작성자 정보


    @Column(name = "created_at", insertable = false, updatable = true)
    private Timestamp createdAt;

    @Builder
    public  Board(Integer id, String title, String content, User user, Timestamp createdAt){
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
        this.createdAt = createdAt;
    }
}
