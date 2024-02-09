package Lesson21.SocialNetwork;

import java.util.Objects;

public class VedioData {
    private String title;
    private String description;
    private int likeCount;
    private int dislikeCount;

    public VedioData(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public int getDislikeCount() {
        return dislikeCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount += likeCount;

    }

    public void setDislikeCount(int dislikeCount) {
        this.dislikeCount += dislikeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VedioData vedioData = (VedioData) o;
        return  Objects.equals(title, vedioData.title) && Objects.equals(description, vedioData.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description);
    }

    @Override
    public String toString() {
        return "VedioData{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", likeCount=" + likeCount +
                ", dislikeCount=" + dislikeCount +
                '}';
    }
}
