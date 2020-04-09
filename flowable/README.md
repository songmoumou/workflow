
  
 #flowable
 ##项目说明
 本项目包含一个报销流程demo，和流程编辑器
 其中，报销流程主要内容
 (1)processes下流程定义模板
 (2)业务流程controller ExpenseController
 (3)业务流程处理器 BossTaskHandler和ManagerTaskHandler

 ## 访问地址
 http://localhost:8080/expense/
 注：本项目将modeler全部放到static下，访问上述路径自动找index.html
  
  
 #### 参考项目
  项目地址：https://gitee.com/gb_90/springboot-flowable-modeler
  项目文档：https://blog.csdn.net/weixin_40816738/article/details/102881983
 #### 测试路径
 
 * 提交流程： 
 http://localhost:8080/expense/expense/add?userId=123&money=123321
 * 查询列表
 http://localhost:8080/expense/expense/list?userId=123
 * 使用流程
 http://localhost:8080/expense/expense/apply?taskId=816c7187-7a33-11ea-a320-68071531c8ac
 注:taskId为查询中的taskId
 * 生成流程图
  http://localhost:8080/expense/expense/processDiagram?processId=2b29876c-fde9-11e9-b75f-f8a2d6bfea5a
 
 
 ## 参考文档
  * 集成文档
  https://www.cnblogs.com/yangjiming/p/10944120.html
  https://www.cnblogs.com/liuwenjun/p/10291210.html
  https://blog.csdn.net/oooLei/article/details/88554797
  * 学习文档
  https://blog.csdn.net/zhongzk69/article/details/90735864  
  https://blog.csdn.net/houyj1986/article/details/85377377
  
  * 错误汇总
 
    1. 新增模型报错 No message available
  https://blog.csdn.net/xljx_1/article/details/105320252
    2. Consider defining a bean of type 'org.mybatis.spring.SqlSessionTemplate'
  https://blog.csdn.net/cjiankai/article/details/99304005

* flowable表简要说明
  https://www.cnblogs.com/xiohao/p/11446622.html