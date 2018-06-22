package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 13:54
 */
@Entity
@Table(name = "tb_answer")
public class Answer implements Serializable {

    @Id
    @Column(name = "asr_id")
    private String id;

    @Column(name = "asr_time")
    private Date time;

    @Column(name = "asr_content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "asr_qt_id", referencedColumnName = "qt_id")
    private Question question;

    public Answer() {
    }

    public Answer(String id, Date time, String content, Question question) {
        this.id = id;
        this.time = time;
        this.content = content;
        this.question = question;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", content='" + content + '\'' +
                ", question=" + question +
                '}';
    }
}
