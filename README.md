 <h1 align="center"><img  src="https://avatars2.githubusercontent.com/u/58407663?s=200&v=4" width="100"/></h1>

<h1 align="center">乐柯柯java接入SDK</h1>

<p align="center">
<a href="#"><img alt="JDK" src="https://img.shields.io/badge/JDK-1.8-yellow.svg?style=flat-square"/></a>
<a href="https://www.apache.org/licenses/LICENSE-2.0.html"><img alt="License" src="https://img.shields.io/badge/license-Apache%202-4EB1BA.svg"/></a>
</p>

# 简介

>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[乐柯柯](http://lkk.ccsn.cn/)是国内领先的第三方电商连接平台，由柯柯木信息技术有限公司创办， 乐柯柯致力于为 中国电商平台（销售链）以及供货商（供货链）提供“平台、渠道、用户”的销售解决方案。
作为国内首个电商连接平台，主要是打造产品生态链，每个电商平台都作为一个区块或一个账本，记录产品及关联商家。 目前，开放平台以“云+端”的形式向服务商和自助服务商提供发布线上产品、销售线上商品、发布线下产品、销售线下产品、发布爆款产品、销售爆款产品以及自助发布产品等多项服务。

# 平台介绍

- [业务介绍][1]
- [解决方案][2]
- [文档中心][3]

[1]: http://lkkopen.ccsn.cn/buscooperate.html
[2]: http://lkkopen.ccsn.cn/solutions.html
[3]: http://lkkopen.ccsn.cn/doccore.html

# 快速使用 

1. 在乐柯柯开放平台[注册][1]成功之后[申请应用][2]
2. 应用审批通过之后，添加对应的功能，并签约成功
3. 配置秘钥，设置接口加签方式
4. 使用SDK接入

[1]: http://open.ccsn.cn/login/reg
[2]: http://lkkopen.ccsn.cn/admin/appcore/add.html

# API文档

> 获取[API文档](http://lkkopen.ccsn.cn/doccore.html)

- 发布线上B2C商品API
- 发布线下O2O商品API
- 修改商品信息API
- 获取我的商品列表API
- 商品下架API
- 商品上架API
- 删除商品API
- 获取等待满单统计API
- 获取商品详细信息API
- 销售线上B2C商品API
- 销售线下O2O商品API
- 销售爆款商品API
- 获取商品类目列表API
- 统一下单API
- 订单发货API
- 订单核销API
- 订单确认API
- 商品订单API
- 销售订单API
- 订单详情API
- 商品查询开奖详情API
- 订单号查询中奖结果API
- 商品中奖列表API

# 下载

- [github下载][1]
- [jar包下载][2]

[1]: https://github.com/lkkccsncom/lkk-java-sdk/archive/master.zip
[2]: https://github.com/lkkccsncom/lkk-java-sdk/shop-sdk-0.0.1.jar

# 代码示例

```java
String serverUrl="http://api.ccsn.cn/server-system-test/api/region/getList";
CcsnClient client=new  DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);

RegionRequest request=new RegionRequest();
RegionModel model=new RegionModel();
model.setPcode("-1");
request.setBizModel(model);
try {
    RegionResponse response=client.execute(request);
    response.getRows();
    System.err.println(JSONObject.toJSONString(response));
    return response;
} catch (CcsnApiException e) {
    System.err.println("出现异常");
    e.printStackTrace();
    return null;
}
```

# 许可证

乐柯柯SDK使用 [Apache 2.0 license.](https://github.com/lkkccsncom/lkk-java-sdk/blob/master/LICENSE)  开源协议
