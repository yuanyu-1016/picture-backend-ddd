<div align="center">

# 🖼️ Picture Backend DDD

**基于 DDD (领域驱动设计) 架构的高性能图片管理系统后端**

[![Java](https://img.shields.io/badge/Language-Java_100%25-blue.svg?style=for-the-badge&logo=java)](https://github.com/yuanyu-1016/picture-backend-ddd)
[![Maven](https://img.shields.io/badge/Build-Maven-C71A22.svg?style=for-the-badge&logo=apache-maven)](https://github.com/yuanyu-1016/picture-backend-ddd)
[![Architecture](https://img.shields.io/badge/Architecture-DDD-success.svg?style=for-the-badge)](https://github.com/yuanyu-1016/picture-backend-ddd)
[![Stars](https://img.shields.io/github/stars/yuanyu-1016/picture-backend-ddd?style=for-the-badge&color=yellow)](https://github.com/yuanyu-1016/picture-backend-ddd/stargazers)
[![Forks](https://img.shields.io/github/forks/yuanyu-1016/picture-backend-ddd?style=for-the-badge&color=orange)](https://github.com/yuanyu-1016/picture-backend-ddd/network/members)
[![Issues](https://img.shields.io/github/issues/yuanyu-1016/picture-backend-ddd?style=for-the-badge&color=red)](https://github.com/yuanyu-1016/picture-backend-ddd/issues)
[![License](https://img.shields.io/github/license/yuanyu-1016/picture-backend-ddd?style=for-the-badge&color=blue)](https://github.com/yuanyu-1016/picture-backend-ddd/blob/master/LICENSE)

[描述](#-描述) • [核心功能](#-核心功能) • [目录结构](#-目录结构) • [安装](#-安装) • [使用](#-使用) • [支持](#-支持) • [贡献](#-贡献) • [作者](#-作者)

</div>

---

## 📝 描述

**Picture Backend DDD** 是一个现代化的企业级图片管理系统的后端项目。

本项目深度实践了 **领域驱动设计 (Domain-Driven Design, DDD)** 架构思想，摒弃了传统 MVC 架构中业务逻辑臃肿、扩展性差的痛点。通过严格划分领域层、应用层、基础设施层与接口层，将核心的图片处理、存储与管理逻辑收敛于充血模型中。该架构不仅保证了系统的高内聚与低耦合，还大幅提升了代码的可读性与后期维护的敏捷性，非常适合应对复杂多变的图片资产管理业务场景。

> **🔗 配套前端项目**
> 本项目的前后端完全分离。如果您正在寻找该系统的用户交互界面与前端源码，请访问前端独立仓库：
> 👉 **[yuanyu-1016/picture-frontend](https://github.com/yuanyu-1016/picture-frontend)**

---

## 🎯 核心功能

本项目不仅是一次架构实践，更提供了一套完整的图片管理底层能力：

- **🖼️ 图片生命周期管理**：支持图片的批量上传、格式校验、检索、更新及软删除，并统一管理图片元数据（如尺寸、体积、标签等）。
- **☁️ 云端对象存储集成**：通过策略模式与基础设施层防腐，无缝对接第三方对象存储服务（如 Aliyun OSS, Tencent COS, MinIO 等）。
- **🔐 用户与权限隔离**：提供基础的用户认证机制，确保图片资产的安全性与数据隔离。
- **⚡ 高性能与扩展能力**：支持接入 Redis 进行热点数据缓存，大幅优化高频图片检索的响应速度。
- **🏗️ 纯粹的 DDD 落地**：业务逻辑与技术细节完全解耦，提供高内聚的充血领域模型，为二次开发提供绝佳的基础模板。

---

## 📂 目录结构

本项目严格遵循领域驱动设计 (DDD) 的四层架构规范，使得代码职责清晰、易于测试与重构：

```text
picture-backend-ddd/
├── src/main/java/com/yuanyu/picture/
│   ├── api/            # 接口层 (User Interface): 负责向外提供 RESTful API，处理 HTTP 请求与响应
│   ├── application/    # 应用层 (Application): 负责业务用例的编排与调度，控制事务，不包含核心业务逻辑
│   ├── domain/         # 领域层 (Domain): 核心层，包含聚合根、实体、值对象、领域服务及仓储(Repository)接口
│   ├── infrastructure/ # 基础设施层 (Infrastructure): 负责数据库访问(持久化)、缓存、OSS对接等具体技术细节的实现
│   └── PictureApplication.java # Spring Boot 启动类
├── src/main/resources/
│   ├── application.yml # 全局配置文件 (数据库、OSS、Redis等环境配置)
│   └── mapper/         # MyBatis / MyBatis-Plus Mapper XML 文件
├── sql/                # 数据库初始化脚本与表结构设计
└── pom.xml             # Maven 依赖与构建配置
```

---

## ⚙️ 安装

在开始运行该项目之前，请确保您的开发环境已安装以下依赖：

- **JDK**: 1.8 或更高版本 (推荐 JDK 11 / 17)
- **Maven**: 3.6.x 或更高版本
- **数据库**: MySQL 8.0+ 

### 获取项目

1. 克隆本仓库到本地环境：
   ```bash
   git clone [https://github.com/yuanyu-1016/picture-backend-ddd.git](https://github.com/yuanyu-1016/picture-backend-ddd.git)
   ```

2. 进入项目目录：
   ```bash
   cd picture-backend-ddd
   ```

3. 使用 Maven 导入并下载依赖：
   ```bash
   mvn clean install
   ```

---

## 🚀 使用

1. **环境配置**：
   在 `src/main/resources` 目录下，找到并修改 `application.yml`，配置您的 MySQL 数据库连接、OSS 密钥及其他必要参数。

2. **数据库初始化**：
   执行 `sql` 目录下提供的建表脚本，初始化系统的基础数据结构。

3. **启动服务**：
   找到系统的主启动类 `PictureApplication`，执行 `main` 方法，或者通过以下命令启动：
   ```bash
   mvn spring-boot:run
   ```

4. **API 调试**：
   服务启动后，可以通过 Postman 或自带的 API 文档（如配置了 Swagger/Knife4j）直接调试图片上传、检索等核心接口。

---

## 🛠️ 支持

如果您在使用或部署过程中遇到任何问题，或者有关于 DDD 架构落地的探讨，欢迎通过以下方式获取支持：

- 在本项目的 [Issues 页面](https://github.com/yuanyu-1016/picture-backend-ddd/issues) 提交问题报告。
- 搜索已关闭的 Issue 寻找历史解决方案。
- 提交功能请求 (Feature Request) 或 Bug 反馈。

---

## 🤝 贡献

开源的魅力在于协作。如果您对改进这个基于 DDD 的图片后端系统有兴趣，我们非常欢迎您的代码提交！

1. Fork 本仓库。
2. 创建您的特性分支：`git checkout -b feature/AmazingFeature`
3. 提交您的更改：`git commit -m 'Add some AmazingFeature'`
4. 推送至该分支：`git push origin feature/AmazingFeature`
5. 开启一个 Pull Request (PR)。

**代码规范说明**：提交代码时，请确保符合项目整体的 DDD 目录规范，避免将业务逻辑泄露到基础设施层或接口层。

---

## 👨‍💻 作者

**何元玉 (@yuanyu-1016)**

- **GitHub**: [https://github.com/yuanyu-1016](https://github.com/yuanyu-1016)
- **专注领域**: AI 应用开发开发、Java 研发、复杂系统架构设计

---

## 📄 认证

本项目采用 [MIT License](https://opensource.org/licenses/MIT) 进行开源认证。详细信息请参阅项目根目录下的 `LICENSE` 文件。

> **免责声明**：使用本项目的源码时，请遵循相关开源协议，保留原作者的版权声明。

---
<p align="center">
  <i>如果这个项目对您的开发或 DDD 学习有帮助，请给一个 ⭐️ 鼓励一下！</i>
</p>
