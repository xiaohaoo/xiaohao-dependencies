plugins {
    `java-platform`
    id("com.xiaohaoo.maven-publishing") version "1.0.1"
}

//apply(plugin = "com.xiaohaoo.maven-publishing")

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
    url = "https://github.com/xiaohaoo/maven-publishing-gradle-plugin"
    description = "发布到maven仓库的gradle插件"
    component = "javaPlatform"
}