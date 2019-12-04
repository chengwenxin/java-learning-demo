package com.chengwenxin.jpademo.model.dto;

import java.util.Map;

public class Query {
    private Map<String,Object> matchFields;
    private Page page;
    private Sort sort;

    public Query() {
    }

    public Query(Map<String, Object> matchFields) {
        this.matchFields = matchFields;
    }

    public Query(Map<String, Object> matchFields, Page page) {
        this.matchFields = matchFields;
        this.page = page;
    }

    public Query(Map<String, Object> matchFields, Page page, Sort sort) {
        this.matchFields = matchFields;
        this.page = page;
        this.sort = sort;
    }

    public Map<String, Object> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(Map<String, Object> matchFields) {
        this.matchFields = matchFields;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}

