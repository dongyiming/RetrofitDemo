package com.example.song_retrofit_ui.vo;

/**
 * @version : 1.0
 * @Description : 歌单
 * @autho : dongyiming
 * @data : 2017/5/27 14:17
 */
public class MenuInfo {

    public int id;
    public String creatorId;//创建者ID
    public String creatorName;//创建者名称
    public String menuId;//歌单ID
    public String menuName;//歌单名称
    public String menuDesc;//歌单描述
    public String headUrl;//歌单图片的网络路径
    public long playCount;//歌单播放量
    public long createTime;//创建时间
    public long updateTime;//更新时间
    public int type;//歌单类型  MenuType

    public long getPlayCount() {
        return playCount;
    }

    public void setPlayCount(long playCount) {
        this.playCount = playCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "id=" + id +
                ", creatorId='" + creatorId + '\'' +
                ", creatorName='" + creatorName + '\'' +
                ", menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuDesc='" + menuDesc + '\'' +
                ", headUrl='" + headUrl + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", type=" + type +
                '}';
    }
}
