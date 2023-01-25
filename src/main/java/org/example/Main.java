package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// docker run -p 5432:5432 --name some-postgres -e POSTGRES_PASSWORD=synpas -e POSTGRES_USER=syn -d postgres:alpine
// docker run -p 27017:27017 --name some-mongo -d mongo:tag