FROM centos:centos7

MAINTAINER gaoweixuan

ADD ./jdk/jdk-8u202-linux-x64.tar.gz /usr/local/java

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

ENV LC_ALL=en_US.UTF-8
ENV LANG=en_US.UTF-8
ENV LANGUAGE=en_US.UTF-8

COPY ./fonts/* /usr/share/fonts/
COPY ./fonts/* /usr/local/java/jdk1.8.0_202/jre/lib/fonts/
COPY ./sap/sapjco3.jar /usr/local/java/jdk1.8.0_202/lib/sapjco3.jar
COPY ./sap/libsapjco3.so /usr/local/java/jdk1.8.0_202/jre/lib/amd64/server/libsapjco3.so

ENV TIME_ZONE Asia/Shangha
ENV JAVA_HOME /usr/local/java/jdk1.8.0_202
ENV JRE_HOME $JAVA_HOME/jre
ENV PATH $PATH:$HOME/bin:$JAVA_HOME/bin
ENV LD_LIBRARY_PATH $JRE_HOME/lib/amd64/server/
ENV CLASSPATH $JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib/sapjco3.jar
