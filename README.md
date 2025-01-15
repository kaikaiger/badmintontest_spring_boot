# 羽球場地管理系統(Back-end)
一個使用 Spring Boot 開發後端(back-end)的羽球場地管理系統，透過CRUD提供場地租借和相關功能。

## 主要功能

場地管理（上午/下午時段）
租借者資訊管理
管理員帳號系統
區域場地查詢

## 架構

### 後端(運行於本地`http://localhost:8080`)
- Spring Boot
- Spring Data JPA
- Spring Data REST
- H2 Database

### 前端(運行於本地 `http://localhost:4200`)
- Angular 

## 資料

### Court (場地)
- id: 場地編號
- name: 場地名稱
- morning: 上午時段狀態
- afternoon: 下午時段狀態
- morningRenterId: 上午租借者ID
- afternoonRenterId: 下午租借者ID
- area: 場地區域

### Renter (租借者)
- id: 租借者編號
- renterName: 租借者姓名
- phone: 聯絡電話

### Manager (管理員)
- id: 管理員編號
- account: 帳號
- password: 密碼


## API 端點

### 場地管理
- GET `/courts`: 取得所有場地
- GET `/courts/{id}`: 透過id取得特定場地
- GET `/courts/search/findByArea?area={area}`: 透過區域搜尋場地
- POST `/courts`: 新增場地
- PUT `/courts/{id}`: 更新場地資訊
- DELETE `/courts/{id}`: 刪除場地

### 租借者管理
- GET `/renters`: 取得所有租借者
- GET `/renters/{id}`: 透過id取得特定租借者
- GET `/renters/search/findByPhone?phone={phone}`: 透過電話搜尋租借者
- POST `/renters`: 新增租借者
- PUT `/renters/{id}`: 更新租借者資訊
- DELETE `/renters/{id}`: 刪除租借者

### 管理員管理
- GET `/managers`: 取得所有管理員
- GET `/managers/{id}`: 透過id取得特定管理員
- POST `/managers`: 新增管理員
- PUT `/managers/{id}`: 更新管理員資訊
- DELETE `/managers/{id}`: 刪除管理員
  
## 系統需求
- Java 17 或以上
- Maven 3.9 或以上
