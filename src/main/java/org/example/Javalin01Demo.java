package org.example;

import io.javalin.Javalin;

public class Javalin01Demo {
    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7071);

        app.get("/", (ctx)-> {

                    ctx.status(200);
                    ctx.contentType("text/plain");
                    ctx.result("Hello World");


    });

        app.get("/json",ctx-> {
            ctx.status(200);
            ctx.contentType("application/json");
            ctx.json(new Message(200,"Return of the Jedi"));

        });

        app.get("html",ctx -> {
            ctx.html("<h1> BAck to the future/<h1>");

        });
        app.get("/render",ctx -> {
            ctx.render("index.jte");

        });
}}