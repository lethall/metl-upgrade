# Prototype Metl

This prototype is a testbed for techniques to be applied to the [Metl project](https://github.com/JumpMind/metl).

## Scope

No new features, and only enough features will be carried from the main Metl project to assure that all of the supporting technology questions have been answered and that adequate techniques for using them are being applied.

### Features

1. Initialization and configuration
2. Main window and navigation (using Router)
3. Plugin maintenance
4. Flow execution
5. Security

## Supporting Technologies

1. Java 17 (target Java 11 binary)
2. Gradle 7.6
3. Vaadin 23.3.0
4. Spring Boot 2.7.6 (not 3.0 due to requiring Vaadin 24)

## Techniques

- Simplify dependencies using Spring
- Follow JumpMind conventions
- Unit tests for services
- Integration tests for UI
