package shu.java.csky.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("school")
public class School {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer sid;

    /**
     * 学校名
     */
    private String sname;

    /**
     * 链接专业表的id
     */
    private Integer csid;

    /**
     * 链接导师id
     */
    private Integer tid;

    /**
     * 链接帖子id
     */
    private Integer aid;

    /**
     * 招生简章
     */
    private String recruitment;
}