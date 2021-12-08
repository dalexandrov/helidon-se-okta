# Helidon SE Hello

Minimal Helidon SE project suitable to start from scratch.

## Build and run

With JDK11+
```bash
mvn package -Pnative-image
./target/helidon
```

## Exercise the application

```
curl -X GET http://localhost:8080/hello
```