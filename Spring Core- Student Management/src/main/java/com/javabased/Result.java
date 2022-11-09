package com.javabased;

public class Result {
    private int score;
    private int report;

    public Result() {
        super();
    }

    public Result(int score, int report) {
        this.score = score;
        this.report = report;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getReport() {
        return report;
    }

    public void setReport(int report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "Result{" +
                "score=" + score +
                ", report=" + report +
                '}';
    }
}
