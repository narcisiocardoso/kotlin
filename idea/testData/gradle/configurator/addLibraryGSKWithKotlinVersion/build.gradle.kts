val kotlin_version: String by extra
buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.30"
}
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.1.1"
}
dependencies {
    testCompile("junit:junit:4.12")
    compile(kotlinModule("stdlib-jre8", kotlin_version))
}