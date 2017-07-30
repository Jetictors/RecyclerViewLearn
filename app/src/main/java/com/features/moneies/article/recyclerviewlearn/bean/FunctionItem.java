package com.features.moneies.article.recyclerviewlearn.bean;

/**
 * 功能类的单个item对象
 * Created by loser's computer on 2017/7/30.
 */
public class FunctionItem {

    /**
     * 图标
     */
    private int resId;

    /**
     * 功能说明
     */
    private String text;

    public FunctionItem() {
    }

    public FunctionItem(int resId, String text) {
        this.resId = resId;
        this.text = text;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "FunctionItem{" +
                "resId=" + resId +
                ", text='" + text + '\'' +
                '}';
    }
}
