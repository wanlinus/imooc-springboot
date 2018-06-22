package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 16:08
 */
public interface NoteRepository extends JpaRepository<Note, String> {
}
