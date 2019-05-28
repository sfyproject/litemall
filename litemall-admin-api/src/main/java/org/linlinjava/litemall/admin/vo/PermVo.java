package org.linlinjava.litemall.admin.vo;

import java.util.List;

/**
 * 列表层级
 * @Date: 2019-5-27  17:32
 * @Params: PermVo.java
 * @Author: sunfy
 */
public class PermVo {
    private String id;
    // 分类（标签）
    private String label;
    private String api;
    // 子目录
    private List<PermVo> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getApi() {
        return api;
    }

    public List<PermVo> getChildren() {
        return children;
    }

    public void setChildren(List<PermVo> children) {
        this.children = children;
    }

}
