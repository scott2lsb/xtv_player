package com.kankan.player.dao.model;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table VIDEO.
 */
public class video {

    /** Not-null value. */
    private String filePath;
    private String fileName;
    private Integer width;
    private Integer height;
    private Integer duration;
    private Integer progress;
    private String thumbnailPath;
    private long scanTime;
    private String deviceName;
    private Integer deviceType;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public video() {
    }

    public video(String filePath, String fileName, Integer width, Integer height, Integer duration, Integer progress, String thumbnailPath, long scanTime, String deviceName, Integer deviceType) {
        this.filePath = filePath;
        this.fileName = fileName;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.progress = progress;
        this.thumbnailPath = thumbnailPath;
        this.scanTime = scanTime;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
    }

    /** Not-null value. */
    public String getFilePath() {
        return filePath;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getThumbnailPath() {
        return thumbnailPath;
    }

    public void setThumbnailPath(String thumbnailPath) {
        this.thumbnailPath = thumbnailPath;
    }

    public long getScanTime() {
        return scanTime;
    }

    public void setScanTime(long scanTime) {
        this.scanTime = scanTime;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
