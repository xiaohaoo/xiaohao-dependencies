buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        classpath("com.xiaohaoo:maven-publishing-gradle-plugin:1.0.2")
    }
}

plugins {
    `java-platform`
}

apply(plugin = "com.xiaohaoo.maven-publishing")

group = "com.xiaohaoo"
version = "1.0.1"


dependencies {
    constraints {
        api("com.xiaohaoo:cloud-storage-master:1.1.1")
        api("com.xiaohaoo:xiaohao-toolkit:1.0.6")
    }
}

javaPlatform {
    allowDependencies()
}


configure<com.xiaohaoo.gradle.plugin.MavenPublishingPluginExtension> {
    url.set("https://github.com/xiaohaoo/xiaohao-dependencies")
    description.set("Java依赖聚合项目")
    component.set("javaPlatform")
}