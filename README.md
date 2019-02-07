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

### A. Build & Run

```bash
./gradlew bootRun
```
### B. Build & Run

```bash
./gradlew build
./gradlew run
```

## Etc

### 1. Show Contents of JAR

```bash
jar tvf build/libs/xxx.jar
```

## Next
[Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)  

