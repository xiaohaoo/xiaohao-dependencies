plugins {
    id("java-platform")
    id("maven-publish")
}

group = "com.xiaohaoo.dependencies"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    constraints {
       api ("com.xiaohaoo.storage:cloud-storage-master:1.1.0")
       api ("com.xiaohaoo.toolkit:xiaohao-toolkit:1.0.5")
  }
}



javaPlatform {
    allowDependencies()
}


publishing {
    publications {
        create<MavenPublication>("xiaohaoDependencies") {
            from(components["javaPlatform"])
        }
    }
}