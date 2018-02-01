#创建插件
plugman create --name BootStart --plugin_id BootStart --plugin_version 1.0.0

#进入插件目录
cd BootStart

#plugin.xml 增加Android平台
plugman platform add --platform_name android

#删除无关的目录
rm www -rf

#插件的目录结构
.
├── plugin.xml
├── readme.txt
├── src
│   └── android
│       └── BootStart.java

#生成一个 package.json，防止安装插件时出现: Error: Invalid Plugin! xxxxx needs a valid package.json
plugman createpackagejson .

#添加插件
cordova plugin add ../MyMath