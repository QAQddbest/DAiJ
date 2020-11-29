# Datastructures and Algorithms in Java

[![donate_wechat](https://img.shields.io/badge/Donate-Wechat-brightgreen)](./doc/img/wechat.png) [![donate_alipay](https://img.shields.io/badge/Donate-AliPay-blue)](./doc/img/alipay.jpg)

## Introduction

:crying:**HELP NEEDED**:crying:

**Datastructures and Algorithms in Java**

In order to make full use of java, I try my utmost to implement the design patterns and design code structure.

In the meanwhile, code's efficiency and concise are guaranteed, as well as the sufficient notes.

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

## Problems

Now I'm writing `Tree` datastructures, encountering many problems...

I have no idea how to extract the common interface, how to design the structure.

## Contribution

### Add feature

#### New module

When you want to add something branch new, you can add a new folder and make it a submodule in the root directory of the project.

Two steps are needed:
1. create a new folder with `build.gradle.kts` file(DAiJ use kotlin dsl instead of groovy for gradle) and `src` folder in java way.
2. add the module name into [`settings.gradle.kts`](./settings.gradle.kts) file.

> As for `build.gradle.kts`, you would better directly copy Example of `build.gradle.kts` below to it.

#### Existing module

After adding or modifying any code, test cases in junit5 are required.

In the meanwhile, `@NotNull` and `@NullAble` label are also wanted, which helps making the code get rid of NullPointerException (Maybe... XD)

### Requirements

* JDK: 1.8
* Gradle: 6.x

## Thanks

Thanks to [TheAlgorithms/Java](https://github.com/TheAlgorithms/Java) in github.

I consult it's structure(and only the structure, never the code), and [README.md](https://github.com/TheAlgorithms/Java/blob/master/README.md) file.

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

dependencies { // Do not add any other depency to the project
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
