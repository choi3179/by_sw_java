package day12.quiz01;

public class Video {
    private String title;
    private String category;
    private boolean lend;
    private String lendName;
    private String lendDate;

    public Video(String title, String category, boolean lend, String lendName, String lendDate) {
        this.title = title;
        this.category = category;
        this.lend = lend;
        this.lendName = lendName;
        this.lendDate = lendDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isLend() {
        return lend;
    }

    public void setLend(boolean lend) {
        this.lend = lend;
    }

    public String getLendName() {
        return lendName;
    }

    public void setLendName(String lendName) {
        this.lendName = lendName;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }
}
