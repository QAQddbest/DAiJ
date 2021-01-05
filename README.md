# Datastructures and Algorithms in Java

[![donate_wechat](https://img.shields.io/badge/Donate-Wechat-brightgreen)](docs/img/wechat.png) [![donate_alipay](https://img.shields.io/badge/Donate-AliPay-blue)](docs/img/alipay.jpg)

## Introduction

**Datastructures and Algorithms in Java**

In order to make full use of java, I try my utmost to implement the design patterns and design code structure.

Code's efficiency and concise are not guaranteed, except the sufficient notes.

```
                               
 ____    ______       _____    
/\  _`\ /\  _  \  __ /\___ \   
\ \ \/\ \ \ \L\ \/\_\\/__/\ \  
 \ \ \ \ \ \  __ \/\ \  _\ \ \ 
  \ \ \_\ \ \ \/\ \ \ \/\ \_\ \
   \ \____/\ \_\ \_\ \_\ \____/
    \/___/  \/_/\/_/\/_/\/___/ 
                               
```

> Attention: The [DAiJ](https://github.com/QAQddbest/DAiJ) is used for **educational purposes**, which means less efficiency than the standard library and should not directly be used in your works.

### Requirements

* JDK: 1.8
* Gradle: 6.x

## Thanks

Thanks to [TheAlgorithms/Java](https://github.com/TheAlgorithms/Java) in github.

I consult its structure, and some model.

## Example of `build.gradle.kts`

```kotlin
plugins {
    java
}

group = "daij"

version = "1.0.0"

repositories {
    jcenter()
}

dependencies {
    implementation(group = "org.jetbrains", name = "annotations", version = "20.1.0")
    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    testImplementation(project(":sorts"))
}

tasks.test {
    // Use junit platform for unit tests.
    useJUnitPlatform()
}
```
