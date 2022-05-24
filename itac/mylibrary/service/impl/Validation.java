package by.itac.mylibrary.service.impl;

import by.itac.mylibrary.entity.Book;

import java.time.Year;

public class Validation {

    public boolean validYearPublish(int year) {
        Year bookYear = Year.of(year);
        return !bookYear.isAfter(Year.now()) && !bookYear.isBefore(Year.of(731));
    }

    public boolean validId(int id) {
        return id > 0;
    }

    public boolean validNull(String parameter) {
        return parameter != null;
    }

    public boolean validBook(Book book) {
        if (book == null) {
            return false;
        } else if (!validId(book.getId())) {
            return false;
        } else if (!validYearPublish(book.getYearOfPublishing())) {
            return false;
        } else if (!validNull(book.getAuthor())) {
            return false;
        } else return validNull(book.getBookName());
    }
}