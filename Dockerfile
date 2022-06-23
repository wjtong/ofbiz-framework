FROM registry.cn-hangzhou.aliyuncs.com/dpbird/basecamp:Centos7.9_jdk8


ENV JAVA_HOME=/root/jdk1.8.0_231 \
    PATH=$PATH:$JAVA_HOME/bin \
    TZ=Asia/Shanghai  \
    LANG=en_US.UTF-8  \
    LANGUAGE=en_US:en  \
    LC_ALL=en_US.UTF-8

COPY ./ /root/ofbiz/

#ADD ./ /root/ofbiz
#ADD ./.gradle /root/.gradle
#ADD ofbiz_volume/.gradle  /root/ofbiz/.gradle
ADD ./startofbiz.sh /root/ofbiz/plugins/basecamp
#ADD GitInfo.ftl /root/ofbiz/runtime
RUN ["chmod", "+x", "/root/ofbiz/plugins/basecamp/startofbiz.sh"]

ENTRYPOINT ["/root/ofbiz/plugins/basecamp/startofbiz.sh"]