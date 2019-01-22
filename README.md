# CentOS 7

## 1. Install JDK

```bash
sudo yum -y install epel-release
sudo yum -y update
sudo yum -y install java-1.8.0-openjdk wget unzip
sudo yum install java-1.8.0-openjdk-devel
```

## 2. Install Gradle

```bash
wget https://services.gradle.org/distributions/gradle-3.4.1-bin.zip
sudo mkdir /opt/gradle
sudo unzip -d /opt/gradle gradle-3.4.1-bin.zip
```
## 3. Set PATH
Open `~/.bashrc` and configure the PATH environment variable.

```bash
export PATH=$PATH:/opt/gradle/gradle-3.4.1/bin
```

## 4. Build with Gradle

```bash
gradle build
```

## 5. References
[Building Java Projects with Gradle](https://spring.io/guides/gs/gradle/)
