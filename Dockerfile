FROM registry.cn-hangzhou.aliyuncs.com/dpbird/basecamp:Centos7.9_jdk8

ARG branch

ARG tag_ID

ARG source_Name

ENV JAVA_HOME=/root/jdk1.8.0_231 \
    PATH=$PATH:$JAVA_HOME/bin \
    TZ=Asia/Shanghai  \
    LANG=en_US.UTF-8  \
    LANGUAGE=en_US:en  \
    LC_ALL=en_US.UTF-8

COPY ./ /root/ofbiz/

RUN ["chmod", "+x", "/root/ofbiz/startofbiz.sh"]

ENTRYPOINT ["/root/ofbiz/startofbiz.sh"]