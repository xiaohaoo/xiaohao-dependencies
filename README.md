# xiaohao-dependencies

Java依赖聚合项目，引入依赖时可以省略每个类库的版本号
##使用方法

- groovy

```groovy
implementation platform("com.xiaohaoo.dependencies:xiaohao-dependencies:1.0.0")
implementation "com.xiaohaoo:xiaohao-toolkit"
```

- kotlin

```kotlin
implementation(platform("com.xiaohaoo.dependencies:xiaohao-dependencies:1.0.0"))
implementation("com.xiaohaoo:xiaohao-toolkit")
```
