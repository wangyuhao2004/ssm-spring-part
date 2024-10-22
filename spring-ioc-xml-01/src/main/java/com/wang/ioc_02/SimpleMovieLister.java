package com.wang.ioc_02;

/**
 * @Author 王玉豪
 * @Date 2024/10/13 14:44
 * @PackAgeName:com.wang.ioc_02
 */
public class SimpleMovieLister {

    private MovieFinder movieFinder;
    private String movieName;

    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
