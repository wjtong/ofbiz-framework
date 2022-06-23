FROM centos:7.2.1511

ADD jdk1.8.0_231 /root/jdk1.8.0_231

ENV JAVA_HOME=/root/jdk1.8.0_231  \
    PATH=$PATH:$JAVA_HOME/bin  \
    TZ=Asia/Shanghai  \
    LANG=en_US.UTF-8  \
    LANGUAGE=en_US:en  \
    LC_ALL=en_US.UTF-8

#ADD ofbiz /root/ofbiz/  \
#    .gradle /root/.gradle/  \
#    startofbiz.sh /root/ofbiz/plugins/basecamp/  \
#    GitInfo.ftl /root/ofbiz/runtime/

ADD ./ /root/ofbiz
ADD ./.gradle /root/.gradle
#ADD ofbiz_volume/.gradle  /root/ofbiz/.gradle
ADD ./startofbiz.sh /root/ofbiz/plugins/basecamp
#ADD GitInfo.ftl /root/ofbiz/runtime
ENTRYPOINT ["/root/ofbiz/plugins/basecamp/startofbiz.sh"]