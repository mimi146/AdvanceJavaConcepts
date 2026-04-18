# AGENTS.md

## Project snapshot
- Small IntelliJ IDEA Java 17 practice project; `src/` is the only source root (`AdvanceJavaConcepts.iml`, `.idea/misc.xml`).
- There is no Maven/Gradle build file here, so work with plain `javac`/`java` or IntelliJ run configurations.

## Source map
- `src/Main.java` is a default-package demo entry point that prints a greeting and a loop.
- `src/Threads/Addition.java` implements `Runnable` and prints the sum of two `Integer` values in `run()`.
- `src/Threads/clients.java` is a second entry point under package `Threads`; it starts one `Thread` from `Addition` and one anonymous `Runnable`.
- `src/Lamdas/` currently exists as an empty folder, so do not assume any lambda examples are implemented there yet.

## Conventions to preserve
- Keep package declarations aligned with folders; this repo uses the capitalized package name `Threads`.
- Preserve the current class naming even when it looks unusual: `clients` is intentionally lowercase in the existing code.
- The codebase is intentionally minimal and console-driven, so prefer direct examples over framework abstractions.

## Build and run
- JDK target is 17 (`.idea/misc.xml` references `corretto-17`).
- From the repo root, compile with:
  ```bash
  mkdir -p out && javac -d out src/Main.java src/Threads/*.java
  ```
- Run the demos with:
  ```bash
  java -cp out Main
  java -cp out Threads.clients
  ```

## Repository hygiene
- Do not edit generated output such as `out/` or IDE metadata in `.idea/` unless the task is specifically about project configuration.
- `.gitignore` already excludes `out/`, `.vscode/`, `.DS_Store`, and other IDE build artifacts.
