### 用户服务项目结构
+ micro-usercenter-entity: 本项目实体
+ micro-usercenter-service：本项目Service服务
+ micro-usercenter-service-api：本项目feignClient[声明时客户端]
+ micro-usercenter-web-api：本项目Web服务[提供给前端团队API]

### 请求地址说明

1. 【查询】
    + 地址：http://10.0.40.209/usercenter-srv/user/1 
    + Get 请求
    + 通过UserID获取一个用户的基本信息
2. 【新增】
    + http://10.0.40.209/usercenter-srv/user
    + Post请求
    + 请求样例：
    ```xml
     {
            "name": "王五",
            "mobile": "13622365488",
            "email": "13622365488@163.com"
        }
    ```
3. 【删除】
    + 地址：http://10.0.40.209/usercenter-srv/user/3
    + Delete 请求
4. 【更新】
    + 地址：http://10.0.40.209/usercenter-srv/user/2
    + Put请求
    + 请求样例
    ```xml
    {
                "name": "李四新",
                "mobile": "15622365488",
                "email": "15622365488@163.com"
            }
    ```   
    