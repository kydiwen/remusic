package com.wm.remusic.info;

/**
 * Created by wm on 2016/3/10.
 */
public class MainFragmentItem {
    private String title;   //信息标题
    private int count;
    private int avatar; //图片ID

    public String getTitle() {
        return title;
    }

    //标题
    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAvatar() {
        return avatar;
    }

    //图片
    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
