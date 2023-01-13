package ru.netology.domain.afisha;

import java.util.Arrays;
import java.util.Collections;

public class MovieManager {
    private MovieData[] movies = new MovieData[0];
    private int countMovies = 10;//счетчик кол-ва выводимых фильмов для метода findLast

    public MovieManager() {
    }

    public MovieManager(int countMovies) {
        this.countMovies = countMovies;
    }

    public MovieData[] getMovies() {
        return movies;
    }

    public void setMovies(MovieData[] movies) {
        this.movies = movies;
    }

    public int getCountMovies() {
        return countMovies;
    }

    public void setCountMovies(int countMovies) {
        this.countMovies = countMovies;
    }

    //добавление фильма в конец массива
    public void add(MovieData movie) {
        MovieData[] tmp = new MovieData[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movie;
        movies = tmp;
    }

    //вывод всех фильмов в порядке добавления
    public void findAll() {
        getMovies();
    }

    //вывод {count} последних фильмов
    public void findLast(int count) {
        Collections.reverse(Arrays.asList(movies));
        movies = Arrays.copyOfRange(movies, 0, count);
    }
}