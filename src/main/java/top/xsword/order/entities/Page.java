package top.xsword.order.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: ywx
 * Create Time: 2023/4/28
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page<T> {
    private Integer total;
    private T data;
    private Integer page;
    private Integer pers;
    private Boolean hasNext;

    public Page(Integer total, T data, Integer page, Integer pers) {
        int totalPage = total % pers == 0 ? total / pers : (total / pers) + 1;
        this.hasNext = page < totalPage;
        this.data = data;
        this.total = total;
        this.page = page;
        this.pers = pers;
    }
}
