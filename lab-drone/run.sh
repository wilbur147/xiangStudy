#!/usr/bin/env bash
# 定义应用组名
group_name='xiang'
# 定义应用名称
app_name='drone-study'
# 定义应用版本
app_version='v1'
docker stop ${app_name}
echo '----stop container----'
docker rm ${app_name}
echo '----rm container----'
docker rmi ${group_name}/${app_name}:${app_version}
echo '----rm image----'
# 打包编译docker镜像
docker build -t ${group_name}/${app_name}:${app_version} .
echo '----build image----'
docker run -it -p 6003:6003 --name ${app_name} \
-d ${group_name}/${app_name}:${app_version}
echo '----start container----'
