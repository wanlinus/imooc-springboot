package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:01
 */
@Entity
@Table(name = "tb_study")
public class Study {
    @Id
    @Column(name = "sdy_id")
    private String id;

    @Column(name = "sty_code")
    private String code;

    @ManyToOne
    @JoinColumn(name = "sty_user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "sty_cs_id", referencedColumnName = "cs_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "sty_note_id", referencedColumnName = "note_id")
    private Note note;
}
