package day14.io.file.object;

import java.io.Serializable;

public class Grade implements Serializable {    // 객체의 저장된 순서를 기억하기 위한 Serializable implements

    private String subject;
    private int score;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade [subject=" + subject + ", score= " + score + "]";
    }
}
