package com.github.anth0o0ny.lab5.commands;

import com.github.anth0o0ny.lab5.baseclasses.Movie;
import com.github.anth0o0ny.lab5.patterncommands.Command;
import com.github.anth0o0ny.lab5.patterncommands.Invoker;

import java.util.Stack;

public class Exit implements Command {

    @Override
    public String execute(Invoker invoker, Stack<Movie> collection, String argument) {
        return null;
    }

    @Override
    public String getHelp() {
        return null;
    }
}
