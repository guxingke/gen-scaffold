# INTRO {{name}} 
{{info.desc}}

# Dir structure
- {{package}}
  - Application , bootstrap entrance
  - biz.{biz}
    - adapter/ , outer resource adapter
    - service/ , core biz logic
    - {biz}Config , module config
  - context
    - ContextConfig , app context module config
    - config/ , app context config files

# PRE
- os: unix*
- jdk1.8
- maven3.3+

# LOCAL RUN
```
make clean 
make build
make run-local

curl 'http://127.0.0.1:{{http-port}}/{{name}}/?input=ping'
-- ping

curl -XPOST -d'input=pong' '127.0.0.1:{{http-port}}/{{name}}/pong/'
-- pong

```

# DEV
## Some Convention
1. 所有模块需要有 moduleConfig. ref: ContextConfig.java
2. 所有模块的配置需要自行注册到启动类 Application, 避免使用大范围的自动扫描注册.

# REF
- spring-boot official doc

# NOTE