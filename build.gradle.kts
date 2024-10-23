plugins {
    java
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
    id("jacoco")
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

allprojects {
    group = property("app.group").toString()
}

dependencyManagement {
    imports {
        mavenBom(libs.spring.cloud.dependencies.get().toString())
    }
}

dependencies {
    implementation(libs.spring.boot.starter.web)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
    annotationProcessor(libs.spring.boot.configuration.processor)
    testImplementation(libs.spring.boot.starter.test)
    implementation(libs.spring.boot.starter.data.jpa) // jpa
    //implementation(libs.h2)  // H2
    implementation(libs.mysql.connector)  // MySQL Connector 의존성 추가

    // SLF4J API 의존성 추가
    implementation 'org.slf4j:slf4j-api:2.0.9'

    // Logback 클래식 구현체 추가 (SLF4J와 함께 사용하는 로깅 구현체)
    implementation 'ch.qos.logback:logback-classic:1.4.11'

    // 다른 로깅 라이브러리가 있을 경우 충돌을 방지하기 위해 exclude 할 수 있습니다.
    // 특정 로깅 라이브러리를 제외하려면, 예를 들어 commons-logging 제거:
    // implementation ('org.some:some-dependency') {
    //     exclude group: 'commons-logging', module: 'commons-logging'
    // }

}

// about source and compilation
java {
    sourceCompatibility = JavaVersion.VERSION_17
}

with(extensions.getByType(JacocoPluginExtension::class.java)) {
    toolVersion = "0.8.7"
}

// bundling tasks
tasks.getByName("bootJar") {
    enabled = true
}
tasks.getByName("jar") {
    enabled = false
}
// test tasks
tasks.test {
    ignoreFailures = true
    useJUnitPlatform()
}