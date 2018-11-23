plugins {
    java
    id("com.google.cloud.tools.jib") version "0.10.0"
}

sourceSets.main {
    output.dir(file("src/main/not/exists"))
}

jib.from.image = "openjdk:11-slim"
