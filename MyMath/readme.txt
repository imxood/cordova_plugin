#创建插件
plugman create --name MyMath --plugin_id SimpleMath --plugin_version 1.0.0

#进入插件目录
cd MyMath

#plugin.xml 增加Android平台
plugman platform add --platform_name android

#plugin.xml 增加iOS平台
plugman platform add --platform_name ios

#插件的目录结构
.
├── plugin.xml
├── readme.txt
├── src
│   └── android
│       └── MyMath.java
└── www
    └── MyMath.js

#生成一个 package.json，防止安装插件时出现: Error: Invalid Plugin! xxxxx needs a valid package.json
plugman createpackagejson .

#添加插件
cordova plugin add ../MyMath