package com.github.Anth0o0ny.lab5.collectionclasses;

public class Movie {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long oscarsCount; //Значение поля должно быть больше 0, Поле не может быть null
    private long budget; //Значение поля должно быть больше 0
    private String tagline; //Длина строки не должна быть больше 158, Поле может быть null
    private MpaaRating mpaaRating; //Поле может быть null
    private Person screenwriter;
}
