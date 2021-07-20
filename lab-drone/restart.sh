#!/usr/bin/env bash
# 定义应用组名
group_name='xiang'
# 定义应用名称
app_name='drone-study'

docker restart ${app_name}
echo '----restart container----'