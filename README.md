# PAMS CLI

This is a simple command-line app for Lab Assignment 2b.

The app creates a list of patients, sorts them by age (oldest first), and saves the result to a JSON file.

## What This Project Uses

- Maven for build automation
- Git and GitHub for version control
- GitHub Actions for CI/CD
- Executable JAR for release

## Quick Start

1. Build the project:

```bash
mvn clean package
```

2. Run the app:

```bash
java -jar target/pams-cli-1.0-SNAPSHOT.jar
```

3. Check the output file:

- patients.json

## What the App Does

- Creates 5 Patient objects using the assignment data
- Calculates each patient age
- Sorts by age in descending order
- Writes formatted JSON to patients.json

## CI/CD

- CI workflow: .github/workflows/maven.yml
- Release workflow: .github/workflows/release.yml

When you push a tag like v1.0.1, GitHub Actions builds the app and publishes a release with the JAR.

## Submission

Submit this repository URL on Sakai:

https://github.com/adisalem/pams-cli
