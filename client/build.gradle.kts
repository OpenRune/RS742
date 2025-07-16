group = "com.jagex"
version = "0.0.1"

plugins {
    application
    java
}


dependencies {
    implementation(project(":runelite"))


    val slf4j = "2.0.7"
    implementation("org.slf4j:slf4j-api:$slf4j")
    implementation("org.slf4j:slf4j-simple:$slf4j")


    implementation(group = "com.google.inject", name = "guice", version = "5.0.1")
    val lombok = module("org.projectlombok", "lombok", "1.18.26")
    compileOnly(lombok)
    annotationProcessor(lombok)
    testCompileOnly(lombok)
    testAnnotationProcessor(lombok)
}

tasks {

    named<JavaExec>("run") {
        enabled = false
        group = "hidden"
    }

    register<JavaExec>("Run-Normal") {
        group = "Runelite"
        description = "Run Runelite in Normal Mode"
        classpath = project.sourceSets.main.get().runtimeClasspath
        mainClass.set("Application")
    }

    register<JavaExec>("Run-Development") {
        group = "Runelite"
        description = "Run Runelite in Development Mode"
        enableAssertions = true
        args = listOf("--developer-mode")
        classpath = project.sourceSets.main.get().runtimeClasspath
        mainClass.set("Application")
    }


}
