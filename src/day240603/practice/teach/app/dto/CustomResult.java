package day240603.practice.teach.app.dto;

public class CustomResult {
    private String title;
    private String url;
    private String createdAt;

    public CustomResult(String title, String url, String createdAt) {
        this.title = title;
        this.url = url;
        this.createdAt = createdAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "CustomResult{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
