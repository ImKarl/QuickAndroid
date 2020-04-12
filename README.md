[![](https://jitpack.io/v/imkarl/QuickAndroid.svg)](https://jitpack.io/#imkarl/QuickAndroid)

# QuickAndroid
一个快速、完善的Android开发框架整合实践


### [suspend]
- 项目结构急需重构，暂不建议使用
- 目前暂停维护，重点搭建新的项目结构
- 如果你在使用过程中有遇到任何问题，欢迎联系我


### QA项目简介
* 本框架QuickAndroid（以下简称：QA）尚处于开发阶段。
* 本项目的宗旨是：整合一个快速、完善的Android开发框架。

  > * 编译工具使用：Android Studio
  > * 编译环境：Android 7.0（API level 24）、gradle:2.1.3
  > * 最低支持版本：Android 3.0（API level 11）
  > * 项目编码采用；UTF-8
  > * 为避免重复造轮子，功能模块优先考虑现有的国内外成熟开源框架
  > * 框架本身尽量避免复写其它开源框架，以便跟随他们的版本升级


### QA使用说明
* QA是一套基于配置项管理的整合框架实践；
* 您可以根据自己的需求，方便的定制整合框架；
* QA在使用前，需要进行初始化，一般在Application中进行；
* QA的大部分功能，都可以通过QACore调用实现；
* QA内部抛出的异常，均为QAException的子类。


### QA工程目录
> * quickandroid   — 框架代码
> * sample         — 演示程序


### 引用库
* [fastjson](https://github.com/alibaba/fastjson) 高效的JSON处理器
* [greenDAO](https://github.com/greenrobot/greenDAO) 高效的轻量级ORM[SQLite]
* [android-weak-handler](https://github.com/badoo/android-weak-handler) 内存安全的Handler，防止内存泄漏
* [okhttp](https://github.com/square/okhttp) 支持HTTP和SPDY的网络请求库
* [universal-image-loader](https://github.com/nostra13/Android-Universal-Image-Loader) 高效的图片处理库


### How to

- Step 1. 把 JitPack repository 添加到build.gradle文件中 repositories的末尾:
```
repositories {
    maven { url "https://jitpack.io" }
}
```
- Step 2. 在你的app build.gradle 的 dependencies 中添加依赖
```
dependencies {
	compile 'com.github.imkarl:QuickAndroid:v0.2'
}
```

## ChangeLog

#### 0.2.0
- 升级工程编译工具版本
- 升级3D滚轮控件
- 完善字体大小自适应
- 微调选中项改变监听器


### 关于作者
* 作 者： imkarl
* Email： <imkarl@126.com>
* 有任何问题或建议，欢迎联系我...


请关注Github，以便随时了解最新动态
https://github.com/imkarl/QuickAndroid

