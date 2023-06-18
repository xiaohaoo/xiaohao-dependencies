
plugins {
    `java-platform`
    id("com.xiaohaoo.maven-publishing") version "1.0.1"
}

group = "com.xiaohaoo.dependencies"
version = "1.0.0"


dependencies {
    constraints {
        api("com.xiaohaoo.storage:cloud-storage-master:1.1.0")
        api("com.xiaohaoo.toolkit:xiaohao-toolkit:1.0.5")
    }
}

javaPlatform {
    allowDependencies()
}


xiaohaoMavenPublishing {
    url = "https://github.com/xiaohaoo/xiaohao-dependencies"
    description = "xiaohao Java依赖聚合项目"
    component = "javaPlatform"
}