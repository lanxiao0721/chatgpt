# 星辉工坊

Minecraft Java 1.21.1 · Forge

这是由方块工坊生成的源码工程，包含 1 个物品与 1 个方块。

## 构建

1. 安装 JDK 21 与 Gradle，或在 IntelliJ IDEA 中打开本项目并导入 Gradle。
2. 在项目目录运行 `gradle build`，也可在 IDE 的 Gradle 面板执行 build。
3. 在 build/libs 中找到成品 JAR，安装对应 Minecraft 版本的 Forge 后放入 mods 文件夹。

项目附有 GitHub Actions 构建工作流。将项目上传到 GitHub 后，可手动运行 Build Mod 并下载 JAR 构建产物。本站目前不会直接运行远程构建。

本工程不含 Gradle Wrapper；首次构建会下载 Minecraft 和模组依赖。复杂交互需要继续编写 Java 代码。
