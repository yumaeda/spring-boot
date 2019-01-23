# CentOS 7

## JDK
Before start playing with Spring Boot, you need to install JDK.

```bash
sudo yum -y install epel-release
sudo yum -y update
sudo yum -y install java-1.8.0-openjdk wget unzip
sudo yum install java-1.8.0-openjdk-devel
```

## Gradle Wrapper

### 1. Build
The first time you run the wrapper for a specified version of Gradle, it downloads and caches the Gradle binaries for that version. 

```bash
./gradlew build
```
### 2. Run

```bash
./gradlew run
```

## Gradle

### 1. Install

```bash
wget https://services.gradle.org/distributions/gradle-3.4.1-bin.zip
sudo mkdir /opt/gradle
sudo unzip -d /opt/gradle gradle-3.4.1-bin.zip
```

## 2. Set PATH
Open `~/.bashrc` and configure the PATH environment variable.

```bash
export PATH=$PATH:/opt/gradle/gradle-3.4.1/bin
```

## 3. Build

```bash
gradle build
```

## Etc

### 1. Show Contents of JAR

```bash
jar tvf build/libs/gs-gradle-0.1.0.jar
```

## Next
[Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
