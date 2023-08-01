# Immutable Object Builder in Java
Functional Interfaces and Builder Patterns for Immutability

This repository showcases an approach to creating immutable objects in Java using a Builder pattern with a Functional interface. Immutable objects are those whose state cannot be changed once created. This makes them thread-safe and free from synchronization issues.

The project demonstrates the construction of a `House` object with various components such as `MainDoor`, `Terrace`, `Lobby`, `MainBedroom`, `GuestRoom` and `WashRoom`. Each of these components is constructed in an immutable manner and integrated into the `House` object.

## Setup

This is a Maven project and requires Java 17 to run. To set up the project, clone the repository and navigate to the project directory.

```bash
git clone https://github.com/mrmanna/immutable-object-builder.git
cd immutable-object-builder
