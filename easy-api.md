# MybatisPlusDemo

exported at 2023-04-04 11:49:49

## UserController

UserController


---
### getUserList

> BASIC

**Path:** queryUserList

**Method:** GET

> REQUEST



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
|  | array |  |
|  | object |  |
| &ensp;&ensp;&#124;─uid | integer |  |
| &ensp;&ensp;&#124;─username | string |  |
| &ensp;&ensp;&#124;─password | string |  |
| &ensp;&ensp;&#124;─isDelete | integer |  |
| &ensp;&ensp;&#124;─sex | string | PRIMARY :1 男<br>SECONDORY :2 女 |
| &ensp;&ensp;&#124;─tenantId | integer |  |

**Response Demo:**

```json
[
  {
    "uid": 0,
    "username": "",
    "password": "",
    "isDelete": 0,
    "sex": "",
    "tenantId": 0
  }
]
```





## BatchMybatisController

BatchMybatisController


---
### test

> BASIC

**Path:** /batchInsert

**Method:** GET

> REQUEST




---
### insert

> BASIC

**Path:** /insert

**Method:** POST

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| uid | integer |  |
| username | string |  |
| password | string |  |
| isDelete | integer |  |
| sex | string | PRIMARY :1 男<br>SECONDORY :2 女 |
| tenantId | integer |  |

**Request Demo:**

```json
{
  "uid": 0,
  "username": "",
  "password": "",
  "isDelete": 0,
  "sex": "",
  "tenantId": 0
}
```




---
### delete

> BASIC

**Path:** /delete

**Method:** GET

> REQUEST

**Query:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| id |  | NO |  |




---
### query

> BASIC

**Path:** /query

**Method:** GET

> REQUEST



> RESPONSE

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| content-type | application/json;charset=UTF-8 | NO |  |

**Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
|  | array |  |
|  | object |  |
| &ensp;&ensp;&#124;─uid | integer |  |
| &ensp;&ensp;&#124;─username | string |  |
| &ensp;&ensp;&#124;─password | string |  |
| &ensp;&ensp;&#124;─isDelete | integer |  |
| &ensp;&ensp;&#124;─sex | string | PRIMARY :1 男<br>SECONDORY :2 女 |
| &ensp;&ensp;&#124;─tenantId | integer |  |

**Response Demo:**

```json
[
  {
    "uid": 0,
    "username": "",
    "password": "",
    "isDelete": 0,
    "sex": "",
    "tenantId": 0
  }
]
```




---
### update

> BASIC

**Path:** /update

**Method:** POST

> REQUEST

**Headers:**

| name | value | required | desc |
| ------------ | ------------ | ------------ | ------------ |
| Content-Type | application/json | YES |  |

**Request Body:**

| name | type | desc |
| ------------ | ------------ | ------------ |
| uid | integer |  |
| username | string |  |
| password | string |  |
| isDelete | integer |  |
| sex | string | PRIMARY :1 男<br>SECONDORY :2 女 |
| tenantId | integer |  |

**Request Demo:**

```json
{
  "uid": 0,
  "username": "",
  "password": "",
  "isDelete": 0,
  "sex": "",
  "tenantId": 0
}
```





