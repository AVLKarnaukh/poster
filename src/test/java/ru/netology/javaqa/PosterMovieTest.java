package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.PosterMovie;


public class PosterMovieTest {
    @Test
    public void findAllTest() {
        PosterMovie post = new PosterMovie();
        post.addMovie("Форсаж");
        post.addMovie("Механик");
        post.addMovie("Профессионал");
        post.addMovie("Пассажиры");
        post.addMovie("Марсианин");

        String[] actual = post.findAll();
        String[] expected = {"Форсаж", "Механик", "Профессионал", "Пассажиры", "Марсианин"};
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void findLastTest() {
        PosterMovie post = new PosterMovie();
        post.addMovie("Форсаж");
        post.addMovie("Механик");
        post.addMovie("Профессионал");
        post.addMovie("Пассажиры");
        post.addMovie("Марсианин");

        String[] actual = post.findLast();
        String[] expected = {"Марсианин", "Пассажиры", "Профессионал", "Механик", "Форсаж"};
        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void findLastTestMin() {
        PosterMovie post = new PosterMovie();
        post.addMovie("Форсаж");
        post.addMovie("Механик");
        post.addMovie("Профессионал");
        post.addMovie("Пассажиры");


        String[] actual = post.findLast();
        String[] expected = {"Пассажиры", "Профессионал", "Механик", "Форсаж"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastTestMax() {
        PosterMovie post = new PosterMovie();
        post.addMovie("Форсаж");
        post.addMovie("Механик");
        post.addMovie("Профессионал");
        post.addMovie("Пассажиры");
        post.addMovie("Марсианин");
        post.addMovie("Матрица");


        String[] actual = post.findLast();
        String[] expected = {"Матрица", "Марсианин", "Пассажиры", "Профессионал", "Механик"};
        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void findLastTestLimit() {
        PosterMovie post = new PosterMovie(5);
        post.addMovie("Форсаж");
        post.addMovie("Механик");
        post.addMovie("Профессионал");
        post.addMovie("Пассажиры");
        post.addMovie("Марсианин");
        post.addMovie("Матрица");

        String[] actual = post.findLast();
        String[] expected = {"Матрица", "Марсианин", "Пассажиры", "Профессионал", "Механик"};
        Assertions.assertArrayEquals(actual, expected);

    }


}
